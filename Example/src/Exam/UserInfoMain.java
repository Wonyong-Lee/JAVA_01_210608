package Exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {

		int select;
		
		int money;
		
		// ��ü
		UserInfo ui = new UserInfo();
		
		// while��:���ѹݺ�
		// while(True) 1,2,3,4 ��Ϲް� scan���� ��ȣ�Է��Ҽ��ְ�.. scan�Է� select
		// switch(select)
		
		outer: while(true) {
			System.out.println("===================================");
			System.out.println("1.�Ա� | 2.��� | 3.�ܾ�Ȯ�� | 4.����");
			System.out.println("===================================");
			System.out.print("����> ");
			
			Scanner scan = new Scanner(System.in);
			
			select=Integer.parseInt(scan.nextLine());
			
			switch(select) {
				case 1:
					System.out.println("�Ա��� �����ϼ̽��ϴ�.");
					System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
					money=scan.nextInt();
					ui.deposit(money);
					break;
				case 2:
					System.out.println("����� �����ϼ̽��ϴ�.");
					System.out.print("����� �ݾ��� �Է��ϼ��� : ");
					money=scan.nextInt();
					ui.withdraw(money);
					break;
				case 3:
					System.out.println("�ܾ�Ȯ���� �����ϼ̽��ϴ�.");
					System.out.println("���� �ܾ��� " + ui.showMoney() + "���Դϴ�.");
					break;
				case 4:
					System.out.println("���Ḧ �����ϼ̽��ϴ�.");
					break outer;
			}
			
		}
		
	}

}
