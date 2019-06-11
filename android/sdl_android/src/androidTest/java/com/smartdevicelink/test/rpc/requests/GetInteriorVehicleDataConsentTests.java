package com.smartdevicelink.test.rpc.requests;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCMessage;
import com.smartdevicelink.proxy.rpc.GetInteriorVehicleDataConsent;
import com.smartdevicelink.proxy.rpc.enums.ModuleType;
import com.smartdevicelink.test.BaseRpcTests;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;
import com.smartdevicelink.test.json.rpc.JsonFileReader;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Hashtable;
import java.util.List;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.GetInteriorVehicleDataConsent}
 */
public class GetInteriorVehicleDataConsentTests extends BaseRpcTests {

    @Override
    protected RPCMessage createMessage() {
        GetInteriorVehicleDataConsent msg = new GetInteriorVehicleDataConsent();

        msg.setModuleType(Test.GENERAL_MODULETYPE);
        msg.setModuleIds(Test.GENERAL_STRING_LIST);

        return msg;
    }

    @Override
    protected String getMessageType() {
        return RPCMessage.KEY_REQUEST;
    }

    @Override
    protected String getCommandType() {
        return FunctionID.GET_INTERIOR_VEHICLE_DATA_CONSENT.toString();
    }

    @Override
    protected JSONObject getExpectedParameters(int sdlVersion) {
        JSONObject result = new JSONObject();

        try {
            result.put(GetInteriorVehicleDataConsent.KEY_MODULE_TYPE, Test.GENERAL_MODULETYPE);
            result.put(GetInteriorVehicleDataConsent.KEY_MODULE_IDS, JsonUtils.createJsonArray(Test.GENERAL_STRING_LIST));
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }

        return result;
    }

    /**
     * Tests the expected values of the RPC message.
     */
    public void testRpcValues() {
        // Test Values
        ModuleType testModuleType = ((GetInteriorVehicleDataConsent) msg).getModuleType();
        List<String> testModuleIds = ((GetInteriorVehicleDataConsent) msg).getModuleIds();

        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_MODULETYPE, testModuleType);
        assertTrue(Test.TRUE, Validator.validateStringList(Test.GENERAL_STRING_LIST, testModuleIds));

        // Invalid/Null Tests
        GetInteriorVehicleDataConsent msg = new GetInteriorVehicleDataConsent();
        assertNotNull(Test.NOT_NULL, msg);
        testNullBase(msg);

        assertNull(Test.NULL, msg.getModuleType());
        assertNull(Test.NULL, msg.getModuleIds());
    }

    /**
     * Tests a valid JSON construction of this RPC message.
     */
    public void testJsonConstructor() {
        JSONObject commandJson = JsonFileReader.readId(this.mContext, getCommandType(), getMessageType());
        assertNotNull(Test.NOT_NULL, commandJson);

        try {
            Hashtable<String, Object> hash = JsonRPCMarshaller.deserializeJSONObject(commandJson);
            GetInteriorVehicleDataConsent cmd = new GetInteriorVehicleDataConsent(hash);

            JSONObject body = JsonUtils.readJsonObjectFromJsonObject(commandJson, getMessageType());
            assertNotNull(Test.NOT_NULL, body);

            // Test everything in the json body.
            assertEquals(Test.MATCH, JsonUtils.readStringFromJsonObject(body, RPCMessage.KEY_FUNCTION_NAME), cmd.getFunctionName());
            assertEquals(Test.MATCH, JsonUtils.readIntegerFromJsonObject(body, RPCMessage.KEY_CORRELATION_ID), cmd.getCorrelationID());

            JSONObject parameters = JsonUtils.readJsonObjectFromJsonObject(body, RPCMessage.KEY_PARAMETERS);

            assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(parameters, GetInteriorVehicleDataConsent.KEY_MODULE_TYPE).toString(), cmd.getModuleType().toString());

            List<String> moduleIdList = JsonUtils.readStringListFromJsonObject(parameters, GetInteriorVehicleDataConsent.KEY_MODULE_IDS);
            List<String> testModuleIdList = cmd.getModuleIds();
            assertEquals(Test.MATCH, moduleIdList.size(), testModuleIdList.size());
            assertTrue(Test.TRUE, Validator.validateStringList(moduleIdList, testModuleIdList));

        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}