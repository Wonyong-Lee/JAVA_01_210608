package Exam;

import java.util.Scanner;

public class Example_13Main {

	public static void main(String[] args) {

		Example_13 ws=new Example_13();
		
		// ���� ��ȯ method ȣ�� (computer)
		String answer=ws.getAnswer();       
		
		// ����� �ܾ ��� �ֱ�. ��, ���� ����
		String question=ws.getScrambledWrd(answer);
		
		// ������ �ܾ� ���
		System.out.println("���� : " + question);
		
		while(true) {
			System.out.print("�ܾ�� ? " );
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str + "����!!");
				break;
			}else {
				System.out.println(str + "����!!");
			}
			
		}
	}

}
