package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.proxy.rpc.WindowState;
import com.smartdevicelink.test.JsonUtils;
import com.smartdevicelink.test.Test;
import junit.framework.TestCase;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link WindowState}
 */
public class WindowStateTests extends TestCase{
	
    private WindowState msg;

    @Override
    public void setUp(){
        msg = new WindowState();

        msg.setApproximatePosition(Test.GENERAL_INT);
        msg.setDeviation(Test.GENERAL_INT);
    }

    /**
	 * Tests the expected values of the RPC message.
	 */
    public void testRpcValues () {
    	// Test Values
        int approximatePosition = msg.getApproximatePosition();
        int deviation = msg.getDeviation();

        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_INT, approximatePosition);
        assertEquals(Test.MATCH, Test.GENERAL_INT, deviation);
        
        // Invalid/Null Tests
        WindowState msg = new WindowState();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getApproximatePosition());
        assertNull(Test.NULL, msg.getDeviation());
    }

    public void testJson(){
        JSONObject reference = new JSONObject();

        try{
            reference.put(WindowState.KEY_APPROXIMATE_POSITION, Test.GENERAL_INT);
            reference.put(WindowState.KEY_DEVIATION, Test.GENERAL_INT);
            
            JSONObject underTest = msg.serializeJSON();

            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while(iterator.hasNext()){
                String key = (String) iterator.next();
                assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
            }
        } catch(JSONException e){
        	fail(Test.JSON_FAIL);
        }
    }
}