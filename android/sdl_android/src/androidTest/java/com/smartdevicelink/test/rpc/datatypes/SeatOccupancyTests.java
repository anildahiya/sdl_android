package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.SeatOccupancy;
import com.smartdevicelink.proxy.rpc.SeatStatus;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import junit.framework.TestCase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.SeatOccupancy}
 */
public class SeatOccupancyTests extends TestCase {

	private SeatOccupancy msg;

	@Override
	public void setUp() {
		msg = new SeatOccupancy();

		msg.setSeatsOccupied(Test.GENERAL_SEATSTATUS_LIST);
		msg.setSeatsBelted(Test.GENERAL_SEATSTATUS_LIST);
	}

	/**
	 * Tests the expected values of the RPC message.
	 */
	public void testRpcValues() {
		// Test Values
		List<SeatStatus> seatsOccupied = msg.getSeatsOccupied();
		List<SeatStatus> seatsBelted = msg.getSeatsBelted();

		// Valid Tests
		assertEquals(Test.MATCH, Test.GENERAL_SEATSTATUS_LIST.size(), seatsOccupied.size());
		assertEquals(Test.MATCH, Test.GENERAL_SEATSTATUS_LIST.size(), seatsBelted.size());

		assertTrue(Test.TRUE, Validator.validateSeatStatusList(Test.GENERAL_SEATSTATUS_LIST, seatsOccupied));
		assertTrue(Test.TRUE, Validator.validateSeatStatusList(Test.GENERAL_SEATSTATUS_LIST, seatsBelted));

		// Invalid/Null Tests
		SeatOccupancy msg = new SeatOccupancy();
		assertNotNull(Test.NOT_NULL, msg);

		assertNull(Test.NULL, msg.getSeatsOccupied());
		assertNull(Test.NULL, msg.getSeatsBelted());
	}

	public void testJson() {
		JSONObject reference = new JSONObject();

		try {
			reference.put(SeatOccupancy.KEY_SEATS_OCCUPIED, Test.GENERAL_SEATSTATUS_LIST);
			reference.put(SeatOccupancy.KEY_SEATS_BELTED, Test.GENERAL_SEATSTATUS_LIST);

			JSONObject underTest = msg.serializeJSON();
			assertEquals(Test.MATCH, reference.length(), underTest.length());

			Iterator<?> iterator = reference.keys();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();

				if (key.equals(SeatOccupancy.KEY_SEATS_OCCUPIED)) {
					List<SeatStatus> seatsOccupiedReference = (List<SeatStatus>) JsonUtils.readObjectFromJsonObject(reference, key);
					JSONArray seatsOccupiedArray = JsonUtils.readJsonArrayFromJsonObject(underTest, key);
					int i = 0;
					for (SeatStatus seatsOccupied : seatsOccupiedReference) {
						assertTrue(Validator.validateSeatStatus(seatsOccupied, new SeatStatus(JsonRPCMarshaller.deserializeJSONObject(seatsOccupiedArray.getJSONObject(i++)))));
					}
				} else if (key.equals(SeatOccupancy.KEY_SEATS_BELTED)) {
					List<SeatStatus> seatsBeltedReference = (List<SeatStatus>) JsonUtils.readObjectFromJsonObject(reference, key);
					JSONArray seatsBeltedArray = JsonUtils.readJsonArrayFromJsonObject(underTest, key);
					int i = 0;
					for (SeatStatus seatsOccupied : seatsBeltedReference) {
						assertTrue(Validator.validateSeatStatus(seatsOccupied, new SeatStatus(JsonRPCMarshaller.deserializeJSONObject(seatsBeltedArray.getJSONObject(i++)))));
					}
				}
			}
		} catch (JSONException e) {
			fail(Test.JSON_FAIL);
		}
	}
}