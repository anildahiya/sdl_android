package com.smartdevicelink.proxy.rpc.listeners;

import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.Result;

public abstract class OnRPCResponseListener {

	/**
	 * Stores what type of listener this instance is. This prevents of from having to use reflection
	 */
	String functionName;
	
	/**
	 * This is the base listener for all RPCs.
	 */
	public OnRPCResponseListener(String functionName){
		setFunctionName(functionName);
	}

	private void setFunctionName(String functionName){
		this.functionName = functionName;
	}

	public String getFunctionName(){
		return this.functionName;
	}
	
	/* *****************************************************************
	 ************************* Event Callbacks *************************
	 *******************************************************************/
	
	/**
	 * This method will be called once the packet has been entered into the queue of messages to send
	 * @param correlationId
	 */
	public void onStart(int correlationId){
		
	};

	/**
	 * This is the only method that must be extended. Other methods that are able to be extended are 
	 * onStart and onError.
	 * @param correlationId
	 * @param response This will be the response message received from the core side. It should be cast into a corresponding RPC Response type. ie, if setting this
	 * for a PutFile request, the message parameter should be cast to a PutFileResponse class.
	 */
	public abstract void onResponse(int correlationId, final RPCResponse response);
	
	/**
	 * Called when there was some sort of error during the original request.
	 * @param correlationId
	 * @param resultCode
	 * @param info
	 */
	public void onError(int correlationId, Result resultCode, String info){
		
	};
	

	
}
