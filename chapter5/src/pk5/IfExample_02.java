package pk5;

import javax.swing.JOptionPane;

public class IfExample_02 {

	public static void main(String[] args) {

		// 10�� ��� �Ǻ���
		int dat;
		dat=Integer.parseInt(JOptionPane.showInputDialog("�� �Է�:"));
		
		if(dat % 10 == 0) {
			System.out.println(dat + "��(��) 10�� ��� �Դϴ�.");
		}else {
			System.out.println(dat + "��(��) 10�� ����� �ƴմϴ�.");
		}
		
		
		//int dat2;
		//dtat2 = Integer.parseInt(JoptionPane.showInputDialog("�����ȣ�Է�:"));
		//System.out.println(dat2);
	}

}
