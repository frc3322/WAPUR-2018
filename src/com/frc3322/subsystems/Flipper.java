/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.frc3322.subsystems;

import com.frc3322.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

//This is the flipper subsystem, which is near the chassis.
//It exists to block incoming balls from under the net.
public class Flipper extends Subsystem {
    boolean isFlipped;
    DoubleSolenoid flipperSolenoid = new DoubleSolenoid(RobotMap.PCM.FLIPPER_OUT,RobotMap.PCM.FLIPPER_IN);

    public void flip(){
        if(isFlipped()){
            flipperIn();
        }else{
            flipperOut();
        }
    }

    public void flipperOut() {
        flipperSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void flipperIn() {
        flipperSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void idkflip() {
        flipperSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    public boolean isFlipped() {
        return flipperSolenoid.get() == DoubleSolenoid.Value.kForward;
    }

    public void initDefaultCommand() {
        flipperIn();
    }
}
