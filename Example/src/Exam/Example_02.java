package Exam;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		/*Scanner�� ���� ���� n1, n2�� �Է¹޴´�. 
		 * �׸��� n1���� n2������ ���� ����Ͽ� �� ����� ����Ͻÿ�. 
		 * ex) scan���� 5,2�� �Է� : 2+3+4+5�� ��°�� 13�� �ֿܼ� ���
		 */
		
		// ���� ����
		
		int n1=0, n2=0;
		int result=0;
		int temp=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		n1=scan.nextInt();
		
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		n2=scan.nextInt();
		
		// Ȥ�� ū ���� n1�� �ԷµǸ� ������ �̿��Ͽ� ���� ���� n1�� ������
		if(n1>n2) {
			temp=n1;
			n1=n2;
			n2=temp;
		}				
			
		// for���� �̿��Ͽ� ���� ����
		for(int i=n1; i<=n2; i++) {
			result += i;
		}
		System.out.println("��� : " + result);
		
		
	}

}
