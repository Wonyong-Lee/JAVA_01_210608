package pk8;

public class CellPhone {

	// �ʵ�
	String model;
	String color;
	
	// ������
	
	// method
	void powerOn() {
		System.out.println("������ �մϴ�. ");
	}
	
	void poweroff() {
		System.out.println("������ ���ϴ�. ");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�. ");
	}
	
	void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	
	void receVoice(String messaga) {
		System.out.println("���� : " + messaga);
	}
	
	void hangUp() {
		System.out.println("������ �����ϴ�. ");
	}
	
	
	
}
