package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.HMISettingsControlCapabilities;
import com.smartdevicelink.proxy.rpc.ModuleInfo;
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
 * {@link com.smartdevicelink.rpc.HMISettingsControlCapabilities}
 */
public class HMISettingsControlCapabilitiesTests extends TestCase {

	private HMISettingsControlCapabilities msg;

	@Override
	public void setUp() {
		msg = new HMISettingsControlCapabilities();

		msg.setModuleName(Test.GENERAL_STRING);
		msg.setDistanceUnitAvailable(Test.GENERAL_BOOLEAN);
		msg.setTemperatureUnitAvailable(Test.GENERAL_BOOLEAN);
		msg.setDisplayModeUnitAvailable(Test.GENERAL_BOOLEAN);
		msg.setModuleInfo(Test.GENERAL_MODULE_INFO);
	}

	/**
	 * Tests the expected values of the RPC message.
	 */
	public void testRpcValues() {
		// Test Values
		String moduleName = msg.getModuleName();
		Boolean distanceUnitAvailable = msg.getDistanceUnitAvailable();
		Boolean temperatureUnitAvailable = msg.getTemperatureUnitAvailable();
		Boolean displayModeUnitAvailable = msg.getDisplayModeUnitAvailable();
		ModuleInfo moduleInfo = msg.getModuleInfo();

		// Valid Tests
		assertEquals(Test.MATCH, Test.GENERAL_STRING, moduleName);
		assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, (boolean) distanceUnitAvailable);
		assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, (boolean) temperatureUnitAvailable);
		assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, (boolean) displayModeUnitAvailable);
		assertTrue(Test.TRUE, Validator.validateModuleInfo(Test.GENERAL_MODULE_INFO, moduleInfo));

		// Invalid/Null Tests
		HMISettingsControlCapabilities msg = new HMISettingsControlCapabilities();
		assertNotNull(Test.NOT_NULL, msg);

		assertNull(Test.NULL, msg.getModuleName());
		assertNull(Test.NULL, msg.getDistanceUnitAvailable());
		assertNull(Test.NULL, msg.getTemperatureUnitAvailable());
		assertNull(Test.NULL, msg.getDisplayModeUnitAvailable());
		assertNull(Test.NULL, msg.getModuleInfo());
	}

	public void testJson() {
		JSONObject reference = new JSONObject();

		try {
			reference.put(HMISettingsControlCapabilities.KEY_MODULE_NAME, Test.GENERAL_STRING);
			reference.put(HMISettingsControlCapabilities.KEY_DISTANCE_UNIT_AVAILABLE, Test.GENERAL_BOOLEAN);
			reference.put(HMISettingsControlCapabilities.KEY_TEMPERATURE_UNIT_AVAILABLE, Test.GENERAL_BOOLEAN);
			reference.put(HMISettingsControlCapabilities.KEY_DISPLAY_MODE_UNIT_AVAILABLE, Test.GENERAL_BOOLEAN);
			reference.put(HMISettingsControlCapabilities.KEY_MODULE_INFO, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_MODULE_INFO.getStore()));

			JSONObject underTest = msg.serializeJSON();
			assertEquals(Test.MATCH, reference.length(), underTest.length());

			Iterator<?> iterator = reference.keys();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();

				if (key.equals(HMISettingsControlCapabilities.KEY_MODULE_INFO)) {
					JSONObject referenceArray = JsonUtils.readJsonObjectFromJsonObject(reference, key);
					JSONObject underTestArray = JsonUtils.readJsonObjectFromJsonObject(underTest, key);
					Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray);
					Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray);

					assertTrue(Test.TRUE, Validator.validateModuleInfo(new ModuleInfo(hashReference), new ModuleInfo(hashTest)));
				} else{
					assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
				}
			}
		} catch (JSONException e) {
			fail(Test.JSON_FAIL);
		}
	}
}