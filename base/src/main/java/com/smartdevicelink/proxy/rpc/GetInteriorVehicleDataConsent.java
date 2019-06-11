package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import com.smartdevicelink.proxy.rpc.enums.ModuleType;
import java.util.Hashtable;
import java.util.List;

public class GetInteriorVehicleDataConsent extends RPCRequest {
    public static final String KEY_MODULE_TYPE = "moduleType";
    public static final String KEY_MODULE_IDS = "moduleIds";

    /**
     * Constructs a new GetInteriorVehicleDataConsent object
     */
    public GetInteriorVehicleDataConsent() {
        super(FunctionID.GET_INTERIOR_VEHICLE_DATA_CONSENT.toString());
    }

    /**
     * <p>Constructs a new GetInteriorVehicleDataConsent object indicated by the
     * Hashtable parameter</p>
     *
     * @param hash The Hashtable to use
     */
    public GetInteriorVehicleDataConsent(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new GetInteriorVehicleDataConsent object
     */
    public GetInteriorVehicleDataConsent(@NonNull ModuleType moduleType, @NonNull List<String> moduleIds) {
        this();
        setModuleType(moduleType);
        setModuleIds(moduleIds);
    }

    /**
     * Gets the ModuleType
     *
     * @return ModuleType - The module type that the app requests to control.
     */
    public ModuleType getModuleType() {
        return (ModuleType) getObject(ModuleType.class, KEY_MODULE_TYPE);
    }

    /**
     * Sets a ModuleType
     *
     * @param moduleType The module type that the app requests to control.
     */
    public void setModuleType(@NonNull ModuleType moduleType) {
        setParameters(KEY_MODULE_TYPE, moduleType);
    }

    /**
     * Gets the moduleIds
     *
     * @return List<String> - Ids of a module of same type, published by System Capability.
     */
    @SuppressWarnings("unchecked")
    public List<String> getModuleIds() {
        return (List<String>) getObject(String.class, KEY_MODULE_IDS);
    }

    /**
     * Sets the moduleIds
     *
     * @param moduleIds Ids of a module of same type, published by System Capability.
     */
    public void setModuleIds(@NonNull List<String> moduleIds) {
        setParameters(KEY_MODULE_IDS, moduleIds);
    }
}
