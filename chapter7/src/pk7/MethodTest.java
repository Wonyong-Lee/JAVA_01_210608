package pk7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MethodTest {

	int cnt =0;
	int input_num=0;
	
	int[] bread= null;
	int count=0;
	boolean run = true;
	
	void makeBread() {
		System.out.println("�� �ϼ�!!");
	}
	
	void makeBread(int count) { // int count = 3
		
		bread = new int[count]; // bread = new int[5]
		
		for(int i=0; i<bread.length; i++) {
			System.out.println( (i+1) + "��° �� �ϼ�!!");
		}
		System.out.println("��û�Ͻ� " + count + "���� ���� ��� �ϼ��Ǿ����ϴ�.");
	}
	
	void makeBread(int count, String name) {
		
		bread =  new int[count];
		
		for(int i=0; i<bread.length; i++) {
			System.out.println((i+1) + "��° " + name +("�� �ϼ�!!"));
		}
		System.out.println("��û�Ͻ� " + count + "���� " + name + "���� ��� �ϼ��Ǿ����ϴ�.");
	}
	
	
	void order() {
		Scanner scan = new Scanner(System.in);
		
				while(run) {
				System.out.println("========================================");
				System.out.println("1.�� ������ ���� | 2.�� ������ ���� ���� | 3.����");
				System.out.println("========================================");
				System.out.print("����> ");
				input_num=scan.nextInt();
				
				if (input_num == 1) {
					System.out.print("�� ������ ����>");
					cnt= scan.nextInt();
					makeBread(cnt);            // �Ű������� ������ Ÿ�Ը� �������.
				}else if(input_num == 2) {
					System.out.print("�� ���� : ");
					cnt = scan.nextInt();
					
					System.out.print("�� �̸� : ");
					String name = scan.next();
					makeBread(cnt, name);
				}else if(input_num == 3){
					run=false;
					System.out.println("���α׷� ����");
				}
			}
		}
	}
		
