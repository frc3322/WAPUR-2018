/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.frc3322;


import com.frc3322.commands.Flop;
import com.frc3322.commands.Flip;
import com.frc3322.commands.TurnAround;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {


    public Joystick chassisStick = new Joystick(RobotMap.XBOX.CONTROlLER_0);
    public Joystick flipFlopStick = new Joystick(RobotMap.XBOX.CONTROLLER_1);

    private JoystickButton button_a = new JoystickButton(chassisStick, RobotMap.XBOX.BUTTON_A);
    private JoystickButton button_b = new JoystickButton(chassisStick, RobotMap.XBOX.BUTTON_B);
    private JoystickButton button_x = new JoystickButton(chassisStick, RobotMap.XBOX.BUTTON_X);
    private JoystickButton button_y = new JoystickButton(chassisStick, RobotMap.XBOX.BUTTON_Y);
    private JoystickButton bumper_r = new JoystickButton(flipFlopStick, RobotMap.XBOX.BUMPER_RIGHT);
    private JoystickButton bumper_l = new JoystickButton(flipFlopStick, RobotMap.XBOX.BUMPER_LEFT);
    private Button stick_left = new JoystickButton(chassisStick, 9);
    private Button stick_right = new JoystickButton(chassisStick, 10);

    public OI(){

        button_a.whenPressed(new TurnAround());

        bumper_l.whenPressed(new Flop());
        bumper_r.whenPressed(new Flip());

    }

    // CREATING BUTTONS
    // One type of button is a joystick button which is any button on a
    // joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
