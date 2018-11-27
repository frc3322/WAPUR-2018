package com.frc3322.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;



public class Blocker extends Subsystem{
    DoubleSolenoid blockerSolenoid = new DoubleSolenoid(0,1);

    public void blockerUp() {
        blockerSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void blockerDown() {
        blockerSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void blockerOff() {
        blockerSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
