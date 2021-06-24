package pk7;

public class TryCatchThorws {

	public static void fun() throws Exception{
		
		try {
			System.out.println("fun()method");
			throw new Exception();                     // Exception : 예외처리
		} catch (RuntimeException e) {                 // 실행중에 발생되는 에러
			System.out.println("예외발생");
		} finally {                                      // 에러를 잡지 못하더라도 무조건 실행
			System.out.println("finally 문장");
		}
		
	}
	
	public static void main(String[] args) {
		
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}
	}
}
