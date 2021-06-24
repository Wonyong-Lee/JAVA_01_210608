package pk12;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode=2;
		sa.fly();
		sa.flyMode=1;
		sa.fly();
		sa.land();
		
	}

}
