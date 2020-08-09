package questionone.src.main.java.com.java.interview;

public class RepairShop {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Engine engine = car.getEngine();
		System.out.println("The engine removed from the car runs on "
				+ engine.getType());
		engine.setType("diesel");
		System.out.println("The new engine runs on " + engine.getType());
		System.out.println("The car used to run on "
				+ car.getEngine().getType());
		car.setEngine(engine);
		System.out.println("The car now runs on " + car.getEngine().getType());
	}

}