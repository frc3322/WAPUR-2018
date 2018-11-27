package com.frc3322.commands;

import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.drivetrain;

public class TurnAround extends Command {
    private double initAngle;
    private double targetAngle;

    public TurnAround(){

        requires(drivetrain);

        initAngle = drivetrain.navx.getAngle();
        targetAngle = initAngle + 360;
    }

    @Override
    protected void execute() {
        drivetrain.drive(0, 0, -1);
    }

    @Override
    protected boolean isFinished() {
        return Math.abs(targetAngle - drivetrain.navx.getAngle()) < 3 || isTimedOut();
    }
}
