package pk10;

public class Bank {

	private String point;      // ������ ��ġ(����)
	private String tel;        // ������ ��ȭ��ȣ
	static float interest;     // ����������
	
	// �����ڸ� Ȱ���Ͽ� point�� tel set
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	// ����� ����� method (get)
	public void getBank() {
		System.out.println("���� : " + point + "\n" + "��ȭ��ȣ : " + tel + "\n" + "���������� : " + interest);
	}
	
}
