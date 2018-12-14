package com.frc3322.commands.Auton;

import com.frc3322.Robot;
import com.frc3322.subsystems.Flipper;
import edu.wpi.first.wpilibj.command.Command;

public class FlipperOut extends Command{
    public FlipperOut(){
        requires(Robot.flipper);
    }

    @Override
    protected void initialize(){
        Robot.flipper.flipperOut();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
