package pk4;

public class RelaTest_02 {

	public static void main(String[] args) {

		int num1=5;
		int num2=3;
		
		boolean value1=(num1 > num2);        // 5 > 3 : true
		System.out.println(value1);

		boolean value2=(num1 < num2);        // 5 < 3 : false
		System.out.println(value2);
		
		boolean value3=(num1 == num2);       // 5 = 3 : false
		System.out.println(value3);
		
		boolean value4=(num1 != num2);       // 5 ¡Á 3 : true
		System.out.println(value4);
	}

}
