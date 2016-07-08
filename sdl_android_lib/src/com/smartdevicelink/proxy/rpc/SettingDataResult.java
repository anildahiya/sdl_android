package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.SettingDataResultCode;
import com.smartdevicelink.proxy.rpc.enums.SettingDataType;

import java.util.Hashtable;

public class SettingDataResult extends RPCStruct{
    public static final String KEY_DATA_TYPE = "dataType";
    public static final String KEY_RESULT_CODE = "resultCode";

    public SettingDataResult() {
    }

    public SettingDataResult(Hashtable<String, Object> hash) {
        super(hash);
    }

    public SettingDataType getDataType() {
        Object obj = store.get(KEY_DATA_TYPE);
        if (obj instanceof SettingDataType) {
            return (SettingDataType) obj;
        } else if (obj instanceof String) {
            return SettingDataType.valueForString((String) obj);
        }
        return null;
    }

    public void setDataType( SettingDataType dataType ) {
        if (dataType != null) {
            store.put(KEY_DATA_TYPE, dataType );
        } else {
            store.remove(KEY_DATA_TYPE);
        }
    }

    public SettingDataResultCode getResultCode() {
        Object obj = store.get(KEY_RESULT_CODE);
        if (obj instanceof SettingDataResultCode) {
            return (SettingDataResultCode) obj;
        } else if (obj instanceof String) {
            return SettingDataResultCode.valueForString((String) obj);
        }
        return null;
    }

    public void setResultCode( SettingDataResultCode resultCode ) {
        if (resultCode != null) {
            store.put(KEY_RESULT_CODE, resultCode );
        } else {
            store.remove(KEY_RESULT_CODE);
        }
    }
}
