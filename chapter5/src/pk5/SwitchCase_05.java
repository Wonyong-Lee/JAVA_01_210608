package pk5;

public class SwitchCase_05 {

	public static void main(String[] args) {

		char grade='B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
				
			case 'B', 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			
			default:
				System.out.println("�մ� �Դϴ�.");
		}
	}

}
