package pk7;

public class Ex_01_Overloading {

	// 필드 = 멤버변수
	
	// 생성자생략(디폴트 생성자)
	
	// method 구현
	
	// method 중복허용 = Overloading : 클래스에 동일한 이름의 method가 존재.
	
	// Overloading(다형성) : 유지보수 관리차리의 효율성을 극대화함
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다.");
	}
	
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다.");
	}
	
	public void getResult(String n) {
		System.out.println(n + "은(는) String입니다.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "은(는) int " + str + "은(는) str 입니다.");
	}
	
}
