package pk4;

public class LogicTest_02 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		boolean flag1=(num1>0) && (num2>0);
		System.out.println(flag1);
		
		// && -> F
		boolean flag2=(num1==0) && (num2>num1);
		System.out.println(flag2);
		
		// || -> T
		boolean flag3=(num1>=10) || (num2<=num2);
		System.out.println(flag3);
		
		// || -> F
		boolean flag4=(num1>num2) || (num2==num1);
		System.out.println(flag4);
		
		// != -> F
		boolean flag5=(num1<20) != (num2>10);
		System.out.println(flag5);
		
		// ºÎÁ¤ -> F
		boolean flag6=!(num1>0);
		System.out.println(flag6);
	}

}
