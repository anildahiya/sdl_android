package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import com.smartdevicelink.proxy.rpc.enums.ModuleType;
import java.util.Hashtable;

public class ReleaseInteriorVehicleDataModule extends RPCRequest {
    public static final String KEY_MODULE_TYPE = "moduleType";
    public static final String KEY_MODULE_ID = "moduleId";

    /**
     * Constructs a new ReleaseInteriorVehicleDataModule object
     */
    public ReleaseInteriorVehicleDataModule() {
        super(FunctionID.RELEASE_INTERIOR_VEHICLE_DATA_MODULE.toString());
    }

    /**
     * <p>Constructs a new ReleaseInteriorVehicleDataModule object indicated by the
     * Hashtable parameter</p>
     *
     * @param hash The Hashtable to use
     */
    public ReleaseInteriorVehicleDataModule(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new ReleaseInteriorVehicleDataModule object
     */
    public ReleaseInteriorVehicleDataModule(@NonNull ModuleType moduleType) {
        this();
        setModuleType(moduleType);
    }

    /**
     * Gets the ModuleType
     *
     * @return ModuleType
     */
    public ModuleType getModuleType() {
        return (ModuleType) getObject(ModuleType.class, KEY_MODULE_TYPE);
    }

    /**
     * Sets a ModuleType
     *
     * @param moduleType
     */
    public void setModuleType(@NonNull ModuleType moduleType) {
        setParameters(KEY_MODULE_TYPE, moduleType);
    }

    /**
     * Sets moduleId parameter
     *
     * @param moduleId - Id of a module, published by System Capability.
     */
    public void setModuleId(String moduleId) {
        setParameters(KEY_MODULE_ID, moduleId);
    }

    /**
     * Gets moduleId parameter
     *
     * @return String - Id of a module, published by System Capability.
     */
    public String getModuleId() {
        return getString(KEY_MODULE_ID);
    }
}
