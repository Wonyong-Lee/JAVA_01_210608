package pk13;

public class SmartPhone extends Phone{

	// ������
	public SmartPhone(String owner) { // �����ھȿ� ������ȣ��
		super(owner);                 // super(owner) = Phone(owner)
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
}
