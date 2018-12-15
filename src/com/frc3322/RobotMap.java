/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.frc3322;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public class CAN{
        public static final int LEFT_FRONT_MOTOR = 0;
        public static final int LEFT_BACK_MOTOR = 1;
        public static final int RIGHT_FRONT_MOTOR = 2;
        public static final int RIGHT_BACK_MOTOR = 3;
    }

    public class PCM{
        public static final int FLIPPER_OUT = 0;
        public static final int FLIPPER_IN = 1;
        public static final int FLOPPER_OUT = 2;
        public static final int FLOPPER_IN = 3;

    }

    public static class XBOX{

        public static final int CONTROlLER_0 = 0;
        public static final int CONTROLLER_1 = 1;

        // Buttons
        public static final int BUTTON_A = 1;
        public static final int BUTTON_B = 2;
        public static final int BUTTON_X = 3;
        public static final int BUTTON_Y = 4;
        public static final int BUMPER_RIGHT = 6;
        public static final int BUMPER_LEFT = 5;
//        public static final int BUTTON_BACK = 7;
//        public static final int BUTTON_START = 8;
        public static final int STICK_LEFT = 9;
        public static final int STICK_RIGHT = 10;

        // Axes
        public static final int STICK_L_X_AXIS = 0;
        public static final int STICK_L_Y_AXIS = 1;
        public static final int STICK_R_X_AXIS = 4;
        public static final int STICK_R_Y_AXIS = 5;

    }

    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
