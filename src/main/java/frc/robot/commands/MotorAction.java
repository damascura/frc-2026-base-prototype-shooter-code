package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.Motor;

public class MotorAction extends Command {

    private Motor m_Motor;
    private DoubleSupplier speedSup;

    public MotorAction (Motor m_Motor, DoubleSupplier speedSup) {       
        
        this.m_Motor = m_Motor;
        this.speedSup = speedSup;

        addRequirements(m_Motor);

    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        
        m_Motor.setMotorSpeed(MathUtil.applyDeadband(speedSup.getAsDouble(), Constants.QuickTuning.weaponAnalogDeadband));

    }

    @Override
    public boolean isFinished() {

        return false;

    }

    @Override
    public void end(boolean interrupted) {

        m_Motor.brakeMotor();

    }
}
