package Exam;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {

		/* Scanner�� ���� ���� n�� �Է¹޴´�
		 * �׸��� ���� �Է¹��� ���� n������ ���� ����Ͽ� �� ����� ����Ͻÿ�.
		 * ex) scan���� 5�� �Է� : 1+2+3+4+5�� ��°���� 15�� �ֿܼ� ���
		 */
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		Scanner scan=new Scanner(System.in);            // ��ĳ�ʼ���
		
		int n=scan.nextInt();                           // n�� ��ĳ�ʷκ��� �޾ƿ�
		int result=0;                                   // ����� ������ ��
		
		for(int i=0; i<=n; i++) {                       // i�� n���� �۰ų� ũ�� i�� 1������(�⺻�� 0)
			result+=i;          
		}
		System.out.println("��� : " + result);
		
		
	}

}
