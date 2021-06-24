package pk7;

public class Ex_01_OverloadingMain {

	public static void main(String[] args) {
		
		// Ex_01_Overloading의 객체 => ex		
		Ex_01_Overloading ex = new Ex_01_Overloading();
		
		ex.getResult('A');
		ex.getResult(10);
		ex.getResult("점심시간");
		ex.getResult(20, "배고파요");

	}

}
