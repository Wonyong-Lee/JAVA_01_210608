package pk13;

public class PhoneExample {

	public static void main(String[] args) {
		// �߻�Ŭ������ heap�޸𸮸� ����� �� ����
		// Phone phone = new Phone(); >> X
		// Phone phone = new Phone("ȫ�浿"); >> X
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();
		
	}

}
