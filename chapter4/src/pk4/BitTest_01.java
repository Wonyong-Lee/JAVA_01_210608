package pk4;

public class BitTest_01 {

	public static void main(String[] args) {

		// Bit연산
        int num1=5;
        int num2=10;
        
        // Bit OR연산
        int result= num1|num2;
        System.out.println(result);
        
        // Bit AND연산
        result= num1&num2;
        System.out.println(result);
        
        // Bit XOR 연산
        result= num1^num2;
        System.out.println(result);
        
        // Bit NOT연산
        System.out.println(~num2+1);        // +면 -로, -면 +로
		
	}

}
