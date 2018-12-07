package com.frc3322.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;


//this is the flopper subsystem (AKA blocker).
//It is placed on top of the robot and is designed to block incoming balls from above
public class Flopper extends Subsystem{
    DoubleSolenoid flopperSolenoid = new DoubleSolenoid(0,1);

    public void flopperUp() {
        flopperSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void flopperDown() {
        flopperSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void flopperOff() {
        flopperSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
