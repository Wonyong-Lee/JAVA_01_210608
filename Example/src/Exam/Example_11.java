package Exam;

import java.util.Scanner;

public class Example_11 {

	public static void main(String[] args) {

		/* 
		�л����� ���а� ������� ����ϴ� ���α׷��� �ִ�.
		���α׷��� �����ϸ� �� ���� ������ ���� �� �������� �Է¹��� ��,
		�Է¹��� �� ��ŭ �л����� �̸��� ���м���, ������� �Է¹޴� ���α׷� �ۼ�
		 */
		
		
		System.out.println("����� �ο� �� : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String str[][]= new String[n][3];
		
		for(int i=0; i<str.length; i++) {
			System.out.print("�̸� : ");
			str[i][0] =scan.next();
			
			System.out.print("���� : ");
			str[i][1] =scan.next();
			
			System.out.print("���� : ");
			str[i][2] =scan.next();
			System.out.println("==========================");
		}
		
		System.out.println(str.length + "�� ��� �Ϸ�!!");
		for(int i=0; i<str.length; i++) {
			
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
