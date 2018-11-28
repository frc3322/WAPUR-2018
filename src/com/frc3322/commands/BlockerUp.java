package com.frc3322.commands;

import com.frc3322.subsystems.Blocker;
import edu.wpi.first.wpilibj.command.Command;
import static com.frc3322.Robot.*;

public class BlockerUp extends Command {

    public BlockerUp(){
        requires(blocker);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
