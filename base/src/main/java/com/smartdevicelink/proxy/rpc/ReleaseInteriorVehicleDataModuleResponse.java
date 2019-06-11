package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.Result;
import java.util.Hashtable;

public class ReleaseInteriorVehicleDataModuleResponse extends RPCResponse {

    /**
     * Constructs a new ReleaseInteriorVehicleDataModuleResponse object
     */
    public ReleaseInteriorVehicleDataModuleResponse() {
        super(FunctionID.RELEASE_INTERIOR_VEHICLE_DATA_MODULE.toString());
    }

    /**
     * Constructs a new ReleaseInteriorVehicleDataModuleResponse object indicated by the Hashtable
     * parameter
     *
     * @param hash The Hashtable to use
     */
    public ReleaseInteriorVehicleDataModuleResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new ReleaseInteriorVehicleDataModuleResponse object
     *
     * @param success    whether the request is successfully processed
     * @param resultCode whether the request is successfully processed
     */
    public ReleaseInteriorVehicleDataModuleResponse(@NonNull Boolean success, @NonNull Result resultCode) {
        this();
        setSuccess(success);
        setResultCode(resultCode);
    }
}