package pk10;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		/* 일반적인 방법(객체 선언=> heap)
		StaticFunction sf = new StaticFunction();
		System.out.println(sf.str1);
		*/
		
		// Static method는 클래스명.method로 접근이 적합하다 ('class 변수'라고 부를수도 있다)
		String str;
		str=StaticFunction.getStatic();
		
		System.out.println("str = " + str);
		
	}

}
