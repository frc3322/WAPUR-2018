package com.frc3322.commands;

import com.frc3322.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.drivetrain;

public class DriveControl extends Command{

    private final int HORIZONTAL_AXIS;
    private final int VERTICAL_AXIS;
    private final int ROTATION_AXIS;

    public DriveControl(){

        requires(drivetrain);

        HORIZONTAL_AXIS = RobotMap.XBOX.STICK_L_X_AXIS;
        VERTICAL_AXIS = RobotMap.XBOX.STICK_L_Y_AXIS;
        ROTATION_AXIS = RobotMap.XBOX.STICK_R_X_AXIS;

    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
