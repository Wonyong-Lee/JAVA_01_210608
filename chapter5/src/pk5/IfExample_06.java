package pk5;

public class IfExample_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;
		// double num1=(Math.radom()*6); // �Ǽ��� ���ڰ� �������� ����
		
		if(num==1) {
			System.out.println(num + "1�� ȹ��");
		}else if(num==2) {
			System.out.println(num + "2�� ȹ��");
		}else if(num==3) {
			System.out.println(num + "3�� ȹ��");
		}else if(num==4) {
			System.out.println(num + "4�� ȹ��");
		}else if(num==5){
			System.out.println(num + "5�� ȹ��");
		}else {
			System.out.println(num + "6�� ȹ��");
		}
	}

}
