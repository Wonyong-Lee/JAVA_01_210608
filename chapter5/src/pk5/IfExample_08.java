package pk5;

import java.util.Scanner;

public class IfExample_08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in); // ��ĳ�ʶ� Ŭ������ ��ĵ�� �� �� �ִ� ���� Ȯ��, ���� ���ο� �޸𸮸� ��
		
		System.out.print("ù ��°  �� : ");
		double num1=Double.parseDouble(scan.nextLine());     // nextLine() �⺻ Ÿ���� string
		
		System.out.println(num1);

		
		System.out.print("�� ��° �� : ");
		double num2=Double.parseDouble(scan.nextLine());
		
		System.out.println(num2);
		
		
		if(num2 != 0.0) {
			System.out.println("��� : " + (num1/num2));
		}else {
			System.out.println("��� : ���Ѵ�");
		}
	}

}
