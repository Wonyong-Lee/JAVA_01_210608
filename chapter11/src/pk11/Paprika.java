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
		System.out.println("���� : " + color);
		System.out.println("�̸� : " + super.size);
	
		// super : �⺻�����ڸ� ���ؼ� ��ü ����
		System.out.println();
		System.out.println("���� : " + price);
		System.out.println("------------paprika---");
	}
	
	public void Disp3() {
		System.out.println("���� : " + color);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
	}
}
