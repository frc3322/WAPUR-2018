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
    DoubleSolenoid flipperSolenoid = new DoubleSolenoid(RobotMap.PCM.FLIPPER_OUT, RobotMap.PCM.FLIPPER_IN);

    public void flip(){
        if(isFlipped){
            unflip();
        }else{
            extendFlip();
        }
    }

    public void extendFlip() {
        flipperSolenoid.set(DoubleSolenoid.Value.kForward);
        isFlipped = true;
    }

    public void unflip() {
        flipperSolenoid.set(DoubleSolenoid.Value.kReverse);
        isFlipped = false;
    }

    public void idkflip() {
        flipperSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    public void initDefaultCommand() {
        unflip();
    }
}
