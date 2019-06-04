package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.Grid;
import com.smartdevicelink.proxy.rpc.ModuleInfo;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Hashtable;
import java.util.Iterator;

public class ModuleInfoTests extends TestCase {

    private ModuleInfo msg;

    @Override
    public void setUp() {
        msg = new ModuleInfo();

        msg.setModuleId(Test.GENERAL_STRING);
        msg.setLocation(Test.GENERAL_GRID);
        msg.setServiceArea(Test.GENERAL_GRID);
        msg.setAllowMultipleAccess(Test.GENERAL_BOOLEAN);
    }

    /**
     * Tests the expected values of the RPC message.
     */
    public void testRpcValues() {
        // Test Values
        String moduleId = msg.getModuleId();
        Grid location = msg.getLocation();
        Grid serviceArea = msg.getServiceArea();
        boolean allowMultipleAccess = msg.getAllowMultipleAccess();

        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_STRING, moduleId);
        assertTrue(Test.TRUE, Validator.validateGrid(Test.GENERAL_GRID, location));
        assertTrue(Test.TRUE, Validator.validateGrid(Test.GENERAL_GRID, serviceArea));
        assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, allowMultipleAccess);

        // Invalid/Null Tests
        ModuleInfo msg = new ModuleInfo();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getModuleId());
        assertNull(Test.NULL, msg.getLocation());
        assertNull(Test.NULL, msg.getServiceArea());
        assertNull(Test.NULL, msg.getAllowMultipleAccess());
    }

    public void testJson() {
        JSONObject reference = new JSONObject();

        try {
            reference.put(ModuleInfo.KEY_MODULE_ID, Test.GENERAL_STRING);
            reference.put(ModuleInfo.KEY_LOCATION, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_GRID.getStore()));
            reference.put(ModuleInfo.KEY_SERVICE_AREA, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_GRID.getStore()));
            reference.put(ModuleInfo.KEY_ALLOW_MULTIPLE_ACCESS, Test.GENERAL_BOOLEAN);

            JSONObject underTest = msg.serializeJSON();
            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                if (key.equals(ModuleInfo.KEY_LOCATION)) {
                    JSONObject referenceArray = JsonUtils.readJsonObjectFromJsonObject(reference, key);
                    JSONObject underTestArray = JsonUtils.readJsonObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray);

                    assertTrue(Test.TRUE, Validator.validateGrid(new Grid(hashReference), new Grid(hashTest)));
                } else if (key.equals(ModuleInfo.KEY_SERVICE_AREA)) {
                    JSONObject referenceArray = JsonUtils.readJsonObjectFromJsonObject(reference, key);
                    JSONObject underTestArray = JsonUtils.readJsonObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray);

                    assertTrue(Test.TRUE, Validator.validateGrid(new Grid(hashReference), new Grid(hashTest)));
                } else {
                    assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
                }
            }
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}