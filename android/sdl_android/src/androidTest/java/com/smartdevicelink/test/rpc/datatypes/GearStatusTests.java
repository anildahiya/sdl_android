package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.proxy.rpc.GearStatus;
import com.smartdevicelink.proxy.rpc.enums.PRNDL;
import com.smartdevicelink.proxy.rpc.enums.TransmissionType;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.GearStatus}
 */
public class GearStatusTests extends TestCase {

	private GearStatus msg;

	@Override
	public void setUp() {
		msg = new GearStatus();
		msg.setUserSelectedGear(Test.GENERAL_PRNDL);
		msg.setActualGear(Test.GENERAL_PRNDL);
		msg.setTransmissionType(Test.GENERAL_TRANSMISSION_TYPE);
	}

	/**
	 * Tests the expected values of the RPC message.
	 */
	public void testRpcValues() {
		// Test Values
		PRNDL userSelectedGear = msg.getUserSelectedGear();
		PRNDL actualGear = msg.getActualGear();
		TransmissionType transmissionType = msg.getTransmissionType();

		// Valid Tests
		assertEquals(Test.MATCH, Test.GENERAL_PRNDL, userSelectedGear);
		assertEquals(Test.MATCH, Test.GENERAL_PRNDL, actualGear);
		assertEquals(Test.MATCH, Test.GENERAL_TRANSMISSION_TYPE, transmissionType);

		// Invalid/Null Tests
		GearStatus msg = new GearStatus();
		assertNotNull(Test.NOT_NULL, msg);

		assertNull(Test.NULL, msg.getUserSelectedGear());
		assertNull(Test.NULL, msg.getActualGear());
		assertNull(Test.NULL, msg.getTransmissionType());
	}

	public void testJson() {
		JSONObject reference = new JSONObject();

		try {
			reference.put(GearStatus.KEY_USER_SELECTED_GEAR, Test.GENERAL_PRNDL);
			reference.put(GearStatus.KEY_ACTUAL_GEAR, Test.GENERAL_PRNDL);
			reference.put(GearStatus.KEY_TRANSMISSION_TYPE, Test.GENERAL_TRANSMISSION_TYPE);

			JSONObject underTest = msg.serializeJSON();
			assertEquals(Test.MATCH, reference.length(), underTest.length());

			Iterator<?> iterator = reference.keys();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
			}
		} catch (JSONException e) {
			fail(Test.JSON_FAIL);
		}
	}
}