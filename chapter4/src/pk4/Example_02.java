package pk4;

public class Example_02 {

	public static void main(String[] args) {

		// ���� ���̸� ���Ͻÿ� (������*������*3.14)  ������:10
		// int -> double : Double.parseDouble
		// String -> int : Integer.parseInt
		
		int r=10;
		int r2=3;
		int r3=14;
		
		double p=3.14;
		double result=r*r*p;
		// double result=r*r*Double.parseDouble(r2 + "." + r3); // ������ �ϴ¹�
		
		System.out.println("���� ���̴� : " + result);
	}

}
