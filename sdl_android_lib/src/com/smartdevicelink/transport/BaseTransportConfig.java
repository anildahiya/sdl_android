package com.smartdevicelink.transport;
import java.io.Serializable;
/**
 * Defines base abstract class for transport configurations.
 */
public abstract class BaseTransportConfig implements Serializable {
	
	private static final long serialVersionUID = -6141108818367355540L;
	public boolean shareConnection = true;
	protected int iHeartBeatTimeout = Integer.MAX_VALUE;
	/**
	 * Gets transport type for this transport configuration.
	 * 
	 * @return One of {@link TransportType} enumeration values that represents type of this transport configuration.
	 */
	public abstract TransportType getTransportType();	
	
	/**
	 * Indicate whether the application want to share connection with others.
	 * 
	 * @return
	 */
	public boolean shareConnection() {
		return shareConnection;
	}
	
	public int getHeartBeatTimeout() {
		return iHeartBeatTimeout;
	}		
	
	public void setHeartBeatTimeout(int iTimeout) {
		iHeartBeatTimeout = iTimeout;
	}	
}
