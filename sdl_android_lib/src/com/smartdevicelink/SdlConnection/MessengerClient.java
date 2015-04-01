package com.smartdevicelink.SdlConnection;

public class MessengerClient {
	
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
	public static final int MSG_SESSION_RECONNECTION = 11;
	public static final int MSG_TP = 1000;
	 
}
