// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.driveCmd;
import frc.robot.commands.shoulderSpin;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.driveSubsystem;
import frc.robot.subsystems.shoulderSubsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import static frc.robot.Functions.Deadband;



public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final shoulderSubsystem shoulder;
  private final driveSubsystem driveTrain;



  private final Joystick js = new Joystick(0);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  
  
  public RobotContainer() {
    shoulder = new shoulderSubsystem();
    driveTrain = new driveSubsystem();
    driveTrain.setDefaultCommand(new driveCmd(driveTrain, () -> Deadband(js.getRawAxis(1)) * Constants.DTspeedmulti,
      () -> Deadband(js.getRawAxis(2))  / Constants.DTspeed ) );

    configureButtonBindings();
  }

 
  private void configureButtonBindings() {
    new JoystickButton(js, 2).whileActiveOnce(new shoulderSpin(shoulder, false, false));
    new JoystickButton(js, 3).whileActiveOnce(new shoulderSpin(shoulder, true, false));
    new JoystickButton(js, 4).whileActiveOnce(new shoulderSpin(shoulder, true, true));
  }

 
  public Command getAutonomousCommand() {
    


    return null;
  }
}
