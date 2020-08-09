package questionone.src.main.java.com.java.interview;

public class Car implements Vehicle {

	private Engine engineType;
	private String drivetrain = "direct";

	Car() {
		engineType = new GasEngine();
	}

	public Engine getEngine() {
		return this.engineType;
	}

	public void setEngine(Engine engine) {
		this.engineType = engine;
	}

	public String getDrivetrainType() {
		return this.drivetrain;
	}

	public void setDrivetrainType(String drivetrain) {
		this.drivetrain = drivetrain;

	}
}
