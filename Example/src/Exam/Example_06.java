package Exam;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {

		/*
		 Ű���忡�� ���� �Է¹޾�, �Է¹��� ��. �� ���ڰ� �Ҽ����� �ƴ����� �Ǻ��Ͻÿ�.
		 �Ҽ� : 1�� �ڱ��ڽ� �ܴ̿� �ٸ� ���ڿʹ� ������ �������� �ʴ� ��
		 ��) 7, 11, 13, 19, 23,...
		 */
		
		
		// ��������
		int a=0;		
		
		// ��ĵ
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		
		a=scan.nextInt();
		// for ����
		int i=0;
		for(i=2; i<=a; i++) {                 // i�� for�ȿ��� �����ϰ� �ϸ� for���̳����� �� ��, if�������� ���Ұ��ϹǷ� �̸������ϰ� ���ð�
			if(a%i==0) {
				break;
			}
		}
		
			
		// if ����
		if (i==a) {
			System.out.println(a + "��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println(a + "��(��) �Ҽ��� �ƴմϴ�.");
		}
		
		
	}

}
