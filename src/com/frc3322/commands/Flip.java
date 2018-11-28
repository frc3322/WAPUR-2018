package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.blocker;
import static com.frc3322.Robot.flipper;

public class Flip extends Command {

    static boolean isFlipped = true;

    public Flip(){
        requires(flipper);
        isFlipped = !isFlipped;
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void initialize() {
     if (isFlipped) {
         Robot.flipper.unflip();
     }else {
         Robot.flipper.flip();
     }
    }
}
