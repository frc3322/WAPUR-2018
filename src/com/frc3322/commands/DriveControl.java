package com.frc3322.commands;

import com.frc3322.RobotMap;
import edu.wpi.first.wpilibj.command.Command;
import com.frc3322.Robot.*;

import static com.frc3322.Robot.drivetrain;
import static com.frc3322.Robot.oi;

public class DriveControl extends Command{

    private final int HORIZONTAL_AXIS;
    private final int VERTICAL_AXIS;
    private final int ROTATION_AXIS;

    public DriveControl(){

        requires(drivetrain);

        VERTICAL_AXIS = RobotMap.XBOX.STICK_L_Y_AXIS;
        HORIZONTAL_AXIS = RobotMap.XBOX.STICK_L_X_AXIS;
        ROTATION_AXIS = RobotMap.XBOX.STICK_R_X_AXIS;

    }

    @Override
    protected void execute() {

        double verticalInput = oi.stick.getRawAxis(VERTICAL_AXIS);
        double horizontalInput = -oi.stick.getRawAxis(HORIZONTAL_AXIS);
        double rotationInput = -oi.stick.getRawAxis(ROTATION_AXIS);

        verticalInput = (Math.abs(verticalInput) < .1) ? 0 : verticalInput;
        horizontalInput = (Math.abs(horizontalInput) < .1) ? 0 : horizontalInput;
        rotationInput = (Math.abs(rotationInput) < .1) ? 0 : rotationInput;

        drivetrain.drive(verticalInput, horizontalInput, rotationInput);

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        drivetrain.drive(0, 0, 0);
    }
}
