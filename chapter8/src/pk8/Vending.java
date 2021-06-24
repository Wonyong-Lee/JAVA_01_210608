package pk8;

public class Vending {

	// ��� ����
	private Can can[] = new Can[5];         // �����ϰ� �ʱ�ȭ�� ������
	private int money;
	
	// ������
	
	// �ʱ�ȭ method�� init()
	public void init() {
		can[0] = new Can("���̴�", 900); 
		can[1] = new Can("�ݶ�", 1400); 
		can[2] = new Can("ȯŸ", 1200); 
		can[3] = new Can("�̶���", 1300); 
		can[4] = new Can("�ٳ�������", 1100); 
	}
	
	public void showCans(int m) {
		money=m;
		
		// ������� ������ �� �� �ִ� ���Ḹ �����ֱ�
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice()<=money)
			System.out.println(can[i].getCanName() + " : " + can[i].getPrice() + "��");			
		}
	}
	
	// ������ ���� ���� �� �ܾ��� ����ؼ� �ִ� method
	public void outCan(String name) {
		
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
			System.out.println(can[i].getCanName() + "��(��) �����ϼ̽��ϴ�. ");
			System.out.println("�ܾ��� " + (money-can[i].getPrice() + "���Դϴ�." ));
			}
		}
		
	}
	
}
