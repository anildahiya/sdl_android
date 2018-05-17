package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.ComponentVolumeStatus;
import com.smartdevicelink.proxy.rpc.enums.TPMS;
import com.smartdevicelink.util.SdlDataTypeConverter;

import java.util.Hashtable;

/**
 * Tire pressure status of a single tire.
 * <p><b>Parameter List</b></p>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Name</th>
 * 			<th>Type</th>
 * 			<th>Description</th>
 * 			<th>SmartDeviceLink Ver. Available</th>
 * 		</tr>
 * 		<tr>
 * 			<td>status</td>
 * 			<td>ComponentVolumeStatus</td>
 * 			<td>Describes the volume status of a single tire
 * 					See {@linkplain ComponentVolumeStatus}
 * 			</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 *  </table>
 * @since SmartDeviceLink 2.0
 */
public class SingleTireStatus extends RPCStruct {
	public static final String KEY_STATUS = "status";
    public static final String KEY_TPMS = "tpms";
    public static final String KEY_PRESSURE = "pressure";

	/**
	 * Constructs a newly allocated SingleTireStatus object
	 */
    public SingleTireStatus() { }
    
    /**
     * Constructs a newly allocated SingleTireStatus object indicated by the Hashtable parameter
     * @param hash The Hashtable to use
     */
    public SingleTireStatus(Hashtable<String, Object> hash) {
        super(hash);
    }

	/**
	 * Constructs a newly allocated SingleTireStatus object
	 * @param status Describes the volume status of a single tire
	 */
	public SingleTireStatus(@NonNull ComponentVolumeStatus status){
		this();
		setStatus(status);
	}
    
    /**
     *  set the volume status of a single tire
     * @param status  the volume status of a single tire
     */
    public void setStatus(@NonNull ComponentVolumeStatus status) {
    	setValue(KEY_STATUS, status);
    }
    
    /**
     * get  the volume status of a single tire
     * @return  the volume status of a single tire
     */
    public ComponentVolumeStatus getStatus() {
        return (ComponentVolumeStatus) getObject(ComponentVolumeStatus.class, KEY_STATUS);
    }

    /**
     *  set the status of TPMS according to the particular tire.
     * @param tpms  the status of TPMS according to the particular tire.
     */
    public void setTpms(TPMS tpms) {
        setValue(KEY_TPMS, tpms);
    }

    /**
     * get the status of TPMS according to the particular tire.
     * @return the status of TPMS according to the particular tire.
     */
    public TPMS getTpms() {
        return (TPMS) getObject(TPMS.class, KEY_TPMS);
    }

    /**
     * get the pressure value of the particular tire in kilo pascal.
     * @return the pressure value of the particular tire in kilo pascal.
     */
    public Float getPressure() {
        Object value = getValue(KEY_PRESSURE);
        return SdlDataTypeConverter.objectToFloat(value);
    }

    /**
     *  set the pressure value of the particular tire in kilo pascal.
     * @param pressure the pressure value of the particular tire in kilo pascal.
     */
    public void setPressure(Float pressure) {
        setValue(KEY_PRESSURE, pressure);
    }
}
