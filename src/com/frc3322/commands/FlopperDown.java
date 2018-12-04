package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.flopper;

public class FlopperDown extends Command {

    public FlopperDown(){
        requires(flopper);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void initialize() {
        Robot.flopper.flopperDown();
    }
}