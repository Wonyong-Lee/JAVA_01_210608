package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		// ��������
		String select = "";                     // null������ ����
		int money=0;
		
		// ��ü����		
		Vending vd = new Vending();             // Can can = new Can(); �� �̹� Vending���� �߱⶧���� Vending�� �ҷ����� ��
		vd.init();                              // �ʱ�ȭ; ����� ���� �Ϸ�
		
		// �Է¹޾� showCans ȣ��
		System.out.print("���� �����ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		money=scan.nextInt();
		vd.showCans(money);
		
		// �Է¹޾� outCan ȣ��
		System.out.print("������� �����ϼ��� :");
		select=scan.next();
		vd.outCan(select);
		
	}

}
