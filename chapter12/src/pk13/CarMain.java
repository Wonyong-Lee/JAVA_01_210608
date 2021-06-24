package pk13;

public class CarMain {

	public static void method(Car run) {
		run.startCar();
		run.drive();
		run.stop();
		run.turnOff();
	}
	
	public static void main(String[] args) {
		
		System.out.println("-----ManualCar-----");
		method(new ManualCar());
		System.out.println("-------AICar-------");
		method(new AICar());
		
		/*
		System.out.println("manualcar")
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("aicar")
		Car aiCar = new AICar();
		aiCar.run();
		*/
	}
}
