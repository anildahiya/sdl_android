package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.ButtonCapabilities;
import com.smartdevicelink.proxy.rpc.ModuleInfo;
import com.smartdevicelink.proxy.rpc.enums.ButtonName;
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
 * {@link com.smartdevicelink.rpc.ButtonCapabilities}
 */
public class ButtonCapabilitiesTests extends TestCase{

    private ButtonCapabilities msg;

    @Override
    public void setUp(){
        msg = new ButtonCapabilities();

        msg.setLongPressAvailable(Test.GENERAL_BOOLEAN);
        msg.setName(Test.GENERAL_BUTTONNAME);
        msg.setShortPressAvailable(Test.GENERAL_BOOLEAN);
        msg.setUpDownAvailable(Test.GENERAL_BOOLEAN);
        msg.setModuleInfo(Test.GENERAL_MODULE_INFO);
    }


    /**
	 * Tests the expected values of the RPC message.
	 */
    public void testRpcValues () {
    	// Test Values
        boolean shortPress = msg.getShortPressAvailable();
        boolean longPress = msg.getLongPressAvailable();
        boolean upDown = msg.getUpDownAvailable();
        ButtonName buttonName = msg.getName();
        ModuleInfo moduleInfo = msg.getModuleInfo();
        
        // Valid Tests
        assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, shortPress);
        assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, longPress);
        assertEquals(Test.MATCH, Test.GENERAL_BOOLEAN, upDown);
        assertEquals(Test.MATCH, Test.GENERAL_BUTTONNAME, buttonName);
        assertTrue(Test.TRUE, Validator.validateModuleInfo(Test.GENERAL_MODULE_INFO, moduleInfo));
        
        // Invalid/Null Tests
        ButtonCapabilities msg = new ButtonCapabilities();
        assertNotNull(Test.NOT_NULL, msg);

        assertNull(Test.NULL, msg.getShortPressAvailable());
        assertNull(Test.NULL, msg.getLongPressAvailable());
        assertNull(Test.NULL, msg.getUpDownAvailable());
        assertNull(Test.NULL, msg.getName());
        assertNull(Test.NULL, msg.getModuleInfo());
    }

    public void testJson(){
        JSONObject reference = new JSONObject();

        try{
            reference.put(ButtonCapabilities.KEY_SHORT_PRESS_AVAILABLE, Test.GENERAL_BOOLEAN);
            reference.put(ButtonCapabilities.KEY_LONG_PRESS_AVAILABLE, Test.GENERAL_BOOLEAN);
            reference.put(ButtonCapabilities.KEY_UP_DOWN_AVAILABLE, Test.GENERAL_BOOLEAN);
            reference.put(ButtonCapabilities.KEY_NAME, Test.GENERAL_BUTTONNAME);
            reference.put(ButtonCapabilities.KEY_MODULE_INFO, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_MODULE_INFO.getStore()));

            JSONObject underTest = msg.serializeJSON();

            assertEquals(Test.MATCH, reference.length(), underTest.length());

            Iterator<?> iterator = reference.keys();
            while(iterator.hasNext()){
                String key = (String) iterator.next();

                if (key.equals(ButtonCapabilities.KEY_MODULE_INFO)) {
                    JSONObject referenceArray = JsonUtils.readJsonObjectFromJsonObject(reference, key);
                    JSONObject underTestArray = JsonUtils.readJsonObjectFromJsonObject(underTest, key);
                    Hashtable<String, Object> hashReference = JsonRPCMarshaller.deserializeJSONObject(referenceArray);
                    Hashtable<String, Object> hashTest = JsonRPCMarshaller.deserializeJSONObject(underTestArray);

                    assertTrue(Test.TRUE, Validator.validateModuleInfo(new ModuleInfo(hashReference), new ModuleInfo(hashTest)));
                } else{
                    assertEquals(Test.MATCH, JsonUtils.readObjectFromJsonObject(reference, key), JsonUtils.readObjectFromJsonObject(underTest, key));
                }
            }
        } catch(JSONException e){
        	fail(Test.JSON_FAIL);
        }
    }    
}