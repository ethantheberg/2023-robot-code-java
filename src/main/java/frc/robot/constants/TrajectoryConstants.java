package frc.robot.constants;

import edu.wpi.first.math.trajectory.TrajectoryConfig;
import edu.wpi.first.math.trajectory.TrapezoidProfile;

public final class TrajectoryConstants {
    public static final double kMaxSpeedMetersPerSecond = 1.5;
    public static final double kMaxAccelerationMetersPerSecondSquared = 1.5;
    public static final double kMaxAngularSpeedRadiansPerSecond = 1000 * Math.PI;
    public static final double kMaxAngularSpeedRadiansPerSecondSquared = 1000 * Math.PI;

    public static final double kPXController = 0.05;
    public static final double kPYController = 0.05;
    public static final double kPThetaController = 2.0;
    public static final double kDThetaController = 0.0;

    public static final TrapezoidProfile.Constraints kThetaControllerConstraints =
            new TrapezoidProfile.Constraints(kMaxAngularSpeedRadiansPerSecond, kMaxAngularSpeedRadiansPerSecondSquared);

    public static final TrajectoryConfig config = new TrajectoryConfig(kMaxSpeedMetersPerSecond, kMaxAccelerationMetersPerSecondSquared)
            .setKinematics(DrivetrainConstants.driveKinematics);

    private TrajectoryConstants() {
        // private constructor to prevent instantiation
    }
}
