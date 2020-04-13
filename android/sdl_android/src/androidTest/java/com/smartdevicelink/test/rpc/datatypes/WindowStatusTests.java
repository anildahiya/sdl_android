package com.smartdevicelink.test.rpc.datatypes;

import com.smartdevicelink.marshal.JsonRPCMarshaller;
import com.smartdevicelink.proxy.rpc.Grid;
import com.smartdevicelink.proxy.rpc.WindowState;
import com.smartdevicelink.proxy.rpc.WindowStatus;
import com.smartdevicelink.test.Test;
import com.smartdevicelink.test.Validator;

import junit.framework.TestCase;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Hashtable;

public class WindowStatusTests extends TestCase {
	private WindowStatus msg;

	@Override
	public void setUp() {
		msg = new WindowStatus();
		msg.setLocation(Test.GENERAL_GRID);
		msg.setState(Test.GENERAL_WINDOW_STATE);
	}

	public void testRpcValues() {
		Grid location = msg.getLocation();
		WindowState state = msg.getState();

		//valid tests
		assertEquals(Test.MATCH, Test.GENERAL_GRID, location);
		assertEquals(Test.MATCH, Test.GENERAL_WINDOW_STATE, state);

		//null test
		WindowStatus msg = new WindowStatus();
		assertNotNull(Test.NOT_NULL, msg);
		assertNull(Test.NULL, msg.getLocation());
		assertNull(Test.NULL, msg.getState());

		//test required params constructor
		WindowStatus msg2 = new WindowStatus(Test.GENERAL_GRID, Test.GENERAL_WINDOW_STATE);
		assertNotNull(Test.NOT_NULL, msg2);
	}

	public void testJson() {
		JSONObject original = new JSONObject();
		try {
			original.put(WindowStatus.KEY_LOCATION, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_GRID.getStore()));
			original.put(WindowStatus.KEY_STATE, JsonRPCMarshaller.serializeHashtable(Test.GENERAL_WINDOW_STATE.getStore()));

			JSONObject serialized = msg.serializeJSON();
			assertEquals(Test.MATCH, original.length(), serialized.length());

			Hashtable<String, Object> h1 = JsonRPCMarshaller.deserializeJSONObject(original);
			Hashtable<String, Object> h2 = JsonRPCMarshaller.deserializeJSONObject(serialized);
			assertTrue(Test.TRUE, Validator.validateWindowStatus(new WindowStatus(h1), new WindowStatus(h2)));
		} catch (JSONException e) {
			fail(Test.JSON_FAIL);
		}
	}
}
