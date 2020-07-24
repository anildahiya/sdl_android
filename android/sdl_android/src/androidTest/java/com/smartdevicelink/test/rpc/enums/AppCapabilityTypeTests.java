package com.smartdevicelink.test.rpc.enums;

import com.smartdevicelink.proxy.rpc.enums.AppCapabilityType;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.enums.AppCapabilityType}
 */
public class AppCapabilityTypeTests extends TestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {	
		String example = "VIDEO_STREAMING";
		AppCapabilityType enumVideoStreaming = AppCapabilityType.valueForString(example);
		
		assertNotNull("VIDEO_STREAMING returned null", enumVideoStreaming);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = "vIDEO_STREAMING";
		try {
			AppCapabilityType temp = AppCapabilityType.valueForString(example);
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
			AppCapabilityType temp = AppCapabilityType.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	
	

	/**
	 * Verifies the possible enum values of AppCapabilityType.
	 */
	public void testListEnum() {
 		List<AppCapabilityType> enumValueList = Arrays.asList(AppCapabilityType.values());

		List<AppCapabilityType> enumTestList = new ArrayList<AppCapabilityType>();
		enumTestList.add(AppCapabilityType.VIDEO_STREAMING);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}