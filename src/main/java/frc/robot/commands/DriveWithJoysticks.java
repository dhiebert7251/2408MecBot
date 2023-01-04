// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveWithJoysticks extends CommandBase {
  private final XboxController m_controller = new XboxController(Constants.DRIVER_JOYSTICK);
  private final Drivetrain m_mecanum = new Drivetrain();

  // Slew rate limiters to make joystick inputs more gentle; 1/3 sec from 0 to 1.
  private final SlewRateLimiter m_xspeedLimiter = new SlewRateLimiter(Constants.D_JOYSTICK_LEFT_X_SPEED_LIMIT);
  private final SlewRateLimiter m_yspeedLimiter = new SlewRateLimiter(Constants.D_JOYSTICK_LEFT_Y_SPEED_LIMIT);
  private final SlewRateLimiter m_rotLimiter = new SlewRateLimiter(Constants.D_JOYSTICK_RIGHT_Y_SPEED_LIMIT);
  
  /* 
  @Override
  public void autonomousPeriodic() {
    driveWithJoystick(false);
    m_mecanum.updateOdometry();
  }

  @Override
  public void teleopPeriodic() {
    driveWithJoystick(true);
  }
  */

  /** Creates a new DriveWithJoysticks. 
   * @return */
  public void driveWithJoysticks(boolean fieldRelative) {

    // Use addRequirements() here to declare subsystem dependencies.
     // Get the x speed. We are inverting this because Xbox controllers return
    // negative values when we push forward.
    final var xSpeed = -m_xspeedLimiter.calculate(m_controller.getLeftY()) * Constants.MAX_SPEED;

    // Get the y speed or sideways/strafe speed. We are inverting this because
    // we want a positive value when we pull to the left. Xbox controllers
    // return positive values when you pull to the right by default.
    final var ySpeed = -m_yspeedLimiter.calculate(m_controller.getLeftX()) * Constants.MAX_SPEED;

    // Get the rate of angular rotation. We are inverting this because we want a
    // positive value when we pull to the left (remember, CCW is positive in
    // mathematics). Xbox controllers return positive values when you pull to
    // the right by default.
    final var rot = -m_rotLimiter.calculate(m_controller.getRightX()) * Constants.MAX_ANGULAR_SPEED;

    m_mecanum.drive(xSpeed, ySpeed, rot, fieldRelative);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
