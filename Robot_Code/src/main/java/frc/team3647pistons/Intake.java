package frc.team3647pistons;

import frc.team3647ConstantsAndFunctions.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Intake 
{
	public static DoubleSolenoid piston = new DoubleSolenoid(Constants.intakePinSourceA, Constants.intakePinSourceB);
	
	public static void openIntake()
	{
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public static void closeIntake()
	{
		piston.set(DoubleSolenoid.Value.kReverse);
	}
	
	public static void runIntake(boolean joyValue)
	{
		if(joyValue)
		{
			openIntake();
		}
		else
		{
			closeIntake();
		}
	}
}
