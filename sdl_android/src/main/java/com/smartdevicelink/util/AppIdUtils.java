package com.smartdevicelink.util;

import java.util.regex.Pattern;

/**
 * Created by mrapitis on 6/27/2018.
 */

public class AppIdUtils {

    public static boolean isValidUUID(String value) {
        if(!Pattern.matches("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}", value)) {
            return false;
        }
        return true;
    }

    public static String removeDash(String value) {

        if(value == null) return null;

        return value.replace("-", "");
    }

    public static String getShortAppId(String value) {

        if(value == null) return null;

        String uuidStr = removeDash(value);

        if(uuidStr != null){
            return uuidStr.substring(0, Math.min(uuidStr.length(), 10));
        } else {
            return  null;
        }
    }

}
