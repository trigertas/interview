package questiontwo.src.main.java.com.java.interview;

public class FourWheelDrive implements Drivetrain {

	int numberOfWheels = 4;

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public FourWheelDrive getDrivetrain() {
		FourWheelDrive drivetrain = new FourWheelDrive();
		drivetrain.setNumberOfWheels(this.getNumberOfWheels());
		return drivetrain;
	}

}
