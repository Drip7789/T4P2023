package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.driveSubsystem;

public class driveCmd extends CommandBase{
    private final driveSubsystem driveSubsystem;
    private final DoubleSupplier throttlSupplier, rotationsSupplier;

    public driveCmd(driveSubsystem driveSubsystem, DoubleSupplier throttle, DoubleSupplier rotation){
        this.driveSubsystem = driveSubsystem;

        addRequirements(this.driveSubsystem);

        throttlSupplier = throttle;
        rotationsSupplier = rotation;
    }

    @Override
    public void initialize(){

    }
    @Override
    public void execute(){
       double throttle = throttlSupplier.getAsDouble(), rotation = rotationsSupplier.getAsDouble();

       driveSubsystem.arcadeDrive(throttle, rotation);

    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }

    
}
