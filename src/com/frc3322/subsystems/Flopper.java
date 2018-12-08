package com.frc3322.subsystems;

import com.frc3322.Robot;
import com.frc3322.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;


//this is the flopper subsystem (AKA blocker).
//It is placed on top of the robot and is designed to block incoming balls from above
public class Flopper extends Subsystem{
    boolean isFlopped;
    DoubleSolenoid flopperSolenoid = new DoubleSolenoid(RobotMap.PCM.FLOPPER_OUT,RobotMap.PCM.FLOPPER_IN);

    public void flop(){
        if(isFlopped){
            flopperDown();
        }else{
            flopperUp();
        }
    }

    public void flopperUp() {
        flopperSolenoid.set(DoubleSolenoid.Value.kForward);
        isFlopped = true;
    }

    public void flopperDown() {
        flopperSolenoid.set(DoubleSolenoid.Value.kReverse);
        isFlopped = false;
    }

    public void flopperOff() {
        flopperSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    @Override
    protected void initDefaultCommand() {
        flopperDown();
    }
}
