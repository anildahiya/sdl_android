package com.smartdevicelink.service.proxy;
import com.smartdevicelink.service.proxy.rpc.UnregisterAppInterface;

public class RPCRequestFactory {

	public static final int SDL_MSG_MAJOR_VERSION = 1;
	public static final int SDL_MSG_MINOR_VERSION = 0;

	public static UnregisterAppInterface buildUnregisterAppInterface(
			Integer correlationID) {
		UnregisterAppInterface msg = new UnregisterAppInterface();
		msg.setCorrelationID(correlationID);

		return msg;
	}
}
