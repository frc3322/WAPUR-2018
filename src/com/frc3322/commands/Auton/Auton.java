package com.frc3322.commands.Auton;

import edu.wpi.first.wpilibj.command.CommandGroup;

import static com.frc3322.Robot.drivetrain;

public class Auton extends CommandGroup{
    public Auton(){
        addParallel(new FlipperOut());
        addSequential(new DriveForward(2));
    }

}
