package pk10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour {

	public static void main(String[] args) {
		
		
		System.out.print("������ �� : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// �ʱ�ȭ�Ǹ鼭 �޸� Ȯ�� �� ��ü ����(Guide���� Guest�� ��ü ����)
		Guide guide = new Guide(n);  // **********���� �߿��� �κ�**********
		
		System.out.println("������ ���");
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + ". �̸� : ");
			guide.guest[i].setName(scan.next());
			
			System.out.println((i+1) + ". ���� : ");
			String gen=scan.next();
			guide.guest[i].setGender(gen);
			System.out.println("----------------------");
		}
		
		outer : while(true) {
			System.out.println("1. ������ ����");
			System.out.println("2. ������ ����");
			System.out.println("3. ����");
			System.out.print("����>>");
			
			int select = scan.nextInt();
			
			switch(select) {
				case 1:
					for(int i=0; i<n; i++) {
						System.out.println((i+1) + ". �̸� : " + guide.guest[i].getName());
						System.out.println((i+1) + ". ���� : " + guide.guest[i].getGender());
						System.out.println((i+1) + ". ������ : " + guide.guest[i].getPoint());
					}break;
				case 2:
					System.out.println("���� �����Ͻðڽ��ϱ�? ");
					Guide.point=scan.next();
					System.out.println(Guide.point + "�� ������ ����");
					break;
				case 3:
					System.out.println("����");
					break outer;
			}		
		}
	}
}




/*
int select;
Guest gst = new Guest();


gst.setName(JOptionPane.showInputDialog("�̸�"));
gst.setGender(JOptionPane.showInputDialog("����"));

outer : while(true) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("----------------------------------");
	System.out.println("1. ������ ���� | 2. ������ ���� | 3. ����");
	System.out.println("----------------------------------");
	System.out.print("���� >>");
	
	
	select = Integer.parseInt(scan.nextLine());
	
	switch(select) {
		case 1: 
			System.out.println("������ ������ �����ϼ̽��ϴ�.");
			
			System.out.println("�̸� : " + gst.getName() + "\n" + "���� : " + gst.getGender());
			break;
		case 2:
			System.out.println("������ ������ �����ϼ̽��ϴ�.");
			String str=scan.nextLine();
			System.out.println(str + "�� ������ ����");
			str = Guide.point;
			
			break;
		case 3:
			System.out.println("���Ḧ �����ϼ̽��ϴ�.");
			break outer;				
			
	}		
}
*/
