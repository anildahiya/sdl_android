package com.smartdevicelink.proxy.rpc.enums;

public enum AudioStreamingIndicator {
	/** Default playback indicator.
	 */
    PLAY_PAUSE,
    /** Indicates that a button press of the Play/Pause button would start the playback.
     */
    PLAY,
    /** Indicates that a button press of the Play/Pause button would pause the current playback.
     */
    PAUSE,
    /** Indicates that a button press of the Play/Pause button would stop the current playback.
     */
    STOP,
    ;
    /**
     * Convert String to AudioStreamingIndicator
     * @param value String
     * @return AudioStreamingIndicator
     */
    public static AudioStreamingIndicator valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
