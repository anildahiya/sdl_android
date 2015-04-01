package com.smartdevicelink.transport;
import java.io.Serializable;
/**
 * Container of Bluetooth transport specific configuration.
 */
public final class BTTransportConfig extends BaseTransportConfig implements Serializable {

	private static final long serialVersionUID = -8616926941308142391L;
	private boolean bKeepSocketActive = true;
	
	/**
	 * Overridden abstract method which returns specific type of this transport configuration.
	 * 
	 * @return Constant value TransportType.BLUETOOTH. 
	 * 
	 * @see TransportType
	 */
	public TransportType getTransportType() {
		return TransportType.BLUETOOTH;
	}
	
	public BTTransportConfig() {
		this(true);
	}
		 
	public BTTransportConfig(boolean shareConnection) {
		super.shareConnection = shareConnection;
	}	
	
	public void setKeepSocketActive(boolean bValue) {
		bKeepSocketActive = bValue;
	}
	
	public boolean getKeepSocketActive() {
		return bKeepSocketActive;
	}	
	
}
