package pk8;

public class Subway {

	public String lineNumber;      // ����ö �뼱
	public int passengerCount;     // �°�
	public int money;              // ���Աݾ�
	
	// ������
	
	// heap �޸𸮻���
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {  // �°��� ź���
		this.money += money;       // ���� ����
		passengerCount++;          // �°��� ����
	}
	
	
	public void subwayInfo() {       // ����ö ����
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "���Դϴ�.");
	}
	
}
