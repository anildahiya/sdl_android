package com.smartdevicelink.service.streaming;

import com.smartdevicelink.protocol.ProtocolMessage;

public interface IStreamListener {
	void sendStreamPacket(ProtocolMessage pm);
}
