package com.smartdevicelink.proxy.rpc;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

/**
 * Creates a Choice Set which can be used in subsequent <i>
 * {@linkplain PerformInteraction}</i> Operations.
 * <p>
 * Function Group: Base 
 * <p>
 * <b>HMILevel needs to be FULL, LIMITED or BACKGROUND</b>
 * <p>
 * AudioStreamingState : ANY<br>
 * <p>
 * SystemContext: MAIN, MENU, VR<br>
 * </p>
 * <p><b>Parameter List</b><br>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Name</th>
 * 			<th>Type</th>
 * 			<th>Description</th>
 *                 <th>Reg.</th>
 *               <th>Notes</th>
 * 			<th>Version</th>
 * 		</tr>
 * 		<tr>
 * 			<td>interactionChoiceSetID</td>
 * 			<td>Int32</td>
 * 			<td>A unique ID that identifies the Choice Set</td>
 *                 <td>Y</td>
 *                 <td>Min Value: 0<br>Max Value: 2000000000</td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>choiceSet</td>
 * 			<td>Choice[]</td>
 * 			<td>Array of one or more elements.</td>
 *                 <td>Y</td>
 *                 <td>Min Value: 1<br>Max Value: 100</td>
 * 			<td>SmartDeviceLink 1.0 </td>
 * 		</tr>
 *  </table>
 *  <p>
 *   
 *  <b>Note:</b><br>Second Utterance issue with CreateInteractionChoiceSet RPC. <br> Before a perform interaction
 * is sent you MUST wait for the success from the CreateInteractionChoiceSet RPC.<br>
 * If you do not wait the system may not recognize the first utterance from the user.
 * </p>
 * <b>Response</b><br>
 *<p>
 * Indicates that the corresponding request either failed or succeeded. If the response returns with a SUCCESS result code, this means the Choice Set was created. 
 * <p>
 * <b>Non-default Result Codes:</b><br>
 * �	SUCCESS<br>
 * �	INVALID_DATA<br>
 * �	OUT_OF_MEMORY<br>
 * �	TOO_MANY_PENDING_REQUESTS<br>
 * �	APPLICATION_NOT_REGISTERED<br>
 * �	GENERIC_ERROR<br>
 * �	REJECTED<br> 
 * � INVALID_ID<br>
 * � DUPLICATE_NAME<br>
 * � UNSUPPORTED_RESOURCE <br>    
 *  <p>
 * 
 * @since SmartDeviceLink 1.0
 * @see DeleteInteractionChoiceSet
 * @see PerformInteraction
 */
public class CreateInteractionChoiceSet extends RPCRequest {
	public static final String KEY_CHOICE_SET = "choiceSet";
	public static final String KEY_INTERACTION_CHOICE_SET_ID = "interactionChoiceSetID";

	/**
	 * Constructs a new CreateInteractionChoiceSet object
	 */    
	public CreateInteractionChoiceSet() {
        super(FunctionID.CREATE_INTERACTION_CHOICE_SET.toString());
    }
	/**
	 * Constructs a new CreateInteractionChoiceSet object indicated by the
	 * Hashtable parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */	
    public CreateInteractionChoiceSet(Hashtable<String, Object> hash) {
        super(hash);
    }
	/**
	 * Gets the Choice Set unique ID
	 * 
	 * @return Integer -an Integer representing the Choice Set ID
	 */    
    public Integer getInteractionChoiceSetID() {
        return (Integer) parameters.get( KEY_INTERACTION_CHOICE_SET_ID );
    }
	/**
	 * Sets a unique ID that identifies the Choice Set
	 * 
	 * @param interactionChoiceSetID
	 *            an Integer value representing the Choice Set ID
	 *            <p>
	 *            <b>Notes: </b>Min Value: 0; Max Value: 2000000000
	 */    
    public void setInteractionChoiceSetID( Integer interactionChoiceSetID ) {
        if (interactionChoiceSetID != null) {
            parameters.put(KEY_INTERACTION_CHOICE_SET_ID, interactionChoiceSetID );
        } else {
        	parameters.remove(KEY_INTERACTION_CHOICE_SET_ID);
        }
    }
	/**
	 * Gets Choice Set Array of one or more elements
	 * 
	 * @return List<Choice> -a List<Choice> representing the array of one or
	 *         more elements
	 */   
    @SuppressWarnings("unchecked") 
    public List<Choice> getChoiceSet() {
        if (parameters.get(KEY_CHOICE_SET) instanceof List<?>) {
        	List<?> list = (List<?>)parameters.get(KEY_CHOICE_SET);
	        if (list != null && list.size() > 0) {
	            Object obj = list.get(0);
	            if (obj instanceof Choice) {
	                return (List<Choice>) list;
	            } else if (obj instanceof Hashtable) {
	            	List<Choice> newList = new ArrayList<Choice>();
	                for (Object hashObj : list) {
	                    newList.add(new Choice((Hashtable<String, Object>)hashObj));
	                }
	                return newList;
	            }
	        }
        }
        return null;
    }
	/**
	 * Sets a Choice Set that is an Array of one or more elements
	 * 
	 * @param choiceSet
	 *            a List<Choice> representing the array of one or more
	 *            elements
	 *            <p>
	 *            <b>Notes: </b>Min Value: 1; Max Value: 100
	 */    
    public void setChoiceSet( List<Choice> choiceSet ) {
        if (choiceSet != null) {
            parameters.put(KEY_CHOICE_SET, choiceSet );
        } else {
        	parameters.remove(KEY_CHOICE_SET);
        }
    }
}
