package pk5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchCase_04 {

	public static void main(String[] args) {

		// 1,3,5,7,8,10,12 => 31�� / 4,6,9,11 => 30�� / 2 => 28��
		
		Scanner scan=new Scanner(System.in);
		int month;
		int day;
		
		System.out.print("���� �����ϼ���(1~12): ");
	
		month=scan.nextInt();
		
		switch(month) {
			
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day=31;
				break;
				
			case 4, 6, 9, 11:  // case: �ߺ���� ��������, (version 10�̻�)
				day=30;
				break;
				
			case 2:
				day=28;
				break;
				
			default :
				day=0;
				System.out.println("�������� �ʴ� �� �Դϴ�.");
					
		}
		
		System.out.println(month + "���� " + day + "�� ���� �ֽ��ϴ�.");
		
	}

}
