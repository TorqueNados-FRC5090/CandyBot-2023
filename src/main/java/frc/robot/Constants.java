package frc.robot;

/*
 * To access numbers in this file, import or statically import one of its subclasses:
 * example:
 * import static frc.robot.Constants.ControllerPorts.*;
 * import frc.robot.Constants.DriveConstants;
 */
public final class Constants {

    /* -------------- IDs -------------- */

    /** Ports used by controllers. */
    public static final class ControllerPorts {
        public static final int CONTROLLER = 0;
    }

    /** Motor IDs used by the drivetrain. */
    public static final class DrivetrainIDs {
        public static final int FL_MOTOR_ID = 7;
        public static final int FR_MOTOR_ID = 3;
        public static final int RL_MOTOR_ID = 6;
        public static final int RR_MOTOR_ID = 2;
    }
} 