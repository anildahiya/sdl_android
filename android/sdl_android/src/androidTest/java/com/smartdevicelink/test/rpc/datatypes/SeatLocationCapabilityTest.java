package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.SeatLocation;
import com.smartdevicelink.proxy.rpc.SeatLocationCapability;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import junit.framework.TestCase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.SeatLocationCapability}
 */
public class SeatLocationCapabilityTest extends TestCase {

    private SeatLocationCapability msg;

    @Override
    public void setUp() {
        msg = new SeatLocationCapability();
        msg.setRows(Test.GENERAL_INT);
        msg.setColumns(Test.GENERAL_INT);
        msg.setLevels(Test.GENERAL_INT);
        msg.setSeats(Test.GENERAL_SEAT_LOCATION_LIST);
    }

    /**
     * Tests the expected values of the RPC message.
     */
    public void testRpcValues() {
        // Test Values
        Integer rows = msg.getRows();
        Integer columns = msg.getColumns();
        Integer levels = msg.getLevels();
        List<SeatLocation> seats = msg.getSeats();

        // Valid Tests
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, rows);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, columns);
        assertEquals(Test.MATCH, (Integer) Test.GENERAL_INT, levels);

        assertEquals(Test.MATCH, Test.GENERAL_SEAT_LOCATION_LIST.size(), seats.size());

        for (int i = 0; i < Test.GENERAL_SEAT_LOCATION_LIST.size(); i++) {
            assertTrue(Test.TRUE, Validator.validateSeatLocation(Test.GENERAL_SEAT_LOCATION_LIST.get(i), seats.get(i)));
        }

        // Invalid/Null Tests
        SeatLocationCapability msg = new SeatLocationCapability();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getRows());
        assertNull(Test.NULL, msg.getColumns());
        assertNull(Test.NULL, msg.getLevels());
        assertNull(Test.NULL, msg.getSeats());
    }

    public void testJson() {
        JSONObject reference = new JSONObject();

        try {
            reference.put(SeatLocationCapability.KEY_ROWS, Test.GENERAL_INT);
            reference.put(SeatLocationCapability.KEY_COLUMNS, Test.GENERAL_INT);
            reference.put(SeatLocationCapability.KEY_LEVELS, Test.GENERAL_INT);
            reference.put(SeatLocationCapability.KEY_SEATS, Test.JSON_SEATLOCATIONS);

            JSONObject underTest = msg.serializeJSON();
            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();

                if (key.equals(SeatLocationCapability.KEY_SEATS)) {
                    JSONArray referenceArray = JsonUtils.readJsonArrayFromJsonObject(reference, key);
                    JSONArray underTestArray = JsonUtils.readJsonArrayFromJsonObject(underTest, key);
                    assertEquals(Test.MATCH, referenceArray.length(), underTestArray.length());

                    for (int i = 0; i < referenceArray.length(); i++) {
                        Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray.getJSONObject(i));
                        Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray.getJSONObject(i));
                        assertTrue(Test.TRUE, Validator.validateSeatLocation(new SeatLocation(hashReference), new SeatLocation(hashTest)));
                    }
                } else {
                    assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
                }
            }
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}