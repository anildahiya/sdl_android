package com.smartdevicelink.service.sdlConnection;

import com.smartdevicelink.protocol.ProtocolMessage;
import com.smartdevicelink.protocol.enums.SessionType;

public interface ISdlConnectionListener {
	public void onTransportDisconnected(String info, SdlConnection sdlConnection);
	
	public void onTransportDisconnected(String info, byte sessionID, SdlConnection sdlConnection);
	
	public void onTransportError(String info, Exception e, byte sessionID, SdlConnection sdlConnection);
	
	public void onTransportError(String info, Exception e, SdlConnection sdlConnection);
	
	public void onProtocolMessageReceived(ProtocolMessage msg, SdlConnection sdlConnection);
	
	public void onProtocolSessionNACKed(SessionType sessionType,byte sessionID, byte version, String correlationID, SdlConnection sdlConnection);	
	
	public void onProtocolSessionStarted(SessionType sessionType,byte sessionID, byte version, String correlationID, SdlConnection sdlConnection);
	
	public void onProtocolSessionEnded(SessionType sessionType,byte sessionID, String correlationID, SdlConnection sdlConnection);
	
	public void onProtocolError(String info, Exception e, SdlConnection sdlConnection);
	
	public void onHeartbeatTimedOut(byte sessionID);	
}
