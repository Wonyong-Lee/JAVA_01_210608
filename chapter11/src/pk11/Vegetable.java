package pk11;

public class Vegetable {

	String sort;
	String season;
	String size;
	
	// 기본생성자
	
	// method를 활용하여 멤버 변수 set
	public void Set1(String a, String b, String c) {
		sort=a;
		season=b;
		size=c;
	}
	
	// method를 활용하여 멤버 변수 get
	public void Disp1() {
		System.out.println("분류 : " + sort);
		System.out.println("계절 : " + season);
		System.out.println("크기 : " + size);
	}
	
}
