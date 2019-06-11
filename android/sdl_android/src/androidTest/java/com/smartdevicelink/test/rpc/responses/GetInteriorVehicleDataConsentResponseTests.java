package com.smartdevicelink.test.rpc.responses;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCMessage;
import com.smartdevicelink.proxy.rpc.GetInteriorVehicleDataConsentResponse;
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
 * {@link com.smartdevicelink.rpc.GetInteriorVehicleDataConsentResponse}
 */
public class GetInteriorVehicleDataConsentResponseTests extends BaseRpcTests {

    @Override
    protected RPCMessage createMessage() {

        GetInteriorVehicleDataConsentResponse msg = new GetInteriorVehicleDataConsentResponse();

        msg.setAllowed(Test.GENERAL_BOOLEAN_LIST);

        return msg;
    }

    @Override
    protected String getMessageType() {
        return RPCMessage.KEY_RESPONSE;
    }

    @Override
    protected String getCommandType() {
        return FunctionID.GET_INTERIOR_VEHICLE_DATA_CONSENT.toString();
    }

    @Override
    protected JSONObject getExpectedParameters(int sdlVersion) {
        JSONObject result = new JSONObject();

        try {
            result.put(GetInteriorVehicleDataConsentResponse.KEY_ALLOWED, JsonUtils.createJsonArray(Test.GENERAL_BOOLEAN_LIST));
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
        List<Boolean> testAllowed = ((GetInteriorVehicleDataConsentResponse) msg).getAllowed();

        // Valid Tests
        assertTrue(Test.TRUE, Validator.validateBooleanList(Test.GENERAL_BOOLEAN_LIST, testAllowed));

        // Invalid/Null Tests
        GetInteriorVehicleDataConsentResponse msg = new GetInteriorVehicleDataConsentResponse();
        assertNotNull(Test.NOT_NULL, msg);
        testNullBase(msg);

        assertNull(Test.NULL, msg.getAllowed());
    }

    /**
     * Tests a valid JSON construction of this RPC message.
     */
    public void testJsonConstructor() {
        JSONObject commandJson = JsonFileReader.readId(this.mContext, getCommandType(), getMessageType());
        assertNotNull(Test.NOT_NULL, commandJson);

        try {
            Hashtable<String, Object> hash = JsonRPCMarshaller.deserializeJSONObject(commandJson);
            GetInteriorVehicleDataConsentResponse cmd = new GetInteriorVehicleDataConsentResponse(hash);

            JSONObject body = JsonUtils.readJsonObjectFromJsonObject(commandJson, getMessageType());
            assertNotNull(Test.NOT_NULL, body);

            // Test everything in the json body.
            assertEquals(Test.MATCH, JsonUtils.readStringFromJsonObject(body, RPCMessage.KEY_FUNCTION_NAME), cmd.getFunctionName());
            assertEquals(Test.MATCH, JsonUtils.readIntegerFromJsonObject(body, RPCMessage.KEY_CORRELATION_ID), cmd.getCorrelationID());

            JSONObject parameters = JsonUtils.readJsonObjectFromJsonObject(body, RPCMessage.KEY_PARAMETERS);

            List<Boolean> allowedList = JsonUtils.readBooleanListFromJsonObject(parameters, GetInteriorVehicleDataConsentResponse.KEY_ALLOWED);
            List<Boolean> testAllowedList = cmd.getAllowed();
            assertEquals(Test.MATCH, allowedList.size(), testAllowedList.size());
            assertTrue(Test.TRUE, Validator.validateBooleanList(allowedList, testAllowedList));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
