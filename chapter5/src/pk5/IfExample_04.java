package pk5;

import javax.swing.JOptionPane;

public class IfExample_04 {

	public static void main(String[] args) {

		int age;
		age=Integer.parseInt(JOptionPane.showInputDialog("����"));
		int charge;
		
		if(age<8) {
			charge=1000;
			System.out.println("��� �Դϴ�.");
		}else if(age<14){
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}else if(age<20) {
			charge=3000;
			System.out.println("�ߡ�����л� �Դϴ�.");
		}else {
			charge=4000;
			System.out.println("���� �Դϴ�.");
		}
		System.out.println("������ " + charge + "���Դϴ�.");
	}

}
