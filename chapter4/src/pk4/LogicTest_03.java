package pk4;

public class LogicTest_03 {

	public static void main(String[] args) {

		int num1=10;
		int i=2;
		
		// and������ ���� �����̸� �����̹Ƿ� �ڴ� ��� ����
		boolean value= ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		// or������ ���� ���̸� ������ ���̹Ƿ� �ڴ� ��� ����
		value= ((num1=num1+10)>10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
