package pk12;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		// ���1
		driver.driver(new Bus());        // Vehicle vehicle = new Bus();     **�Ű������� ��ü�� �� �� �ִ�.....
		driver.driver(new Taxi());       // Vehicle vehicle = new Taxi();
		
		
		System.out.println("----------------");
		// ���2
		Taxi taxi=new Taxi();
		driver.driver(taxi);
		Bus bus=new Bus();
		driver.driver(bus);
	}

}
