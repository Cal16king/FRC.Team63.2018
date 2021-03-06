package org.usfirst.frc.team63.robot.commands_drive;

import org.usfirst.frc.team63.robot.Robot;
import org.usfirst.frc.team63.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopDriveLowCommand extends Command {

    public TeleopDriveLowCommand() {
        requires(Robot.drive);
        setInterruptible(true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {    	    	
    	Robot.drive.shiftLow();
    	Robot.drive.teleDrive(
    			Robot.m_oi.controller1.LeftStickY(),
    			Robot.m_oi.controller1.RightStickX()
    			);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drive.stop();
    }
}
