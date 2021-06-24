package pk4;

public class AssignTest_02 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		int num3=2;
		
		num1+=num2;           // num1=num1+num2; 30
		System.out.println(num1);
		
		num2-=num2;           // num1=num1-num2; 10
		System.out.println(num1);
		
		num1*=num3;           // num1=num1*num3; 20
		System.out.println(num1);
		
		num1/=num3;           // num1=num1/num3; 10
		System.out.println(num1);
		
		num1%=num3;           // num1=num1%num3; 0
		System.out.println(num1);
		
	}

}
