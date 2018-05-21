package com.smartdevicelink.test.rpc.enums;

import com.smartdevicelink.proxy.rpc.enums.TPMS;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link TPMS}
 */
public class TPMSTests extends TestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {	
		String example = "UNKNOWN";
		TPMS enumUnknown = TPMS.valueForString(example);
		example = "SYSTEM_FAULT";
		TPMS enumSystemFault = TPMS.valueForString(example);
		example = "SENSOR_FAULT";
		TPMS enumSensorFault = TPMS.valueForString(example);
		example = "LOW";
		TPMS enumLow = TPMS.valueForString(example);
		example = "SYSTEM_ACTIVE";
		TPMS enumSystemActive = TPMS.valueForString(example);
		example = "TRAIN";
		TPMS enumTrain = TPMS.valueForString(example);
		example = "TRAINING_COMPLETE";
		TPMS enumTrainingComplete = TPMS.valueForString(example);
		example = "NOT_TRAINED";
		TPMS enumNotTrained = TPMS.valueForString(example);


		assertNotNull("UNKNOWN returned null", enumUnknown);
		assertNotNull("SYSTEM_FAULT returned null", enumSystemFault);
		assertNotNull("SENSOR_FAULT returned null", enumSensorFault);
		assertNotNull("LOW returned null", enumLow);
		assertNotNull("SYSTEM_ACTIVE returned null", enumSystemActive);
		assertNotNull("TRAIN returned null", enumTrain);
		assertNotNull("TRAINING_COMPLETE returned null", enumTrainingComplete);
		assertNotNull("NOT_TRAINED returned null", enumNotTrained);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = "uNKNOWN";
		try {
			TPMS temp = TPMS.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (IllegalArgumentException exception) {
            fail("Invalid enum throws IllegalArgumentException.");
		}
	}

	/**
	 * Verifies that a null assignment is invalid.
	 */
	public void testNullEnum () {
		String example = null;
		try {
			TPMS temp = TPMS.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	
	

	/**
	 * Verifies the possible enum values of TPMS.
	 */
	public void testListEnum() {
 		List<TPMS> enumValueList = Arrays.asList(TPMS.values());

		List<TPMS> enumTestList = new ArrayList<TPMS>();
		enumTestList.add(TPMS.UNKNOWN);
		enumTestList.add(TPMS.SYSTEM_FAULT);
		enumTestList.add(TPMS.SENSOR_FAULT);
		enumTestList.add(TPMS.LOW);
		enumTestList.add(TPMS.SYSTEM_ACTIVE);
		enumTestList.add(TPMS.TRAIN);
		enumTestList.add(TPMS.TRAINING_COMPLETE);
		enumTestList.add(TPMS.NOT_TRAINED);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}