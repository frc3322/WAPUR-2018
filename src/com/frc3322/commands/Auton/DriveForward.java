package com.frc3322.commands.Auton;

import com.frc3322.Robot;
import com.frc3322.commands.DriveControl;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.TimedCommand;

import static com.frc3322.Robot.drivetrain;

public class DriveForward extends TimedCommand {

    public DriveForward( double timeout) {
        super(timeout);
        requires(drivetrain);
    }

    @Override
    protected void execute() {
        drivetrain.drive(.3, 0, 0);
    }
    protected void end() {
        drivetrain.stop();
    }
}
