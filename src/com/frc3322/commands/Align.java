package com.frc3322.commands;

import com.frc3322.Robot;
import com.frc3322.Robot.*;
import edu.wpi.first.wpilibj.command.Command;

import static com.frc3322.Robot.IMG_WIDTH;
import static com.frc3322.Robot.align;
import static com.frc3322.Robot.drivetrain;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.vision.VisionRunner;
import edu.wpi.first.wpilibj.vision.VisionThread;

public class Align extends Command{

    public Align(){

    }

    public void Align() {
        double centerX;
        synchronized (Robot.imgLock) {
            centerX = Robot.centerX;
        }
        double shift = centerX - (IMG_WIDTH / 2);
        drivetrain.drive(shift * 0.005, 0, 0);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
