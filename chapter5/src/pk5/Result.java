package pk5;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		// �α���
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���̵� : ");      // smile
		String ID= scan.nextLine();
		
		System.out.print("��й�ȣ : ");     // 12345
		String PW= scan.nextLine();
		
		// PW ����ȯ(string -> int)
		int pass=Integer.parseInt(PW);
		
		if(ID.equals("smile")) {
			if(pass == 12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ����: ��й�ȣ�� �ٸ��ϴ�.");
			}
		}else {
			System.out.println("�α��� ����: �������� �ʴ� ���̵� �Դϴ�.");
		}
		
	}

}
