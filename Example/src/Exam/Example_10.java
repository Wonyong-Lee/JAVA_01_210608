package Exam;

import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {

		// Ű���忡�� ���ڿ� Ư�����ڸ������� ���ĺ��� �������� �Է¹޴´� => scan���� �޴´�
		// �Է¹��� ���ڿ��� �ҹ��� a�� �� �� �ִ����� �Ǻ��ϴ� ������ ����
		
		// ��) �����Է�>asdfasdfasdf
		// ��) a�� ����>3��
		
		Scanner scan=new Scanner(System.in);
		
		String str;
		// str.charAt(i) == 'a'
		int count=0;
		
		//�Է� //for //if
		
		System.out.print("���ڸ� �Է��ϼ���.");
		
		str=scan.next();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a�� ������ " + count);		
		
	}

}
