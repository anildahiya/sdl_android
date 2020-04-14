package com.smartdevicelink.test.rpc.enums;

import com.smartdevicelink.proxy.rpc.enums.TransmissionType;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.enums.TransmissionType}
 */
public class TransmissionTypeTests extends TestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums() {
		String example = "MANUAL";
		TransmissionType enumManual = TransmissionType.valueForString(example);
		example = "AUTOMATIC";
		TransmissionType enumAutomatic = TransmissionType.valueForString(example);
		example = "SEMI_AUTOMATIC";
		TransmissionType enumSemiAutomatic = TransmissionType.valueForString(example);
		example = "DUAL_CLUTCH";
		TransmissionType enumDualClutch = TransmissionType.valueForString(example);
		example = "CONTINUOUSLY_VARIABLE";
		TransmissionType enumContinuouslyVariable = TransmissionType.valueForString(example);
		example = "INFINITELY_VARIABLE";
		TransmissionType enumInfinitelyVariable = TransmissionType.valueForString(example);
		example = "ELECTRIC_VARIABLE";
		TransmissionType enumElectricVariable = TransmissionType.valueForString(example);
		example = "DIRECT_DRIVE";
		TransmissionType enumDirectDrive = TransmissionType.valueForString(example);

		assertNotNull("MANUAL returned null", enumManual);
		assertNotNull("AUTOMATIC returned null", enumAutomatic);
		assertNotNull("SEMI_AUTOMATIC returned null", enumSemiAutomatic);
		assertNotNull("DUAL_CLUTCH returned null", enumDualClutch);
		assertNotNull("CONTINUOUSLY_VARIABLE returned null", enumContinuouslyVariable);
		assertNotNull("INFINITELY_VARIABLE returned null", enumInfinitelyVariable);
		assertNotNull("ELECTRIC_VARIABLE returned null", enumElectricVariable);
		assertNotNull("DIRECT_DRIVE returned null", enumDirectDrive);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum() {
		String example = "mANUAL";
		try {
			TransmissionType temp = TransmissionType.valueForString(example);
			assertNull("Result of valueForString should be null.", temp);
		} catch (IllegalArgumentException exception) {
			fail("Invalid enum throws IllegalArgumentException.");
		}
	}

	/**
	 * Verifies that a null assignment is invalid.
	 */
	public void testNullEnum() {
		String example = null;
		try {
			TransmissionType temp = TransmissionType.valueForString(example);
			assertNull("Result of valueForString should be null.", temp);
		} catch (NullPointerException exception) {
			fail("Null string throws NullPointerException.");
		}
	}

	/**
	 * Verifies the possible enum values of TransmissionType.
	 */
	public void testListEnum() {
		List<TransmissionType> enumValueList = Arrays.asList(TransmissionType.values());

		List<TransmissionType> enumTestList = new ArrayList<TransmissionType>();
		enumTestList.add(TransmissionType.MANUAL);
		enumTestList.add(TransmissionType.AUTOMATIC);
		enumTestList.add(TransmissionType.SEMI_AUTOMATIC);
		enumTestList.add(TransmissionType.DUAL_CLUTCH);
		enumTestList.add(TransmissionType.CONTINUOUSLY_VARIABLE);
		enumTestList.add(TransmissionType.INFINITELY_VARIABLE);
		enumTestList.add(TransmissionType.ELECTRIC_VARIABLE);
		enumTestList.add(TransmissionType.DIRECT_DRIVE);

		assertTrue("Enum value list does not match enum class list",
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}
}