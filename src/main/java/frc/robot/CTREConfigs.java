package frc.robot;

import com.ctre.phoenix6.configs.TalonFXConfiguration;

public final class CTREConfigs {
    
    public TalonFXConfiguration motorOneConfig = new TalonFXConfiguration();
    public TalonFXConfiguration motorTwoConfig = new TalonFXConfiguration();

    public CTREConfigs() {
        // motor configurator
        // invert and neutral mode
        motorOneConfig.MotorOutput.Inverted = Constants.MotorOneConstants.motorInvert;
        motorOneConfig.MotorOutput.NeutralMode = Constants.MotorOneConstants.motorNeutral; 

        motorTwoConfig.MotorOutput.Inverted = Constants.MotorTwoConstants.motorInvert;
        motorTwoConfig.MotorOutput.NeutralMode = Constants.MotorTwoConstants.motorNeutral; 
    }
}
