package pk5;

public class SwitchCase_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;         // ������ 1���� �ϰڴٶ�� �ǹ̷� �����ϸ��
		
		switch(num) {
		
			case 1:
				System.out.println("1�� ȹ��");
				break;
				
			case 2:
				System.out.println("2�� ȹ��");
				break;
				
			case 3:
				System.out.println("3�� ȹ��");
				break;
				
			case 4:
				System.out.println("4�� ȹ��");
				break;
				
			case 5:
				System.out.println("5�� ȹ��");
				break;
				
			default:
				System.out.println("6�� ȹ��");
			
			
		}
		
	}

}
