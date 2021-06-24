package pk11;

public class Paprika extends Vegetable{

	private String color;
	private String name;
	private int price;
	
	public void Set3(String a, String b, int c) {
		color=a;
		name=b;
		price=c;
	}
	
	public void Disp2() {
		System.out.println("------------paprika---");
		System.out.println("색깔 : " + color);
		System.out.println("이름 : " + super.size);
	
		// super : 기본생성자를 통해서 객체 생성
		System.out.println();
		System.out.println("가격 : " + price);
		System.out.println("------------paprika---");
	}
	
	public void Disp3() {
		System.out.println("색깔 : " + color);
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
