package pk8;

public class DmbcellPhone extends CellPhone{             // Ȯ���Ų CellPhone

	// �ʵ� 
	int channel;
	
	// ������
	public DmbcellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("ä��" + channel + "������ �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
}
