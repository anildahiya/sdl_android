package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.util.SdlDataTypeConverter;

import java.util.Hashtable;

public class TirePressureValue extends RPCStruct{
    public static final String KEY_LEFT_FRONT = "leftFront";
    public static final String KEY_RIGHT_FRONT = "rightFront";
    public static final String KEY_LEFT_REAR = "leftRear";
    public static final String KEY_RIGHT_REAR = "rightRear";
    public static final String KEY_INNER_LEFT_REAR = "innerLeftRear";
    public static final String KEY_INNER_RIGHT_REAR = "innerRightRear";
    public static final String KEY_FRONT_RECOMMENDED = "frontRecommended";
    public static final String KEY_REAR_RECOMMENDED = "rearRecommended";

    public TirePressureValue() {
    }

    public TirePressureValue(Hashtable<String, Object> hash) {
        super(hash);
    }

    public Double getLeftFront() {
        Object value = store.get(KEY_LEFT_FRONT);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setLeftFront(Double leftFront) {
        if (leftFront != null) {
            store.put(KEY_LEFT_FRONT, leftFront);
        } else {
            store.remove(KEY_LEFT_FRONT);
        }
    }

    public Double getRightFront() {
        Object value = store.get(KEY_RIGHT_FRONT);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setRightFront(Double rightFront) {
        if (rightFront != null) {
            store.put(KEY_RIGHT_FRONT, rightFront);
        } else {
            store.remove(KEY_RIGHT_FRONT);
        }
    }

    public Double getLeftRear() {
        Object value = store.get(KEY_LEFT_REAR);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setLeftRear(Double leftRear) {
        if (leftRear != null) {
            store.put(KEY_LEFT_REAR, leftRear);
        } else {
            store.remove(KEY_LEFT_REAR);
        }
    }

    public Double getRightRear() {
        Object value = store.get(KEY_RIGHT_REAR);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setRightRear(Double rightRear) {
        if (rightRear != null) {
            store.put(KEY_RIGHT_REAR, rightRear);
        } else {
            store.remove(KEY_RIGHT_REAR);
        }
    }

    public Double getInnerLeftRear() {
        Object value = store.get(KEY_INNER_LEFT_REAR);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setInnerLeftRear(Double innerLeftRear) {
        if (innerLeftRear != null) {
            store.put(KEY_INNER_LEFT_REAR, innerLeftRear);
        } else {
            store.remove(KEY_INNER_LEFT_REAR);
        }
    }

    public Double getInnerRightRear() {
        Object value = store.get(KEY_INNER_RIGHT_REAR);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setInnerRightRear(Double innerRightRear) {
        if (innerRightRear != null) {
            store.put(KEY_INNER_RIGHT_REAR, innerRightRear);
        } else {
            store.remove(KEY_INNER_RIGHT_REAR);
        }
    }

    public Double getFrontRecommended() {
        Object value = store.get(KEY_FRONT_RECOMMENDED);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setFrontRecommended(Double frontRecommended) {
        if (frontRecommended != null) {
            store.put(KEY_FRONT_RECOMMENDED, frontRecommended);
        } else {
            store.remove(KEY_FRONT_RECOMMENDED);
        }
    }

    public Double getRearRecommended() {
        Object value = store.get(KEY_REAR_RECOMMENDED);
        return SdlDataTypeConverter.objectToDouble(value);
    }

    public void setRearRecommended(Double rearRecommended) {
        if (rearRecommended != null) {
            store.put(KEY_REAR_RECOMMENDED, rearRecommended);
        } else {
            store.remove(KEY_REAR_RECOMMENDED);
        }
    }
}
