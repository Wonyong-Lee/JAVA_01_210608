package pk4;

public class BitTest_02 {

	public static void main(String[] args) {

		int a,b,c;
		a=30;                                  // 11110
		b=25;                                  // 11001
		
		// &
		c= a&b;                                // 11000
		System.out.println("a&b : " + c);
		
		// |
		c= a|b;                                // 11111
		System.out.println("a|b : " + c);
		
		// ^
		c= a^b;                                // 00111
		System.out.println("a^b : " + c);

		// ~
		c=~(-1);
		System.out.println(c);
		
	}

}
