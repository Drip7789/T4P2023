package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.shoulderSubsystem;


public class shoulderSpin extends CommandBase {
    private final shoulderSubsystem shoulderSubsystem;
    private final boolean reverse;
    private final boolean stop;

    public shoulderSpin(shoulderSubsystem shoulderSubsystem, boolean reverse, boolean stop){
        this.reverse = reverse;
        this.stop = stop;
        this.shoulderSubsystem = shoulderSubsystem;
        addRequirements(shoulderSubsystem);

    }

 
    @Override
    public void initialize(){

    }
    @Override
    public void execute(){

        shoulderSubsystem.shoulderSpin(reverse, stop);
        

    }
    @Override
    public void end(boolean interrupted){
        

    }
    @Override
    public boolean isFinished(){
        return false;
    }



}
