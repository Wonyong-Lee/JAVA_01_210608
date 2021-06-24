package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		// ��) 416
		// 1~9 ���� ���� �Է��ϼ��� :
		/*
		 ù��° ���� �Է� �ϼ��� : 4
		 ù��° ���� �Է� �ϼ��� : 5
		 ù��° ���� �Է� �ϼ��� : 6
		 Strike 0Ball
		 
		 ù��° ���� �Է� �ϼ��� : 7
		 ù��° ���� �Է� �ϼ��� : 8
		 ù��° ���� �Է� �ϼ��� : 9
		 OUT!!
		 
		 ù��° ���� �Է� �ϼ��� : 1(4)
		 ù��° ���� �Է� �ϼ��� : 6(5)
		 ù��° ���� �Է� �ϼ��� : 5(6)
		 0Strike 2Ball
		 
		 ù��° ���� �Է� �ϼ��� : 4
		 ù��° ���� �Է� �ϼ��� : 5
		 ù��° ���� �Է� �ϼ��� : 6
		 WIN!!
		 */
		
		Scanner scan=new Scanner(System.in);
		
		// ��ǻ�Ͱ� �߻��� ���� �� ��
		int com1=0, com2=0, com3=0;
		
		// 1���� 9������ ���� �߻�(Computer)
		// ��ǻ���� �ڷ� �غ�
		do {
			
		com1=new Random().nextInt(9)+1;
		com2=new Random().nextInt(9)+1;
		com3=new Random().nextInt(9)+1;
		
		}while(com1 == com2 || com1 == com3 || com2 == com3);
		
				
		
		// ����ڰ� �Է��� ����
		int user1=0, user2=0, user3=0;
		
		while(true) {
			System.out.println("1~9 ������ ���� �Է��ϼ���");
			System.out.println("ù ��° ���� �Է� �ϼ���: ");
			user1=scan.nextInt();  // ������� ���� �Է� �޴´�
			System.out.println("�� ��° ���� �Է� �ϼ���: ");
			user2=scan.nextInt();  // ������� ���� �Է� �޴´�
			System.out.println("�� ��° ���� �Է� �ϼ���: ");
			user3=scan.nextInt();  // ������� ���� �Է� �޴´�
			
			int strike=0;
			int ball=0;
			
			// ���࿡ ����ڰ� �Է��� ù��° play���ڿ� com1�̶� ������ strike 1�� ȹ��
			if(user1==com1) {
				strike++;
			}
			// user1�� �������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
			else if((user1==com2 || user1==com3)) {
				ball++;
			}				
			// ���࿡ ����ڰ� �Է��� �ι�° play ���ڿ� com2�� ������ strike 1�� ȹ��
			if(user2==com2) {
				strike++;
			}
			// user2�� �������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
			else if((user2==com1 || user2==com3)) {
				ball++;
			}
			// ���࿡ ����ڰ� �Է��� ����° play ���ڿ� com3�� ������ strike 1�� ȹ��
			if(user3==com3) {
				strike++;
			}
			// user3�� �������� ���ڴ� ������ �ڸ����� �ٸ� ��� ���� ���� : ball 1�� ȹ��
			else if((user3==com1 || user3==com2)) {
				ball++;
			}				
			// strike 3���̸� WIN!!��� �� ����
			if(strike==3) {
				System.out.println("WIN!! - " + com1 + com2 + com3);
				break;
			}
			// strike 0, ball 0�̸� OUT!!
			else {
				if((strike>0)||(ball>0)) {
					System.out.println(strike + "Strike " + ball + "ball");				
				}
				else {          // �ƹ��͵� ���������
					System.out.println("OUT!!");
				}
			}
		}  // while
		
	} //main

} //class
