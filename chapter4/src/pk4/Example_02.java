package pk4;

public class Example_02 {

	public static void main(String[] args) {

		// 원의 넓이를 구하시오 (반지름*반지름*3.14)  반지름:10
		// int -> double : Double.parseDouble
		// String -> int : Integer.parseInt
		
		int r=10;
		int r2=3;
		int r3=14;
		
		double p=3.14;
		double result=r*r*p;
		// double result=r*r*Double.parseDouble(r2 + "." + r3); // 억지로 하는법
		
		System.out.println("원의 넓이는 : " + result);
	}

}
