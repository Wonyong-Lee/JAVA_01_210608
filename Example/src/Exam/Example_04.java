package Exam;

import java.util.Scanner;

public class Example_04 {

	public static void main(String[] args) {

		/*
		 Ű���忡�� �� ���� �Է¹޾�, �Է¹��� �� ���� �ּҰ���� ���ϱ�.
		 ��) 2, 5�� �Է�: 2 4 6 8 10 , 5 10 15 20 25  >> 10		 
		    3�� 3�� �Է�: 3		  
		 */
		
		// ����
		int a=0;
		int b=0;
		int c;
		// Scanner ��ü		
		Scanner scan=new Scanner(System.in);
		// �ȳ������� �Բ� �Է��� ����
		System.out.print("ù ��° ���ڸ� �Է��ϼ���.");
		a=scan.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���.");
		b=scan.nextInt();
		
		c=(a*b);
		
		int i=0;
		// �ּҰ���� for��
				
		for(i=1;i<=c; i++) {
			if((i % a==0) && (i % b==0))
				break;
		}
		System.out.println(a + "��(��) " + b + "�� �ּҰ���� : " + i);
		
		// �ּҰ���� while��		
		
		/*
		 * while(true) { i++; if(i % a==0 && i % b==0) break; } System.out.println(a +
		 * "��(��) " + b + "�� �ּҰ���� : " + i);
		 */
		
		
	}

}
