package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		System.out.println("=========��ü1=========");
		// �⺻ �����ڷ� ��ü�� ����ǰ�ü�� �̸��� R1(Move2��, RAge)
		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		R1.RAge();
		
		
		System.out.println("=========��ü2=========");
		// swing���� �Է� �޾Ƽ� �κ��� �ӵ��� ����, �̸�, �κ���ȣ�� ���
		// ThisTest�� ��� method ���
		
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		
		R_speed=Integer.parseInt(JOptionPane.showInputDialog("�κ��ӵ�"));
		R_age=Integer.parseInt(JOptionPane.showInputDialog("�κ�����"));
		R_name=JOptionPane.showInputDialog("�κ��̸�");
		R_num=JOptionPane.showInputDialog("�κ���ȣ");
		
		ThisTest R2 = new ThisTest(R_speed, R_age, R_name, R_num);
		System.out.println("�ӵ� : " + R_speed);
		System.out.println("���� : " + R_age);
		System.out.println("�̸� : " + R_name);
		System.out.println("��ȣ : " + R_num);
		
		R2.Move();
		R2.RAge();
		R2.RName();
		R2.RNum();
		System.out.println();
		R2.Move();
		R2.Stop();
		
	}

}
