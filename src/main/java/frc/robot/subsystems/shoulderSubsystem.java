package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class shoulderSubsystem extends SubsystemBase{
    
    private final PWMVictorSPX shoulderMotor1 = new PWMVictorSPX(4);
    private final PWMVictorSPX shoulderMotor2 = new PWMVictorSPX(5);

    public shoulderSubsystem (){

    }
    

    public void shoulderSpin(boolean reverse, boolean stop){
        if (reverse && !stop ){
            shoulderMotor1.set(shoulderSpeed);
            shoulderMotor2.set(shoulderSpeed);
        }else if (!reverse && !stop) {
            shoulderMotor1.set(-shoulderSpeed);
            shoulderMotor2.set(-shoulderSpeed);
        }else if (stop){
            shoulderMotor1.set(0.0);
            shoulderMotor2.set(0.0);
        }       
    }







}
