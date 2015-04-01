package com.smartdevicelink.service.sdlConnection;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import com.smartdevicelink.applinkservmgr.R;
import com.smartdevicelink.applinkservmgr.activity.MainActivity;
import com.smartdevicelink.exception.SdlException;
import com.smartdevicelink.protocol.ProtocolMessage;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.protocol.enums.MessageType;
import com.smartdevicelink.protocol.enums.SessionType;
import com.smartdevicelink.service.marshal.JsonRPCMarshaller;
import com.smartdevicelink.service.proxy.RPCRequestFactory;
import com.smartdevicelink.service.proxy.rpc.UnregisterAppInterface;
import com.smartdevicelink.transport.BaseTransportConfig;
import com.smartdevicelink.transport.TransportType;
import com.smartdevicelink.transport.USBTransportConfig;

public class MessengerService extends Service implements ISdlConnectionListener  {
		
	 public static final int START = 0; 
	 public static final int STOP = 1;
	 public static final int MSG_START_SESSION_REQUEST = 2;
	 public static final int MSG_START_SESSION_RESPONSE = 3;
	 public static final int MSG_SEND_RPC_REQUEST = 4;
	 public static final int MSG_SEND_RPC_RESPONSE = 5;
	 public static final int MSG_SEND_ON_TRANSPORT_ERROR = 6;	
	 public static final int MSG_SEND_ON_TRANSPORT_DISCONNECT = 7;
	 public static final int MSG_SESSION_UUID = 8;
	 public static final int MSG_SESSION_RESET_CONNECTION = 9;
	 public static final int MSG_SESSION_CLOSE_SESSION = 10;
	 public static final int MSG_TP = 1000;
	 
	 private byte PROTO_VER_ONE = 1;
	 private byte lastProtoVersion = 1;
	 public static SdlSession _sdlSession = null;
	 //public SyncConnection _sdlConnection = null;
	 public ISdlConnectionListener listener = this;	 
	 MessengerService myInstance = this;	 
	 Messenger replyToMessenger = null; 
	 CopyOnWriteArrayList<SdlSession> sessionList = new CopyOnWriteArrayList<SdlSession>();
	 /**
     * Handler of incoming messages from clients.
     */
	 
	 Message msgStartSessionAck = null;
	 
	 
		@Override
		public int onStartCommand(Intent intent, int flags, int startId) {
			
    		handler.postDelayed(runnable, 100);
    		
			Intent i=new Intent(getApplicationContext(), MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_SINGLE_TOP);

			PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
	        
    		
			Notification note = new Notification.Builder(getApplicationContext())
			.setContentTitle("AppLink Service Manager")
			.setContentText("Ready for connections")
			.setSmallIcon(R.drawable.ic_launcher)
			.setContentIntent(pi)
			.getNotification();
    		
    		
            startForeground( 451721, note );			
			
			
			return START_STICKY;
		}
	 
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
        	
        	switch (msg.what) {
            
            	case START:
            		handler.postDelayed(runnable, 100);
            		startService( new Intent( getApplicationContext(), MessengerService.class ) );
            		
        			Intent i=new Intent(getApplicationContext(), MainActivity.class);
        			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_SINGLE_TOP);

        			PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
        	        
            		
        			Notification note = new Notification.Builder(getApplicationContext())
					.setContentTitle("AppLink Service Manager")
					.setContentText("Ready for connections")
					.setSmallIcon(R.drawable.ic_launcher)
					.setContentIntent(pi)
					.getNotification();
            		
            		
                    startForeground( 451721, note );
                                        
                    break;
            
                case STOP: 
                	stopForeground( true );
                    stopSelf();                	
                    break;             
                case MSG_START_SESSION_REQUEST:
                	performStartSession(msg);
                	break;
                case MSG_SEND_RPC_REQUEST:                	
                	ProtocolMessage proto = (ProtocolMessage) msg.getData().getSerializable("key");
                	UUID sessionUUID = (UUID)msg.getData().getSerializable("sessionUUID"); 
                	SdlSession theSession = findSessionByUUID(sessionUUID);
                	if (theSession == null) 
                		return;
                	proto.setSessionID(theSession.getSessionId());
                	theSession.sendMessage(proto);
                	break;
                case MSG_SESSION_RESET_CONNECTION:
                	sessionUUID = (UUID)msg.getData().getSerializable("sessionUUID"); 
                	theSession = findSessionByUUID(sessionUUID);
                	if (theSession == null) 
                		return;
                	reInitSession(theSession);
                	break;  
                case MSG_SESSION_CLOSE_SESSION:
                	sessionUUID = (UUID)msg.getData().getSerializable("sessionUUID"); 
                	theSession = findSessionByUUID(sessionUUID);
                	if (theSession == null) 
                		return;
                	closeSession(theSession);
                	break;                 	
                	
                default:
                    super.handleMessage(msg);
            }
        }
        private void performStartSession(Message msg)
        {
			try {
				BaseTransportConfig _transportConfig = (BaseTransportConfig)msg.getData().getSerializable("transportConfig");					
				if (_transportConfig.getTransportType().equals(TransportType.USB))
				{
					USBTransportConfig _usbtransportConfig = (USBTransportConfig) _transportConfig;
					_usbtransportConfig.setUSBContext(myInstance);
				}
				
				if (lastProtoVersion < 2)					
					_transportConfig.shareConnection = false;
				else
					_transportConfig.shareConnection = true;
								
				_sdlSession = SdlSession.createSession(PROTO_VER_ONE,listener, _transportConfig, msg.replyTo);	
				sessionList.add(_sdlSession);
				_sdlSession.startSession();
							
    	        Message msgRespond = Message.obtain(null, MessengerService.MSG_SESSION_UUID, 0, 0);                	
                Bundle bun = new Bundle();
                bun.putSerializable("sessionUUID",  _sdlSession.sessionUUID);                   
    	        msgRespond.setData(bun);                	
				try {
					msg.replyTo.send(msgRespond);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}					
				
			} catch (SdlException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
    }	
    
    
	public SdlSession findSessionByUUID(UUID sessionUUID) {
		for (SdlSession listener : sessionList) {
			if (listener.sessionUUID.equals(sessionUUID)) {
				return listener;
			}
		}
		return null;
	}
	    
    /**
     * Target we publish for clients to send messages to IncomingHandler.
     */
    final Messenger mMessenger = new Messenger(new IncomingHandler());
     
    private Runnable runnable = new Runnable() {
    	   @Override
    	   public void run() {
    		   
	    		   for (SdlSession s : sessionList) 
	    		   {
		    		   if (s != null)
		    		   {
		    		        Message msger = Message.obtain(null, MessengerService.MSG_TP, 0, 0);
		    		        msger.replyTo = mMessenger;
		    		        try {
								s.myMessenger.send(msger);
							} catch (RemoteException e) {

								UnregisterAppInterface msg = 
										RPCRequestFactory.buildUnregisterAppInterface(2364);								
								
								byte[] msgBytes = JsonRPCMarshaller.marshall(msg, (byte)0x02);
								
								ProtocolMessage pm = new ProtocolMessage();
								pm.setData(msgBytes);
								
								pm.setSessionID(s.getSessionId());
								pm.setMessageType(MessageType.RPC);
								pm.setSessionType(SessionType.RPC);
								pm.setFunctionID(FunctionID.getFunctionID(msg.getFunctionName()));
								pm.setCorrID(msg.getCorrelationID());								
								
								s.sendMessage(pm);
			                	
								sessionList.remove(s);			                	
			                	
								closeSession(s);								
								
								e.printStackTrace();
							}
		    		   }
	    		   }
    		  
    	      handler.postDelayed(this, 100);
    	   }
    };
    
    private Handler handler = new Handler();    
    
    public synchronized void closeSession(SdlSession theSession)
    {    	
    	try {
    		sessionList.remove(theSession);
			theSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    public synchronized void reInitSession(SdlSession theSession)
    {
    	theSession.sessionId = 0;
    	try {
			theSession.close();
    		theSession.startSession();
		} catch (SdlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	@Override
	public IBinder onBind(Intent arg0) {
		return mMessenger.getBinder();
	}
		
	
	private void resetVersion()
	{
		lastProtoVersion = 1;
	}
	
	@Override
	public void onTransportDisconnected(String info, byte sessionID, SdlConnection sdlConnection) {

		resetVersion();
		
    	if (sdlConnection == null) 
    		return;
    	SdlSession theSession = sdlConnection.findSessionById(sessionID); 
		closeSession(theSession);		
		// Create and send a message to the service, using a supported 'what' value
        Message msger = Message.obtain(null, MessengerService.MSG_SEND_ON_TRANSPORT_DISCONNECT, 0, 0);
        msger.replyTo = mMessenger;		        
        //Send data as a String
        Bundle b = new Bundle();
        b.putString("info", info);
        
        msger.setData(b);
        try {
        	theSession = sdlConnection.findSessionById(sessionID); 
        	theSession.myMessenger.send(msger);
        } catch (RemoteException ex) {
            ex.printStackTrace();	
        }		
	}


	@Override
	public void onTransportError(String info, Exception e, byte sessionID, SdlConnection sdlConnection) {
		resetVersion();
		
		if (sdlConnection == null) 
    		return;
    	SdlSession theSession = sdlConnection.findSessionById(sessionID); 
    	if (theSession == null)
    		return;
    	closeSession(theSession);
    			
		// Create and send a message to the service, using a supported 'what' value
        Message msger = Message.obtain(null, MessengerService.MSG_SEND_ON_TRANSPORT_ERROR, 0, 0);
        msger.replyTo = mMessenger;		        
        //Send data as a String
        Bundle b = new Bundle();
        b.putString("info", info);
        b.putSerializable("exception", e);
        
        msger.setData(b);
        try {
        	theSession.myMessenger.send(msger);
        } catch (RemoteException ex) {
            ex.printStackTrace();	
        }
        closeSession(theSession);
		
	}

	@Override
	public void onProtocolMessageReceived(ProtocolMessage msg, SdlConnection sdlConnection) {
		
		// Create and send a message to the service, using a supported 'what' value
        Message msger = Message.obtain(null, MessengerService.MSG_SEND_RPC_RESPONSE, 0, 0);
        msger.replyTo = mMessenger;		        
        //Send data as a String
        Bundle b = new Bundle();
        b.putSerializable("key", msg);
        
        msger.setData(b);			        
        try {
        	if (sdlConnection == null) 
        		return;
        	SdlSession theSession = sdlConnection.findSessionById(msg.getSessionID()); 
        	theSession.myMessenger.send(msger);
        } catch (RemoteException e) {
            e.printStackTrace();	
        }                
	}


	@Override
	public void onProtocolSessionNACKed(SessionType sessionType,byte sessionID, byte version, String correlationID, SdlConnection sdlConnection) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void onProtocolSessionStarted(SessionType sessionType,
			byte sessionID, byte version, String correlationID, SdlConnection sdlConnection) {

		lastProtoVersion = version;
		
		SdlConnection theConnection = sdlConnection;
    	if (theConnection == null) 
    		return;
    	SdlSession theSession = theConnection.findSessionById(sessionID);
    	if (theSession == null) 
    		return;
    	
    	if (version > 1)
    	{
    		if (!theSession.transportConfig.shareConnection)
    			theSession.transportConfig.shareConnection = true;
    		if (!SdlSession.shareConnections.contains(theConnection))
    			SdlSession.shareConnections.add(theConnection);
    	}

        Message msg = Message.obtain(null, MessengerService.MSG_START_SESSION_RESPONSE, sessionID, 0);

        Bundle b = new Bundle();
        b.putByte("sessionType",sessionType.value());
        b.putByte("sessionID",sessionID);
        b.putByte("version", version);
        b.putString("correlationID", correlationID);        
        msg.setData(b);
        
        try {
        	theSession.myMessenger.send(msg);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void onProtocolSessionEnded(SessionType sessionType, byte sessionID,	String correlationID, SdlConnection sdlConnection) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProtocolError(String info, Exception e, SdlConnection sdlConnection) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onHeartbeatTimedOut(byte sessionID) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTransportError(String info, Exception e, SdlConnection sdlConnection) {
		resetVersion();
		
	}


	@Override
	public void onTransportDisconnected(String info, SdlConnection sdlConnection) {
		resetVersion();
		
	}

}
