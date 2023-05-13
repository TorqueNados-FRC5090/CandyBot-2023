package frc.robot.subsystems;

// Imports
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drivetrain {
    // Declare motors
    // Motors are named based on their position
    // eg. Rear Left Motor --> RLMotor
    // eg. Front Right Motor --> FRMotor
    private CANSparkMax FLMotor;
    private CANSparkMax FRMotor;
    private CANSparkMax RLMotor;
    private CANSparkMax RRMotor; 
    private MotorControllerGroup leftMotors;
    private MotorControllerGroup rightMotors;
    private DifferentialDrive driveController;

    // Constructor method
    public Drivetrain( int FLMotorID, int FRMotorID, int RLMotorID, int RRMotorID ) {
        // Initialize motors
        this.FLMotor = new CANSparkMax(FLMotorID, MotorType.kBrushless);
        FLMotor.restoreFactoryDefaults();
        this.FRMotor = new CANSparkMax( FRMotorID, MotorType.kBrushless);
        FRMotor.restoreFactoryDefaults();
        this.RLMotor = new CANSparkMax( RLMotorID, MotorType.kBrushless);
        RLMotor.restoreFactoryDefaults();
        this.RRMotor = new CANSparkMax( RRMotorID, MotorType.kBrushless);
        RRMotor.restoreFactoryDefaults(); 

        // Create groups
        leftMotors = new MotorControllerGroup(FLMotor, RLMotor);
        rightMotors = new MotorControllerGroup(FRMotor, RRMotor);

        // Initialize Differentials Drive
        driveController = new DifferentialDrive(leftMotors, rightMotors);
    }

    // Accessor methods (getters)
    public CANSparkMax getFLMotor() { return FLMotor; }
    public CANSparkMax getFRMotor() { return FRMotor; }
    public CANSparkMax getRLMotor() { return RLMotor; }
    public CANSparkMax getRRMotor() { return RRMotor; }
    public MotorControllerGroup getRightMotorGroup() { return rightMotors; }
    public MotorControllerGroup getLeftMotorGroup() { return leftMotors; }
    public DifferentialDrive getDriveController() { return driveController; }

    /** Drives the robot by controlling the speed and rotation
     * @param driveSpeed Drives the robot forward and back [-1,1]
     * @param rotationSpeed Spins the robot left and right [-1,1]
     */
    public void arcadeDrive(double driveSpeed, double rotationSpeed) {
        driveController.arcadeDrive(driveSpeed, rotationSpeed);
    }

}

