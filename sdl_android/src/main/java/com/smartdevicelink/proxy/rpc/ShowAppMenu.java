package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

import java.util.Hashtable;

public class ShowAppMenu extends RPCRequest {
	public static final String KEY_MENU_ID = "menuID";

    /**
     * Constructs a new ShowAppMenu object
     */
    public ShowAppMenu() {
        super(FunctionID.SHOW_APP_MENU.toString());
    }

    /**
     * Constructs a new ShowAppMenu object indicated by the Hashtable
     * parameter
     * <p></p>
     *
     * @param hash The Hashtable to use
     */
    public ShowAppMenu(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the MenuId. If omitted the HMI opens the apps menu.
     * If set to a sub-menu ID the HMI opens the corresponding sub-menu
     * previously added using AddSubMenu.
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
		setParameters(KEY_MENU_ID, menuId);
    }

    /**
     * Gets the MenuId
     *
     * @return Integer -an Integer value representing an MenuId
     */
    public Integer getMenuId() {
		return getInteger(KEY_MENU_ID);
    }
}
