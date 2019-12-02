/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Victor;

/**
 * The class representing my robot - for its actions during each phase of the competition, its motors and joysticks.
 */
public class Robot extends TimedRobot {

  public static SpeedController m_gripperR = new WPI_VictorSPX(4);
  public static SpeedController m_chasssis = new WPI_VictorSPX(2);

  public static Joystick m_JS = new Joystick(0); 

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    //As a reminder, command's scheduale() method simply runs the command. 
    
    // Thee two instances (that is, objects) below of the MoveBySupplier move the right gripper wheel according to the y 
    // value of the joystick JS. Notice that since we gave a supplier rather than a specific value, the command
    // can continiously update the power they give to the motors according to the joystick, rather than set it a fixed value. 
    
    // this initilizes the command with a (paramters) -> returnValue syntax. since a supplier takes no parameters, the 
    // parethesis are empty. They are followed by the arrow -> , called the lambda operator. After the arrow we write the value 
    // the function returns. In this case, the current y-value of the joystick defined above.
    new MoveBySupplier(m_gripperR, () -> m_JS.getY() ).schedule();

    // This instance initilized the command with the double colon (::) syntax. Since the fumction we passed was exactly
    // identical to m_JS' getY() method, we can pass that method directly as a parameter. We take the specific object 
    // that we would like to access the method of (we like to take the y value of specifically m_JS rather than some
    // other joystick), followed by the double colon operator ::, and then the method we'd like to turn into the functional
    // interface. Note that the method must fit the dunctional interface (in this case, take no parameters and return a double) 
    new MoveBySupplier(m_gripperR, m_JS::getY ).schedule();


    // This instance of the command uses a diffrent supplier: the cureent shuffleboard value under "speed".
    // Notice that in each instance, we basically replace "m_speedSupplier.get()" with the method we insert as a parameter.
    // In the previous instances, this was essintially replaced by m_JS.getY(). 
    // here it's replaced by () -> Preferences.getInstance().getDouble("Speed", 0.5).
    new MoveBySupplier(m_chasssis, () -> Preferences.getInstance().getDouble("Speed", 0.5)).schedule();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

  

}
