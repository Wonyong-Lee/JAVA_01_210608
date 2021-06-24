package pk4;

public class IncreTest_01 {

	public static void main(String[] args) {

		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : " + (++a));                 // a=11
		System.out.println("a++ : " + (a++));                 // a=11
		System.out.println("후위계산 : " + a);                   // a=12
		
		System.out.println("c++ : " + (c++));                 // c=3
		System.out.println("후위계산 : " + c);                   // c=4
		
		
		// a전위계산 + b후위계산
		System.out.println("a전위계산 : " + (++a));              // a=13
		System.out.println("b후위계산 : " + (b++));              // b=20, 출력 후 b=21
		System.out.println("a전위계산 + b후위계산 : " + (a+b));     // a+b=34
		// (++a + b++) << 위 계산을 줄여서 하는 것!
	}

}
