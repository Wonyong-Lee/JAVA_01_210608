package pk11;

public class Vegetable {

	String sort;
	String season;
	String size;
	
	// �⺻������
	
	// method�� Ȱ���Ͽ� ��� ���� set
	public void Set1(String a, String b, String c) {
		sort=a;
		season=b;
		size=c;
	}
	
	// method�� Ȱ���Ͽ� ��� ���� get
	public void Disp1() {
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
		System.out.println("ũ�� : " + size);
	}
	
}
