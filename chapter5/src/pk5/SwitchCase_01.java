package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_01 {

	public static void main(String[] args) {

		/*int ranking;
		char medalColor;
		
		ranking=Integer.parseInt(JOptionPane.showInputDialog("����� �Է��ϼ���."));
		
		switch(ranking) {
		
			case 1:medalColor='G';
				break;
			
			case 2:medalColor='S';
				break;
			
			case 3:medalColor='B';
				break;
			
			default:                           // default���� break�� ��ü������ �����Ƿ� �����ʾƵ� �ȴ�.
				medalColor='A';
		}
		
		System.out.println(ranking + "�� �޴��� : " + medalColor + "�Դϴ�.");*/
		
		int ranking;
		char medalColor='A';          // �ʱⰪ�� �����ϰ� �����ϸ� default�� �ۼ����� �ʾƵ� �ȴ�.
		
		ranking=Integer.parseInt(JOptionPane.showInputDialog("����� �Է��ϼ���."));
		
		switch(ranking) {
		
			case 1:medalColor='G';
				break;
			
			case 2:medalColor='S';
				break;
			
			case 3:medalColor='B';
				break;
			
		}
		
		System.out.println(ranking + "�� �޴��� : " + medalColor + "�Դϴ�.");
		
		
	}

}
