package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Drivetrain;
import static frc.robot.Constants.ControllerPorts.*;
import static frc.robot.Constants.DrivetrainIDs.*;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {

    private Drivetrain drivetrain;
    private XboxController xbox;


    // This function is run when the robot is first started up and should be used
    // for any initialization code.
    @Override
    public void robotInit() {
        
        drivetrain = new Drivetrain(RR_MOTOR_ID, RL_MOTOR_ID, FR_MOTOR_ID, FL_MOTOR_ID);
        xbox = new XboxController(CONTROLLER_PORT);
        
    }

    // This function is called once at the start of teleop
    @Override
    public void teleopInit() {

    }

    // This function is called every 20ms while the robot is enabled in teleop
    @Override
    public void teleopPeriodic() {

        drivetrain.arcadeDrive(1,1);
        
    }

    // This function is called every 20ms while the robot is enabled
    @Override
    public void robotPeriodic() {

    }
}