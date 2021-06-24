package pk4;

public class LogicTest_03 {

	public static void main(String[] args) {

		int num1=10;
		int i=2;
		
		// and연산은 앞이 거짓이면 거짓이므로 뒤는 계산 안함
		boolean value= ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		// or연산은 앞이 참이면 어차피 참이므로 뒤는 계산 안함
		value= ((num1=num1+10)>10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
