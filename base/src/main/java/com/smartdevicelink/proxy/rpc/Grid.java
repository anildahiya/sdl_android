package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;
import com.smartdevicelink.proxy.RPCStruct;
import java.util.Hashtable;

public class Grid extends RPCStruct {
    public static final String KEY_COL = "col";
    public static final String KEY_ROW = "row";
    public static final String KEY_LEVEL = "level";
    public static final String KEY_COL_SPAN = "colspan";
    public static final String KEY_ROW_SPAN = "rowspan";
    public static final String KEY_LEVEL_SPAN = "levelspan";

    /**
     * Constructs a new Grid object
     */
    public Grid() {
    }

    /**
     * <p>Constructs a new Grid object indicated by the Hashtable parameter
     * </p>
     *
     * @param hash The Hashtable to use
     */
    public Grid(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a newly allocated Grid object
     *
     * @param col Min: -1  Max: 100
     * @param row Min: -1  Max: 100
     */
    public Grid(@NonNull Integer col, @NonNull Integer row) {
        this();
        setCol(col);
        setRow(row);
    }

    /**
     * Sets the col portion of the Grid class
     *
     * @param col
     */
    public void setCol(@NonNull Integer col) {
        setValue(KEY_COL, col);
    }

    /**
     * Gets the col portion of the Grid class
     *
     * @return Integer
     */
    public Integer getCol() {
        return getInteger(KEY_COL);
    }

    /**
     * Sets the row portion of the Grid class
     *
     * @param row
     */
    public void setRow(@NonNull Integer row) {
        setValue(KEY_ROW, row);
    }

    /**
     * Gets the row portion of the Grid class
     *
     * @return Integer
     */
    public Integer getRow() {
        return getInteger(KEY_ROW);
    }

    /**
     * Sets the level portion of the Grid class
     *
     * @param level
     */
    public void setLevel(Integer level) {
        setValue(KEY_LEVEL, level);
    }

    /**
     * Gets the level portion of the Grid class
     *
     * @return Integer
     */
    public Integer getLevel() {
        return getInteger(KEY_LEVEL);
    }

    /**
     * Sets the colspan portion of the Grid class
     *
     * @param colspan
     */
    public void setColSpan(Integer colspan) {
        setValue(KEY_COL_SPAN, colspan);
    }

    /**
     * Gets the colspan portion of the Grid class
     *
     * @return Integer
     */
    public Integer getColSpan() {
        return getInteger(KEY_COL_SPAN);
    }

    /**
     * Sets the rowspan portion of the Grid class
     *
     * @param rowspan
     */
    public void setRowSpan(Integer rowspan) {
        setValue(KEY_ROW_SPAN, rowspan);
    }

    /**
     * Gets the rowspan portion of the Grid class
     *
     * @return Integer
     */
    public Integer getRowSpan() {
        return getInteger(KEY_ROW_SPAN);
    }

    /**
     * Sets the levelspan portion of the Grid class
     *
     * @param levelspan
     */
    public void setLevelSpan(Integer levelspan) {
        setValue(KEY_LEVEL_SPAN, levelspan);
    }

    /**
     * Gets the levelspan portion of the Grid class
     *
     * @return Integer
     */
    public Integer getLevelSpan() {
        return getInteger(KEY_LEVEL_SPAN);
    }
}
