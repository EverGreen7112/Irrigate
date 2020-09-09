package frc.robot;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.SpeedController;
import frc.wpilib2020.framework.CommandBase;

/**
 * Moves a motor continously acoordifng to aspeed supplier, such as a {@link Preferences} value or
 * a {@link Joystick} axis.
 */
public class MoveBySupplier extends CommandBase {
    
    /**The supplier for the motor speed */
    Supplier<Double> m_speedSupplier;

    /**The motor's controller */
    SpeedController m_motor;

    /**
     * Constructs a new {@link MoveBySupplier} command according to input motor and supplier.
     * @param motor - the motor to set.
     * @param speedSupplier - the {@link Supplier} to set it acccording to.
     */
    public MoveBySupplier(SpeedController motor, Supplier<Double> speedSupplier) {
        m_speedSupplier = speedSupplier;
        m_motor = motor;
    }

    /**Runs constantly as the command runs - updates the motor according to the current  value of the suppllier*/
    @Override
    public void execute() {
        m_motor.set(m_speedSupplier.get());
    }   
}

