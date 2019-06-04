package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.proxy.RPCStruct;
import java.util.Hashtable;

public class ModuleInfo extends RPCStruct {
    public static final String KEY_MODULE_ID = "moduleId";
    public static final String KEY_LOCATION = "location";
    public static final String KEY_SERVICE_AREA = "serviceArea";
    public static final String KEY_ALLOW_MULTIPLE_ACCESS = "allowMultipleAccess";

    /**
     * Constructs a new ModuleInfo object
     */
    public ModuleInfo() {
    }

    /**
     * <p>Constructs a new ModuleInfo object indicated by the Hashtable parameter
     * </p>
     *
     * @param hash The Hashtable to use
     */
    public ModuleInfo(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a newly allocated ModuleInfo object
     *
     * @param moduleId UUID of a module. "moduleId + moduleType" uniquely identify a module.
     */
    public ModuleInfo(@NonNull String moduleId) {
        this();
        setModuleId(moduleId);
    }

    /**
     * Sets the moduleId portion of the ModuleInfo class
     *
     * @param moduleId UUID of a module. "moduleId + moduleType" uniquely identify a module.
     */
    public void setModuleId(@NonNull String moduleId) {
        setValue(KEY_MODULE_ID, moduleId);
    }

    /**
     * Gets the moduleId portion of the ModuleInfo class
     *
     * @return String - UUID of a module. "moduleId + moduleType" uniquely identify a module.
     */
    public String getModuleId() {
        return getString(KEY_MODULE_ID);
    }

    /**
     * Gets the location portion of the ModuleInfo class
     *
     * @return Grid - Location of a module.
     */
    @SuppressWarnings("unchecked")
    public Grid getLocation() {
        return (Grid) getObject(Grid.class, KEY_LOCATION);
    }

    /**
     * Sets the location portion of the ModuleInfo class
     *
     * @param location - Location of a module.
     */
    public void setLocation(Grid location) {
        setValue(KEY_LOCATION, location);
    }

    /**
     * Gets the serviceArea portion of the ModuleInfo class
     *
     * @return Grid - Service area of a module.
     */
    @SuppressWarnings("unchecked")
    public Grid getServiceArea() {
        return (Grid) getObject(Grid.class, KEY_SERVICE_AREA);
    }

    /**
     * Sets the serviceArea portion of the ModuleInfo class
     *
     * @param serviceArea - Service area of a module.
     */
    public void setServiceArea(Grid serviceArea) {
        setValue(KEY_SERVICE_AREA, serviceArea);
    }

    /**
     * Gets the allowMultipleAccess portion of the ModuleInfo class
     *
     * @return Boolean - Allow multiple users/apps to access the module or not.
     */
    public Boolean getAllowMultipleAccess() {
        return getBoolean(KEY_ALLOW_MULTIPLE_ACCESS);
    }

    /**
     * Sets the allowMultipleAccess portion of the ModuleInfo class
     *
     * @param allowMultipleAccess - Allow multiple users/apps to access the module or not.
     */
    public void setAllowMultipleAccess(Boolean allowMultipleAccess) {
        setValue(KEY_ALLOW_MULTIPLE_ACCESS, allowMultipleAccess);
    }
}
