package pk13;

public abstract class Computer {
	
	// �ϳ� �̻��� abstract method�� ��� ������, �ݵ�� Ŭ������ �߻����̿����Ѵ�.
	public abstract void display();             // {} �����ΰ� ���� Ŭ������ �߻�ȭ
	public abstract void typing();             
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
