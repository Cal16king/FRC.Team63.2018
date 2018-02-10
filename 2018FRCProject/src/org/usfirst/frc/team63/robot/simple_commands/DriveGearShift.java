package org.usfirst.frc.team63.robot.simple_commands;

import org.usfirst.frc.team63.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveGearShift extends Command {

	public enum Shift
	{
	HIGH, LOW
	}
	private Shift m_DesiredValue = Shift.LOW;
    public DriveGearShift(Shift desiredValue) {
        m_DesiredValue = desiredValue;
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	if (m_DesiredValue == Shift.LOW)
        	Robot.drive.shiftLow();
    	if (m_DesiredValue == Shift.HIGH)
        	Robot.drive.shiftHigh();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
