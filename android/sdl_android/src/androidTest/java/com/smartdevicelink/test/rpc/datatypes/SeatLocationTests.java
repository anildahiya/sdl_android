package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.Grid;
import com.smartdevicelink.proxy.rpc.SeatLocation;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Hashtable;
import java.util.Iterator;

public class SeatLocationTests extends TestCase {

    private SeatLocation msg;

    @Override
    public void setUp() {
        msg = new SeatLocation();

        msg.setGrid(Test.GENERAL_GRID);
    }

    /**
     * Tests the expected values of the RPC message.
     */
    public void testRpcValues() {
        // Test Values
        Grid grid = msg.getGrid();

        // Valid Tests
        assertTrue(Test.TRUE, Validator.validateGrid(Test.GENERAL_GRID, grid));

        // Invalid/Null Tests
        SeatLocation msg = new SeatLocation();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getGrid());
    }

    public void testJson() {
        JSONObject reference = new JSONObject();

        try {
            reference.put(SeatLocation.KEY_GRID, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_GRID.getStore()));

            JSONObject underTest = msg.serializeJSON();
            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (key.equals(SeatLocation.KEY_GRID)) {
                    JSONObject referenceArray = JsonUtils.readJsonObjectFromJsonObject(reference, key);
                    JSONObject underTestArray = JsonUtils.readJsonObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray);

                    assertTrue(Test.TRUE, Validator.validateGrid(new Grid(hashReference), new Grid(hashTest)));
                }
            }
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}