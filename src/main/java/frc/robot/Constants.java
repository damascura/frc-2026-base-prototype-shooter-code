// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class QuickTuning {

    // controller constants
    public static final int weaponControllerID = 0;
    public static final double weaponAnalogDeadband = 0.5;

  }

  public static final class MotorOneConstants {

    public static final double maxVoltage = 9;
    public static final InvertedValue motorInvert = InvertedValue.CounterClockwise_Positive;
    public static final NeutralModeValue motorNeutral = NeutralModeValue.Brake;

  }

  public static final class MotorTwoConstants {

    public static final double maxVoltage = 6;
    public static final InvertedValue motorInvert = InvertedValue.CounterClockwise_Positive;
    public static final NeutralModeValue motorNeutral = NeutralModeValue.Brake;

  }
}
