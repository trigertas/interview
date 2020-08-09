package questionthree.src.main.java.com.java.interview;

public class CustomDrivetrain implements Drivetrain {

	int numberOfWheels;

	CustomDrivetrain(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;

	}

	public Drivetrain getDrivetrain() {
		Drivetrain drivetrain = new FourWheelDrive();
		drivetrain.setNumberOfWheels(this.getNumberOfWheels());
		return drivetrain;
	}

}
