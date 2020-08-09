package questiontwo.src.main.java.com.java.interview;

public class Car implements Vehicle {

	private Engine engineType;
	private Drivetrain drivetrain;

	Car() {
		engineType = new GasEngine();
		drivetrain = new FourWheelDrive();
	}

	public Engine getEngine() {
		return this.engineType;
	}

	public void setEngine(Engine engine) {
		this.engineType = engine;
	}

	public Drivetrain getDrivetrainType() {
		return this.drivetrain.getDrivetrain();
	}

	public void setDrivetrainType(Drivetrain drivetrain) {
		this.drivetrain = drivetrain;
	}

}
