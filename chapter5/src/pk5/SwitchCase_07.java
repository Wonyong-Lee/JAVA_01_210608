package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_07 {

	public static void main(String[] args) {

		int time=(int)(Math.random()*4+9); // double -> int
		
		System.out.println("[����ð�: " + time + "��]"); // [����ð�: 8��]
		
		switch(time) {
			case 9:
				System.out.println("����մϴ�.");
				break;
				
			case 10:
				System.out.println("Ŀ�Ǹ� ���ð� ���ϴ�.");
				break;
		
			case 11:
				System.out.println("������ �Խ��ϴ�.");
				break;
				
			default:
				System.out.println("Ż�±ٹ��� �մϴ�.");
			
				
		}
		
	}

}
