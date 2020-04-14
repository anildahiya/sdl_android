package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.ClimateData;
import com.smartdevicelink.proxy.rpc.Temperature;
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
 * {@link com.smartdevicelink.rpc.ClimateData}
 */
public class ClimateDataTests extends TestCase{
	
    private ClimateData msg;

    @Override
    public void setUp(){
        msg = new ClimateData();

        msg.setExternalTemperature(Test.GENERAL_TEMPERATURE);
        msg.setCabinTemperature(Test.GENERAL_TEMPERATURE);
        msg.setAtmosphericPressure(Test.GENERAL_FLOAT);
    }

    /**
	 * Tests the expected values of the RPC message.
	 */
    public void testRpcValues () {
        // Test Values
        Temperature externalTemperature = msg.getExternalTemperature();
        Temperature cabinTemperature = msg.getCabinTemperature();
        float atmosphericPressure = msg.getAtmosphericPressure();

        // Valid Tests
        assertTrue(Test.TRUE, Validator.validateTemperature(Test.GENERAL_TEMPERATURE, externalTemperature));
        assertTrue(Test.TRUE, Validator.validateTemperature(Test.GENERAL_TEMPERATURE, cabinTemperature));
        assertEquals(Test.MATCH, Test.GENERAL_FLOAT, atmosphericPressure);

        // Invalid/Null Tests
        ClimateData msg = new ClimateData();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getExternalTemperature());
        assertNull(Test.NULL, msg.getCabinTemperature());
        assertNull(Test.NULL, msg.getAtmosphericPressure());
    }

    public void testJson(){
        JSONObject reference = new JSONObject();

        try{
            reference.put(ClimateData.KEY_EXTERNAL_TEMPERATURE, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_TEMPERATURE.getStore()));
            reference.put(ClimateData.KEY_CABIN_TEMPERATURE, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_TEMPERATURE.getStore()));
            reference.put(ClimateData.KEY_ATMOSPHERIC_PRESSURE, (Float) Test.GENERAL_FLOAT);

            JSONObject underTest = msg.serializeJSON();
            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while(iterator.hasNext()){
                String key = (String) iterator.next();

                if(key.equals(ClimateData.KEY_EXTERNAL_TEMPERATURE)){
                    JSONObject objectEquals = (JSONObject) JsonUtils.readObjectFromJsonObject(reference, key);
                    JSONObject testEquals = (JSONObject) JsonUtils.readObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(objectEquals);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(testEquals);
                    assertTrue(Test.TRUE, Validator.validateTemperature( new Temperature(hashReference), new Temperature(hashTest)));
                } else if(key.equals(ClimateData.KEY_CABIN_TEMPERATURE)){
                    JSONObject objectEquals = (JSONObject) JsonUtils.readObjectFromJsonObject(reference, key);
                    JSONObject testEquals = (JSONObject) JsonUtils.readObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(objectEquals);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(testEquals);
                    assertTrue(Test.TRUE, Validator.validateTemperature( new Temperature(hashReference), new Temperature(hashTest)));
                } else{
                    assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
                }
            }
        } catch(JSONException e){
        	fail(Test.JSON_FAIL);
        }
    }
}