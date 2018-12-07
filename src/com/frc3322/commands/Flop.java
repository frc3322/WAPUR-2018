package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;
import static com.frc3322.Robot.*;

public class Flop extends Command {

    static boolean isFlopperUp = true;

    //Changes state of Flopper
    public Flop(){
        requires(flopper);
        isFlopperUp = !isFlopperUp;
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    //If the flopper is up, put it down, if it's down, put it up.
    @Override
    protected void initialize() {
     if (isFlopperUp) {
         Robot.flopper.flopperDown();
     } else {
         Robot.flopper.flopperUp();
     }
    }
}
