package com.smartdevicelink.proxy.rpc.enums;

public enum LightName {

    /*Common Single Light 0~500*/

    FRONT_LEFT_HIGH_BEAM(0),
    FRONT_RIGHT_HIGH_BEAM(1),
    FRONT_LEFT_LOW_BEAM(2),
    FRONT_RIGHT_LOW_BEAM(3),
    FRONT_LEFT_PARKING_LIGHT(4),
    FRONT_RIGHT_PARKING_LIGHT(5),
    FRONT_LEFT_FOG_LIGHT(6),
    FRONT_RIGHT_FOG_LIGHT(7),
    FRONT_LEFT_DAYTIME_RUNNING_LIGHT(8),
    FRONT_RIGHT_DAYTIME_RUNNING_LIGHT(9),
    FRONT_LEFT_TURN_LIGHT(10),
    FRONT_RIGHT_TURN_LIGHT(11),
    REAR_LEFT_FOG_LIGHT(12),
    REAR_RIGHT_FOG_LIGHT(13),
    REAR_LEFT_TAIL_LIGHT(14),
    REAR_RIGHT_TAIL_LIGHT(15),
    REAR_LEFT_BREAK_LIGHT(16),
    REAR_RIGHT_BREAK_LIGHT(17),
    REAR_LEFT_TURN_LIGHT(18),
    REAR_RIGHT_TURN_LIGHT(19),
    REAR_REGISTRATION_PLATE_LIGHT(20),

    /*Exterior Lights by common function groups 501~800*/

    /**
     * Include all high beam lights: front_left and front_right.
     */
    HIGH_BEAMS(501),
    /**
     * Include all low beam lights: front_left and front_right.
     */
    LOW_BEAMS(502),
    /**
     * Include all fog lights: front_left, front_right, rear_left and rear_right.
     */
    FOG_LIGHTS(503),
    /**
     * Include all daytime running lights: front_left and front_right.
     */
    RUNNING_LIGHTS(504),
    /**
     * Include all parking lights: front_left and front_right.
     */
    PARKING_LIGHTS(505),
    /**
     * Include all brake lights: rear_left and rear_right.
     */
    BRAKE_LIGHTS(506),

    REAR_REVERSING_LIGHTS(507),
    SIDE_MARKER_LIGHTS(508),

    /**
     * Include all left turn signal lights: front_left, rear_left, left_side and mirror_mounted.
     */
    LEFT_TURN_LIGHTS(509),
    /**
     * Include all right turn signal lights: front_right, rear_right, right_side and mirror_mounted.
     */
    RIGHT_TURN_LIGHTS(510),
    /**
     * Include all hazard lights: front_left, front_right, rear_left and rear_right.
     */
    HAZARD_LIGHTS(511),



    /*Interior Lights by common function groups 801~900*/

    AMBIENT_LIGHTS(801),
    OVERHEAD_LIGHTS(802),
    READING_LIGHTS(803),
    TRUNK_LIGHTS(804),


    /*Lights by location 901~1000*/

    /**
     * Include exterior lights located in front of the vehicle. For example, fog lights and low beams.
     */
    EXTERIOR_FRONT_LIGHTS(901),
    /**
     * Include exterior lights located at the back of the vehicle. For example, license plate lights, reverse lights, cargo lights, bed lights an trailer assist lights.
     */
    EXTERIOR_REAR_LIGHTS(902),
    /**
     * Include exterior lights located at the left side of the vehicle. For example, left puddle lights and spot lights.
     */
    EXTERIOR_LEFT_LIGHTS(903),
    /**
     * Include exterior lights located at the right side of the vehicle. For example, right puddle lights and spot lights.
     */
    EXTERIOR_RIGHT_LIGHTS(904),

    ;

    private final int  VALUE;

    private LightName(int value){
        this.VALUE = value;
    }


    public int getValue(){
        return this.VALUE;
    }

    public static LightName valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
