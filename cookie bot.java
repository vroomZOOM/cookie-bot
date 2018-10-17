/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7200.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DriverStation;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	Command autoCommand;
	protected DifferentialDrive m_myRobot;
	protected Joystick driverstick = new Joystick(0);
	
	
	/*private static final String kDefaultAuto = "Default";
	private static final String kCustomAuto = "My Auto";
	private String m_autoSelected;
	private SendableChooser<String> m_chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		Spark m_left0 = new Spark(0); // motors are plugged into ports 0,1,2,3 into the roborio
		Spark m_left1 = new Spark(1);
		SpeedControllerGroup m_left = new SpeedControllerGroup(m_left0,m_left1);
		Spark m_right2 = new Spark(2);
		Spark m_right3 = new Spark(3);
		SpeedControllerGroup m_right = new SpeedControllerGroup(m_right2, m_right3);
		m_myRobot = new DifferentialDrive(m_left, m_right);
		
		m_myRobot.arcadeDrive(0,0);
		
	System.out.println("Alexei is awesome\nHe figured out the code\nAlexei is awesome\nAlexei is awesome & Alexei is cool");
		
	/*	m_chooser.addDefault("Default Auto", kDefaultAuto);
		m_chooser.addObject("My Auto", kCustomAuto);
		SmartDashboard.putData("Auto choices", m_chooser);*/
	
	}

	/**
	 
	 */
	@Override
	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		
		
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		double forward = (driverstick.getY()*-1);
		double turn = driverstick.getX();
		
		m_myRobot.arcadeDrive(forward*0.6,turn*0.55);
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
