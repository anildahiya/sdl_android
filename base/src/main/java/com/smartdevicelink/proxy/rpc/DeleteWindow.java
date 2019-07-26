package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import java.util.Hashtable;

public class DeleteWindow extends RPCRequest {
    public static final String KEY_WINDOW_ID = "windowID";

    /**
     * Constructs a new DeleteWindow object
     */
    public DeleteWindow() {
        super(FunctionID.DELETE_WINDOW.toString());
    }

    /**
     * <p>Constructs a new DeleteWindow object indicated by the Hashtable
     * parameter</p>
     *
     * @param hash The Hashtable to use
     */
    public DeleteWindow(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new DeleteWindow object
     */
    public DeleteWindow(@NonNull Integer windowID) {
        this();
        setWindowID(windowID);
    }

    /**
     * Sets the windowID. It's a unique ID to identify the window.
     * The value of '0' will always be the default main window on the main display and cannot be deleted.
     * See PredefinedWindows enum.
     *
     * @param windowID
     */
    public void setWindowID(@NonNull Integer windowID) {
        setParameters(KEY_WINDOW_ID, windowID);
    }

    /**
     * Gets the windowID.
     *
     * @return int -an int value representing the windowID.
     */
    public Integer getWindowID() {
        return getInteger(KEY_WINDOW_ID);
    }
}