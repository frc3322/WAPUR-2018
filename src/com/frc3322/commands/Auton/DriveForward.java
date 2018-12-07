package com.frc3322.commands.Auton;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class DriveForward extends TimedCommand {

    public DriveForward(String name, double timeout) {
        super(name, timeout);
        setTimeout(3);
    }
}
