package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.SeatLocation;
import com.smartdevicelink.proxy.rpc.SeatStatus;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.SeatStatus}
 */
public class SeatStatusTest extends TestCase {

	private SeatStatus msg;

	@Override
	public void setUp() {
		msg = new SeatStatus();
		msg.setConditionActive(Test.GENERAL_BOOLEAN);
		msg.setSeatLocation(Test.GENERAL_SEAT_LOCATION);
	}

	/**
	 * Tests the expected values of the RPC message.
	 */
	public void testRpcValues() {
		// Test Values
		Boolean conditionActive = msg.getConditionActive();
		SeatLocation seatLocation = msg.getSeatLocation();

		// Valid Tests
		assertEquals(Test.MATCH, (Boolean) Test.GENERAL_BOOLEAN, conditionActive);
		assertTrue(Test.TRUE, Validator.validateSeatLocation(Test.GENERAL_SEAT_LOCATION, seatLocation));

		// Invalid/Null Tests
		SeatStatus msg = new SeatStatus();
		assertNotNull(Test.NOT_NULL, msg);

		assertNull(Test.NULL, msg.getConditionActive());
		assertNull(Test.NULL, msg.getSeatLocation());
	}

	public void testJson() {
		JSONObject reference = new JSONObject();

		try {
			reference.put(SeatStatus.KEY_CONDITION_ACTIVE, Test.GENERAL_BOOLEAN);
			reference.put(SeatStatus.KEY_SEAT_LOCATION, Test.GENERAL_SEAT_LOCATION);

			JSONObject underTest = msg.serializeJSON();
			assertEquals(Test.MATCH, reference.length(), underTest.length());

			Iterator<?> iterator = reference.keys();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();

				if (key.equals(SeatStatus.KEY_SEAT_LOCATION)) {
					SeatLocation mReference = (SeatLocation) JsonUtils.readObjectFromJsonObject(reference, key);
					Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(JsonUtils.readJsonObjectFromJsonObject(underTest, key));
					assertTrue(Validator.validateSeatLocation(mReference, new SeatLocation(hashTest)));
				} else {
					assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
				}
			}
		} catch (JSONException e) {
			fail(Test.JSON_FAIL);
		}
	}
}