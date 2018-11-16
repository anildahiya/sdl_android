package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

import java.util.Hashtable;

public class CloseApplication extends RPCRequest {

    /**
     * Constructs a new CloseApplication object
     */
    public CloseApplication() {
        super(FunctionID.CLOSE_APPLICATION.toString());
    }

    /**
     * Constructs a new CloseApplication object indicated by the Hashtable
     * parameter
     * <p></p>
     *
     * @param hash The Hashtable to use
     */
    public CloseApplication(Hashtable<String, Object> hash) {
        super(hash);
    }
}
