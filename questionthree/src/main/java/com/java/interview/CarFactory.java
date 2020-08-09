package questionthree.src.main.java.com.java.interview;

public class CarFactory {

	public static Car constructOffRoadCar() {
		Car car = new Car();
		car.setModelName("Off Road");
		Drivetrain drivetrain = new FourWheelDrive();
		car.setDrivetrainType(drivetrain);
		Engine engine = new GasEngine();
		car.setEngine(engine);
		return car;

	}
}
