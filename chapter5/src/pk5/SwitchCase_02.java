package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_02 {

	public static void main(String[] args) {

		// 1: ������ȸ, 2: ���, 3: �Ա�, 4: ��ü, �� ��: �߸� �����̽��ϴ�.
		
		int Num;
		Num=Integer.parseInt(JOptionPane.showInputDialog("��ȣ �Է�(1~4)"));
		
		switch(Num) {
			case 1:
				System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
				break;
				
			case 2:
				System.out.println("����� �����ϼ̽��ϴ�.");
				break;
				
			case 3:
				System.out.println("�Ա��� �����ϼ̽��ϴ�.");
				break;
			
			case 4:
				System.out.println("��ü�� �����ϼ̽��ϴ�.");
				break;
				
			default:
				System.out.println("�߸� �����̽��ϴ�.");
		} // switch ����
		
		
	} // main ����

}  // class ����
