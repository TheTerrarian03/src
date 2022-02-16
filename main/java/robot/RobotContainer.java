// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package robot;

import robot.commands.*;
import robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import robot.subsystems.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final climberSubSys m_climberSubSys = new climberSubSys();
    public final shooterSubSys m_shooterSubSys = new shooterSubSys();
    public final intakeSubSys m_intakeSubSys = new intakeSubSys();
    public final drivetrainSubSys m_drivetrainSubSys = new drivetrainSubSys();

// Joysticks
private final Joystick copilotJoystick = new Joystick(1);
private final Joystick driverJoystick = new Joystick(0);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems


    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("intakeCompressorOnCmd", new intakeCompressorOnCmd( m_intakeSubSys ));
    SmartDashboard.putData("intakeCompressorOffCmd", new intakeCompressorOffCmd( m_intakeSubSys ));
    SmartDashboard.putData("autoDriveCmdGrp1", new autoDriveCmdGrp1( m_drivetrainSubSys ));
    SmartDashboard.putData("clearEncodersCmd", new clearEncodersCmd( m_drivetrainSubSys ));
    SmartDashboard.putData("resetGyroCmd", new resetGyroCmd( m_drivetrainSubSys ));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND

    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Autonomous Command", new AutonomousCommand());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons
final JoystickButton intakeRetractBtn = new JoystickButton(copilotJoystick, 6);        
intakeRetractBtn.whenPressed(new intakeRetractCmd( m_intakeSubSys ) ,true);
    SmartDashboard.putData("intakeRetractBtn",new intakeRetractCmd( m_intakeSubSys ) );

final JoystickButton intakeExtendBtn = new JoystickButton(copilotJoystick, 5);        
intakeExtendBtn.whenPressed(new intakeRetractCmd( m_intakeSubSys ) ,true);
    SmartDashboard.putData("intakeExtendBtn",new intakeRetractCmd( m_intakeSubSys ) );

final JoystickButton driveBtn = new JoystickButton(driverJoystick, 1);        
driveBtn.whileHeld(new driveByJoystick( m_drivetrainSubSys ) ,true);
    SmartDashboard.putData("driveBtn",new driveByJoystick( m_drivetrainSubSys ) );



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getdriverJoystick() {
        return driverJoystick;
    }

public Joystick getcopilotJoystick() {
        return copilotJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

