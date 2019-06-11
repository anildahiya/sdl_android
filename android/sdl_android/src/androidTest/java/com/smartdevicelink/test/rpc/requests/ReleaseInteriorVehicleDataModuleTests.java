package com.smartdevicelink.test.rpc.requests;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCMessage;
import com.smartdevicelink.proxy.rpc.ReleaseInteriorVehicleDataModule;
import com.smartdevicelink.proxy.rpc.enums.ModuleType;
import com.smartdevicelink.test.BaseRpcTests;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.json.rpc.JsonFileReader;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Hashtable;

/**
 * This is a unit test class for the SmartDeviceLink library project class :
 * {@link com.smartdevicelink.rpc.ReleaseInteriorVehicleDataModule}
 */
public class ReleaseInteriorVehicleDataModuleTests extends BaseRpcTests {

    @Override
    protected RPCMessage createMessage() {
        ReleaseInteriorVehicleDataModule msg = new ReleaseInteriorVehicleDataModule();

        msg.setModuleType(Test.GENERAL_MODULETYPE);
        msg.setModuleId(Test.GENERAL_STRING);

        return msg;
    }

    @Override
    protected String getMessageType() {
        return RPCMessage.KEY_REQUEST;
    }

    @Override
    protected String getCommandType() {
        return FunctionID.RELEASE_INTERIOR_VEHICLE_DATA_MODULE.toString();
    }

    @Override
    protected JSONObject getExpectedParameters(int sdlVersion) {
        JSONObject result = new JSONObject();

        try {
            result.put(ReleaseInteriorVehicleDataModule.KEY_MODULE_TYPE, Test.GENERAL_MODULETYPE);
            result.put(ReleaseInteriorVehicleDataModule.KEY_MODULE_ID, Test.GENERAL_STRING);
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
        ModuleType testModuleType = ((ReleaseInteriorVehicleDataModule) msg).getModuleType();
        String moduleId = ((ReleaseInteriorVehicleDataModule) msg).getModuleId();

        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_MODULETYPE, testModuleType);
        assertEquals(Test.MATCH, Test.GENERAL_STRING, moduleId);

        // Invalid/Null Tests
        ReleaseInteriorVehicleDataModule msg = new ReleaseInteriorVehicleDataModule();
        assertNotNull(Test.NOT_NULL, msg);
        testNullBase(msg);

        assertNull(Test.NULL, msg.getModuleType());
        assertNull(Test.NULL, msg.getModuleId());
    }

    /**
     * Tests a valid JSON construction of this RPC message.
     */
    public void testJsonConstructor() {
        JSONObject commandJson = JsonFileReader.readId(this.mContext, getCommandType(), getMessageType());
        assertNotNull(Test.NOT_NULL, commandJson);

        try {
            Hashtable<String, Object> hash = JsonRPCMarshaller.deserializeJSONObject(commandJson);
            ReleaseInteriorVehicleDataModule cmd = new ReleaseInteriorVehicleDataModule(hash);

            JSONObject body = JsonUtils.readJsonObjectFromJsonObject(commandJson, getMessageType());
            assertNotNull(Test.NOT_NULL, body);

            // Test everything in the json body.
            assertEquals(Test.MATCH, JsonUtils.readStringFromJsonObject(body, RPCMessage.KEY_FUNCTION_NAME), cmd.getFunctionName());
            assertEquals(Test.MATCH, JsonUtils.readIntegerFromJsonObject(body, RPCMessage.KEY_CORRELATION_ID), cmd.getCorrelationID());

            JSONObject parameters = JsonUtils.readJsonObjectFromJsonObject(body, RPCMessage.KEY_PARAMETERS);

            assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(parameters, ReleaseInteriorVehicleDataModule.KEY_MODULE_TYPE).toString(), cmd.getModuleType().toString());
            assertEquals(Test.MATCH, JsonUtils.readStringFromJsonObject(parameters, ReleaseInteriorVehicleDataModule.KEY_MODULE_ID), cmd.getModuleId());
        } catch (JSONException e) {
            fail(Test.JSON_FAIL);
        }
    }
}