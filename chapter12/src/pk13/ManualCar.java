package pk13;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("주행을 시작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("주행을 정지합니다.");
		
	}

	
}
