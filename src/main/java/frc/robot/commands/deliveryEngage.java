/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.conveyer;

public class deliveryEngage extends CommandBase {
  /**
   * Creates a new deliveryEngage.
   */
  private conveyer m_con = null;
  private int direction;
  public deliveryEngage(conveyer subsystem, int dir) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_con = subsystem;
    direction = dir;
    addRequirements(m_con);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_con.deliveryDrive(direction*0.75);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_con.deliveryDrive(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
