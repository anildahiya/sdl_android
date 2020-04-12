package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.proxy.rpc.StabilityControlsStatus;
import com.smartdevicelink.proxy.rpc.enums.VehicleDataStatus;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;

import junit.framework.TestCase;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.StabilityControlsStatus}
 */
public class StabilityControlsStatusTests extends TestCase{

    private StabilityControlsStatus msg;

    @Override
    public void setUp(){
        msg = new StabilityControlsStatus();
        msg.setEscSystem(Test.GENERAL_VEHICLEDATASTATUS);
        msg.setTrailerSwayControl(Test.GENERAL_VEHICLEDATASTATUS);
    }

    /**
	 * Tests the expected values of the RPC message.
	 */
    public void testRpcValues () {
    	// Test Values
        VehicleDataStatus escSystem = msg.getEscSystem();
        VehicleDataStatus trailerSwayControl = msg.getTrailerSwayControl();
        
        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_VEHICLEDATASTATUS, escSystem);
        assertEquals(Test.MATCH, Test.GENERAL_VEHICLEDATASTATUS, trailerSwayControl);
        
        // Invalid/Null Tests
        StabilityControlsStatus msg = new StabilityControlsStatus();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getEscSystem());
        assertNull(Test.NULL, msg.getTrailerSwayControl());
    }

    public void testJson(){
        JSONObject reference = new JSONObject();

        try{
            reference.put(StabilityControlsStatus.KEY_ESC_SYSTEM, Test.GENERAL_VEHICLEDATASTATUS);
            reference.put(StabilityControlsStatus.KEY_TRAILER_SWAY_CONTROL, Test.GENERAL_VEHICLEDATASTATUS);

            JSONObject underTest = msg.serializeJSON();
            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
            }
        }catch(JSONException e){
        	fail(Test.JSON_FAIL);
        }
    }
}