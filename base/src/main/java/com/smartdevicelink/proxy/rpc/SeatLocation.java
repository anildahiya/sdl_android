package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import java.util.Hashtable;

public class SeatLocation extends RPCStruct {
    public static final String KEY_GRID = "grid";

    /**
     * Constructs a new SeatLocation object
     */
    public SeatLocation() {
    }

    /**
     * <p>Constructs a new SeatLocation object indicated by the Hashtable parameter
     * </p>
     *
     * @param hash The Hashtable to use
     */
    public SeatLocation(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Gets the grid portion of the SeatLocation class
     *
     * @return Grid - HMI shall include this parameter when publishing seat locations in capabilities. App shall include it even if it is optional.
     */
    @SuppressWarnings("unchecked")
    public Grid getGrid() {
        return (Grid) getObject(Grid.class, KEY_GRID);
    }

    /**
     * Sets the grid portion of the SeatLocation class
     *
     * @param grid - HMI shall include this parameter when publishing seat locations in capabilities. App shall include it even if it is optional.
     */
    public void setGrid(Grid grid) {
        setValue(KEY_GRID, grid);
    }
}
