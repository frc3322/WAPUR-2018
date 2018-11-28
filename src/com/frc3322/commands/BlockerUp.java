package com.frc3322.commands;

import com.frc3322.Robot;
import edu.wpi.first.wpilibj.command.Command;
import static com.frc3322.Robot.*;

public class BlockerUp extends Command {

    static boolean isBlockerUp = true;

    public BlockerUp(){
        requires(blocker);
        isBlockerUp = !isBlockerUp;
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void initialize() {
     if (isBlockerUp) {
         Robot.blocker.blockerDown();
     }else {
         Robot.blocker.blockerUp();
     }
    }
}
