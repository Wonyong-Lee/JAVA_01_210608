package pk11;

public class Berry extends Fruit{

	private String size;
	private String name;
	

	public void Set2(String a, String b) {
		size=a;
		name=b;
	}
	
	public void Disp2() {
		System.out.println("ũ�� : " + size);
		System.out.println("�̸� : " + name);
	}
	
}
