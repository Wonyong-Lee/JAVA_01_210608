package pk13;

public abstract class Phone {

	// field
	public String owner;
	
	// ������
	// default �����ڰ� ���� ���ְ� �������� ���� -> �߻� ������
		
	// �����ε�
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
}
