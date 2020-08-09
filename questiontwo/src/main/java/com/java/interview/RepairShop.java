package questiontwo.src.main.java.com.java.interview;

public class RepairShop {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Drivetrain drivetrain = car.getDrivetrainType();
		System.out.println("The drivetrain removed from the car has "
				+ drivetrain.getNumberOfWheels() + " wheels.");
		drivetrain.setNumberOfWheels(2);
		System.out.println("The new drivetrain has "
				+ drivetrain.getNumberOfWheels() + " wheels.");
		System.out.println("The old drivetrain had "
				+ car.getDrivetrainType().getNumberOfWheels() + " wheels.");
		car.setDrivetrainType(drivetrain);
		System.out
				.println("The car now has "
						+ car.getDrivetrainType().getNumberOfWheels()
						+ " wheel drive.");
	}
}
