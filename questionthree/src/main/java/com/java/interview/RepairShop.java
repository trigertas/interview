package questionthree.src.main.java.com.java.interview;

public class RepairShop {
	public static void main(String[] args) {
		Car car = CarFactory.constructOffRoadCar();
		System.out.println("The model of the car is " + car.getModelName());
		String modelName = car.getModelName();
		Drivetrain drivetrain = new CustomDrivetrain(3);
		car.setDrivetrainType(drivetrain);
		modelName = "Custom";
		System.out.println("The model of the car was " + car.getModelName());
		car.setModelName(modelName);
		System.out.println("The model of the car is now " + car.getModelName());
	}
}
