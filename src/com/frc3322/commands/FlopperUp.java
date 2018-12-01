package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;
import static com.frc3322.Robot.*;

public class FlopperUp extends Command {

    static boolean isFlopperUp = true;

    public FlopperUp(){
        requires(flopper);
        isFlopperUp = !isFlopperUp;
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void initialize() {
     if (isFlopperUp) {
         Robot.flopper.flopperDown();
     }else {
         Robot.flopper.flopperUp();
     }
    }
}
