package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.proxy.rpc.Grid;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;

public class GridTests extends TestCase {

    private Grid msg;

    @Override
    public void setUp() {
        msg = new Grid();

        msg.setCol(Test.GENERAL_INT);
        msg.setRow(Test.GENERAL_INT);
        msg.setLevel(Test.GENERAL_INT);
        msg.setColSpan(Test.GENERAL_INT);
        msg.setRowSpan(Test.GENERAL_INT);
        msg.setLevelSpan(Test.GENERAL_INT);
    }

    /**
     * Tests the expected values of the RPC message.
     */
    public void testRpcValues() {
        // Test Values
        Integer col = msg.getCol();
        Integer row = msg.getRow();
        Integer level = msg.getLevel();
        Integer colSpan = msg.getColSpan();
        Integer rowSpan = msg.getRowSpan();
        Integer levelSpan = msg.getLevelSpan();

        // Valid Tests
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, col);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, row);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, level);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, colSpan);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, rowSpan);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, levelSpan);

        // Invalid/Null Tests
        Grid msg = new Grid();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getCol());
        assertNull(Test.NULL, msg.getRow());
        assertNull(Test.NULL, msg.getLevel());
        assertNull(Test.NULL, msg.getColSpan());
        assertNull(Test.NULL, msg.getRowSpan());
        assertNull(Test.NULL, msg.getLevelSpan());
    }

    public void testJson() {
        JSONObject reference = new JSONObject();

        try {
            reference.put(Grid.KEY_COL, (Integer) Test.GENERAL_INT);
            reference.put(Grid.KEY_ROW, (Integer) Test.GENERAL_INT);
            reference.put(Grid.KEY_LEVEL, (Integer) Test.GENERAL_INT);
            reference.put(Grid.KEY_COL_SPAN, (Integer) Test.GENERAL_INT);
            reference.put(Grid.KEY_ROW_SPAN, (Integer) Test.GENERAL_INT);
            reference.put(Grid.KEY_LEVEL_SPAN, (Integer) Test.GENERAL_INT);

            JSONObject underTest = msg.serializeJSON();

            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();

                Object a = JsonUtils.readObjectFromJsonObject(reference, key);
                Object b = JsonUtils.readObjectFromJsonObject(underTest, key);

                assertEquals(Test.MATCH, a, b);
            }
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}