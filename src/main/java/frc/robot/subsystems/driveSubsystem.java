package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import static frc.robot.Constants.*;

public class driveSubsystem extends SubsystemBase{
    private PWMVictorSPX DTleftMotor1, DTleftMotor2, DTrightMotor1, DTrightMotor2;    
    private DifferentialDrive driveTrain;

    

    public void driveTrain(){

        DTleftMotor1 = new PWMVictorSPX(Constants.DTL1);
        DTleftMotor2 = new PWMVictorSPX(Constants.DTL2);
    
        DTrightMotor1 = new PWMVictorSPX(Constants.DTR1);
        DTrightMotor2 = new PWMVictorSPX(Constants.DTR2); 

        MotorControllerGroup DTleft = new MotorControllerGroup(DTleftMotor1, DTleftMotor2);  
        MotorControllerGroup DTright = new MotorControllerGroup(DTrightMotor1, DTrightMotor2);

        DTleft.setInverted(false);
        DTright.setInverted(true);

        driveTrain = new DifferentialDrive(DTleft, DTright);

        driveTrain.stopMotor();
    }

    public void stop(){
        driveTrain.stopMotor();
    }



    public void arcadeDrive(double moveSpeed, double rotateSpeed) {

        driveTrain.arcadeDrive(moveSpeed, rotateSpeed);

    }

}
