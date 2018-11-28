package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.blocker;

public class BlockerDown extends Command {

    public BlockerDown(){
        requires(blocker);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void initialize() {
        Robot.blocker.blockerDown();
    }
}
