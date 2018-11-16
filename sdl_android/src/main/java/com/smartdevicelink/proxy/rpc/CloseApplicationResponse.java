package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.Result;

import java.util.Hashtable;

/**
 * CloseApplication Response is sent, when CloseApplication has been called.
 */
public class CloseApplicationResponse extends RPCResponse {

    /** Constructs a new CloseApplicationResponse object
     *
     */
    public CloseApplicationResponse() {
        super(FunctionID.CLOSE_APPLICATION.toString());
    }

    /**
     * <p>Constructs a new CloseApplicationResponse object indicated by the Hashtable
     * parameter</p>
     *
     *
     * @param hash
     *            The Hashtable to use
     */
    public CloseApplicationResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new CloseApplicationResponse object
     * @param success whether the request is successfully processed
     * @param resultCode whether the request is successfully processed
     */
    public CloseApplicationResponse(@NonNull Boolean success, @NonNull Result resultCode) {
        this();
        setSuccess(success);
        setResultCode(resultCode);
    }
}