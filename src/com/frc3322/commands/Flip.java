package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.flipper;

public class Flip extends Command {


    public Flip(){
        requires(flipper);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void initialize() {
        Robot.flipper.flip();
    }
}
