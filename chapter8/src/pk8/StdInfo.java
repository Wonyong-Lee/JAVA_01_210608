package pk8;

public class StdInfo {

	public String studentName;
	public int gread;
	public int money;            // �⺻5000��
	
	// ������(�����ε�) studentName �� money�� ���� �¾
	
	public StdInfo (String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bs) {
		bs.take(1000);
		this.money-=1000;
	}
	
	public void takeSubway(Subway sb) {
		sb.take(1500);
		this.money-=1500;		
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� �ܾ��� " + money + "���Դϴ�.");
	}
	
}
