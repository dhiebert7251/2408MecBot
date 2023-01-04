// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    //drive motors CAN address
    public static final int FRONT_LEFT_MOTOR = 20;
    public static final int FRONT_RIGHT_MOTOR = 21;
    public static final int BACK_LEFT_MOTOR = 22;
    public static final int BACK_RIGHT_MOTOR = 23;

    //motor inversion
    public static final boolean FRONT_LEFT_MOTOR_INVERTED = false;
    public static final boolean FRONT_RIGHT_MOTOR_INVERTED = true;
    public static final boolean BACK_LEFT_MOTOR_INVERTED = false;
    public static final boolean BACK_RIGHT_MOTOR_INVERTED = true;

    //robot specs
    public static final double WHEEL_DIAMETER_IN = 6;
    public static final double IN_TO_METERS = 0.0254;
    public static final double WHEEL_DIAMETER_M = WHEEL_DIAMETER_IN * IN_TO_METERS;
    public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER_M * Math.PI;

    //drivetrain feedforward - change for our robot
    public static final double FF_STATIC_GAIN = 1;
    public static final double FF_VELOCITY_GAIN = 3;

    //joysticks
    public static final int DRIVER_JOYSTICK = 0;
    public static final int OPERATOR_JOYSTICK = 1;

    
	//Joystick button/axis maps
    public static final int DRIVER_JOYSTICK_LEFT_X_AXIS = 0;
	public static final int DRIVER_JOYSTICK_LEFT_Y_AXIS = 1;
    public static final int DRIVER_JOYSTICK_RIGHT_X_AXIS = 2;
	public static final int DRIVER_JOYSTICK_RIGHT_Y_AXIS = 3;

	public static final int DRIVER_LEFT = 1;
	public static final int DRIVER_DOWN = 2;	
    public static final int DRIVER_RIGHT = 3;
	public static final int DRIVER_UP = 4;
	public static final int DRIVER_SHOULDER_TOP_LEFT = 5;
	public static final int DRIVER_SHOULDER_TOP_RIGHT = 6;
	public static final int DRIVER_SHOULDER_BOTTOM_LEFT = 7;
	public static final int DRIVER_SHOULDER_BOTTOM_RIGHT = 8;
	public static final int DRIVER_LEFT_JOYSTICK = 9;
	public static final int DRIVER_RIGHT_JOYSTICK = 10;

    public static final int OPERATOR_JOYSTICK_LEFT_X_AXIS = 0;
	public static final int OPERATOR_JOYSTICK_LEFT_Y_AXIS = 1;
    public static final int OPERATOR_JOYSTICK_RIGHT_X_AXIS = 2;
	public static final int OPERATOR_JOYSTICK_RIGHT_Y_AXIS = 3;

	public static final int OPERATOR_LEFT = 1;
	public static final int OPERATOR_DOWN = 2;
    public static final int OPERATOR_RIGHT = 3;
	public static final int OPERATOR_UP = 4;
	public static final int OPERATOR_SHOULDER_TOP_LEFT = 5;
	public static final int OPERATOR_SHOULDER_TOP_RIGHT = 6;
	public static final int OPERATOR_SHOULDER_BOTTOM_LEFT = 7;
	public static final int OPERATOR_SHOULDER_BOTTOM_RIGHT = 8;
	public static final int OPERATOR_MID_LEFT = 9;
	public static final int OPERATOR_MID_RIGHT = 10;
	public static final int OPERATOR_LEFT_JOYSTICK = 11;
	public static final int OPERATOR_RIGHT_JOYSTICK = 12;


}
