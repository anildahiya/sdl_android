package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.Result;

import java.util.Hashtable;

/**
 * ShowAppMenu Response is sent, when ShowAppMenu has been called.
 */
public class ShowAppMenuResponse extends RPCResponse {

    /** Constructs a new ShowAppMenuResponse object
     *
     */
    public ShowAppMenuResponse() {
        super(FunctionID.SHOW_APP_MENU.toString());
    }

    /**
     * Constructs a new ShowAppMenuResponse object indicated by the Hashtable
     * parameter
     * <p></p>
     *
     * @param hash
     *            The Hashtable to use
     */
    public ShowAppMenuResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new ShowAppMenuResponse object
     * @param success whether the request is successfully processed
     * @param resultCode whether the request is successfully processed
     */
    public ShowAppMenuResponse(@NonNull Boolean success, @NonNull Result resultCode) {
        this();
        setSuccess(success);
        setResultCode(resultCode);
    }
}