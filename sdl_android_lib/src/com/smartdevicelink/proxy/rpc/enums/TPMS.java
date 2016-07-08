package com.smartdevicelink.proxy.rpc.enums;

public enum TPMS {
    UNKNOWN,
    SYSTEM_FAULT,
    SENSOR_FAULT,
    LOW,
    SYSTEM_ACTIVE,
    TRAIN_LF_TIRE,
    TRAIN_RF_TIRE,
    TRAIN_RR_TIRE,
    TRAIN_ORR_TIRE,
    TRAIN_IRR_TIRE,
    TRAIN_LR_TIRE,
    TRAIN_OLR_TIRE,
    TRAIN_ILR_TIRE,
    TRAINING_COMPLETE,
    TIRES_NOT_TRAINED;

    public static TPMS valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
