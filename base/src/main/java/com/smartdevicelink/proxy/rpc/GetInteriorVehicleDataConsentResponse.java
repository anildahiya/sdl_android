package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.Result;
import java.util.Hashtable;
import java.util.List;

public class GetInteriorVehicleDataConsentResponse extends RPCResponse {
    public static final String KEY_ALLOWED = "allowed";

    /**
     * Constructs a new GetInteriorVehicleDataConsentResponse object
     */
    public GetInteriorVehicleDataConsentResponse() {
        super(FunctionID.GET_INTERIOR_VEHICLE_DATA_CONSENT.toString());
    }

    /**
     * <p>Constructs a new GetInteriorVehicleDataConsentResponse object indicated by the
     * Hashtable parameter</p>
     *
     * @param hash The Hashtable to use
     */
    public GetInteriorVehicleDataConsentResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new GetInteriorVehicleDataConsentResponse object
     *
     * @param allowed    This array has the same size as "moduleIds" in the request; each element corresponding to one moduleId
     * @param resultCode whether the request is successfully processed
     * @param success    whether the request is successfully processed
     */
    public GetInteriorVehicleDataConsentResponse(@NonNull List<Boolean> allowed, @NonNull Result resultCode, @NonNull Boolean success) {
        this();
        setAllowed(allowed);
        setResultCode(resultCode);
        setSuccess(success);
    }

    /**
     * Gets the allowed parameter of GetInteriorVehicleDataConsentResponse
     *
     * @return List<Boolean> - This array has the same size as "moduleIds" in the request; each element corresponding to one moduleId
     * "true" - if SDL grants the permission for the requested module;
     * "false" - SDL denies the permission for the requested module.
     */
    @SuppressWarnings("unchecked")
    public List<Boolean> getAllowed() {
        return (List<Boolean>) getObject(Boolean.class, KEY_ALLOWED);
    }

    /**
     * Sets the allowed parameter of GetInteriorVehicleDataConsentResponse
     *
     * @param allowed This array has the same size as "moduleIds" in the request; each element corresponding to one moduleId
     *                "true" - if SDL grants the permission for the requested module;
     *                "false" - SDL denies the permission for the requested module.
     */
    public void setAllowed(@NonNull List<Boolean> allowed) {
        setParameters(KEY_ALLOWED, allowed);
    }
}
