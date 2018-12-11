package com.frc3322.subsystems;
import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.frc3322.RobotMap;
import com.frc3322.commands.DriveControl;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import com.frc3322.Robot.*;

public class Drivetrain extends Subsystem {

    private MecanumDrive robotDrive;
    public AHRS navx;



    /*
     * Simplest program to drive a robot with mecanum drive using a single Logitech
     * Extreme 3D Pro joystick and 4 drive motors connected as follows:
     *     - PWM 0 - Connected to front left drive motor
     *     - PWM 1 - Connected to rear left drive motor
     *     - PWM 2 - Connected to front right drive motor
     *     - PWM 3 - Connected to rear right drive motor
     */


        //Create a robot drive object using PWMs 0, 1, 2 and 3
        public Drivetrain() {
            WPI_TalonSRX leftBackMotor = new WPI_TalonSRX(RobotMap.CAN.LEFT_BACK_MOTOR);
            WPI_TalonSRX leftFrontMotor = new WPI_TalonSRX(RobotMap.CAN.LEFT_FRONT_MOTOR);
            WPI_TalonSRX rightBackMotor = new WPI_TalonSRX(RobotMap.CAN.RIGHT_BACK_MOTOR);
            WPI_TalonSRX rightFrontMotor = new WPI_TalonSRX(RobotMap.CAN.RIGHT_FRONT_MOTOR);
            navx = new AHRS(SPI.Port.kMXP);
            Joystick driveStick = new Joystick(1);
            robotDrive = new MecanumDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
        }


    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new DriveControl());
            }

    public void drive(double horizontalInput, double verticalInput, double rotationInput) {
            robotDrive.driveCartesian(verticalInput, horizontalInput, rotationInput);
        }
    public void stop() {
            robotDrive.driveCartesian(0,0,0);
        }


}
