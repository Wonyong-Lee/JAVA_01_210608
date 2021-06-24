package pk12;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		// 방법1
		driver.driver(new Bus());        // Vehicle vehicle = new Bus();     **매개변수에 객체가 들어갈 수 있다.....
		driver.driver(new Taxi());       // Vehicle vehicle = new Taxi();
		
		
		System.out.println("----------------");
		// 방법2
		Taxi taxi=new Taxi();
		driver.driver(taxi);
		Bus bus=new Bus();
		driver.driver(bus);
	}

}
