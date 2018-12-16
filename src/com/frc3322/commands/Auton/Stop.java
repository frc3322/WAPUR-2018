package com.frc3322.commands.Auton;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command {
    public Stop(){
        requires(Robot.drivetrain);
    }
    @Override
    protected void execute() {
        Robot.drivetrain.stop();
    }


    @Override
    protected boolean isFinished() {
        return false;
    }
}
