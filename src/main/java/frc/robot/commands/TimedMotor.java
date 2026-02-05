package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Motor;

public class TimedMotor extends Command {
    private Motor m_Motor;
    Timer t_Timer;

    public TimedMotor (Motor m_Motor) {
        
        this.m_Motor = m_Motor;
        t_Timer = new Timer();
        t_Timer.start();

        addRequirements(m_Motor);

    }

    @Override
    public void initialize() {
        t_Timer.reset();
    }

    @Override
    public void execute() {
        m_Motor.setMotorSpeed(0.5);
    }

    @Override
    public boolean isFinished() {
        return t_Timer.hasElapsed(5);
    }

    @Override
    public void end (boolean interrupted) {
        m_Motor.brakeMotor();
    }
}
