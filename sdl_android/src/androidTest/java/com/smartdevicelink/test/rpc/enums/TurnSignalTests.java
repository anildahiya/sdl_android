package com.smartdevicelink.test.rpc.enums;

import com.smartdevicelink.proxy.rpc.enums.TurnSignal;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.enums.TurnSignal}
 */
public class TurnSignalTests extends TestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {
		String example = "OFF";
		TurnSignal enumOff = TurnSignal.valueForString(example);
		example = "LEFT";
		TurnSignal enumLeft = TurnSignal.valueForString(example);
		example = "RIGHT";
		TurnSignal enumRight = TurnSignal.valueForString(example);
		example = "BOTH";
		TurnSignal enumBoth = TurnSignal.valueForString(example);

		assertNotNull("OFF returned null", enumOff);
		assertNotNull("LEFT returned null", enumLeft);
		assertNotNull("RIGHT returned null", enumRight);
		assertNotNull("BOTH returned null", enumBoth);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = "oFF";
		try {
			TurnSignal temp = TurnSignal.valueForString(example);
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
			TurnSignal temp = TurnSignal.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}

	/**
	 * Verifies the possible enum values of TurnSignal.
	 */
	public void testListEnum() {
 		List<TurnSignal> enumValueList = Arrays.asList(TurnSignal.values());

		List<TurnSignal> enumTestList = new ArrayList<TurnSignal>();
		enumTestList.add(TurnSignal.OFF);
		enumTestList.add(TurnSignal.LEFT);
		enumTestList.add(TurnSignal.RIGHT);
		enumTestList.add(TurnSignal.BOTH);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}