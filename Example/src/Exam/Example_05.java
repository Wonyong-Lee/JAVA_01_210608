package Exam;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {

		/*
		 Ű���忡�� �� ���� �Է¹޾�, �Է¹��� �� ���� �ִ����� ���ϱ�.
		 ��) 10, 4�� �Է�: 10 => 2 5 10 , 4 => 2 4
		 ��) 3, 7�� �Է�:  		 
		 */
		
		// ����
		int a=0;
		int b=0;
		int check=0;
		
		// �μ� ��ĵ
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ���");
		a=scan.nextInt();
		
		System.out.print("�� ��° ���� �Է��ϼ���");
		b=scan.nextInt();
		
		// �� ���߿� ���� ���� ����
		if(a>=b) {
			check=b;
		}
		else {
			check=a;
		}
		
		// for(���� ��;1���� ũ�ų� ����������; i--)
		int i=0;
		for(i=check;i>=1; i--) {
			if((a%i==0) && (b%i==0)) {
				break;
			}
		}
			
		// ���
		if(i==1) {      // �� ������ ����� �Ѵ� 1�ϻ��ϰ��
			System.out.println("���μ��Դϴ�.");
		}else {
			System.out.println(a + "��(��) " + b + "�� �ִ������� " + i);
		}
		
		
		
	}

}
