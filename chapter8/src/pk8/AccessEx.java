package pk8;

// ���������ڽǽ�
public class AccessEx {

	// �������
	private int aa;     // ����ȭ(������ Ŭ���������� ��밡��)
	public int bb;      // ����
	int cc;             // ��Ű���� ������ ��밡��
	
	// ������
	
	// method
	public void SetA(int a) {
		aa=a; // private �̿��� public method�� ���ؼ� �ܺο��� ��밡��
	}
	
	public void SetB(int b) {
		bb=b;
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa�� : " + aa + " \nbb�� : " + bb + "\ncc�� : " + cc);
	}
	
	public static void main(String[] args) {

		AccessEx obj = new AccessEx();
		
		// obj.aa=10; // ������� ��������
		obj.SetA(10); // method�� ������ �ʱ�ȭ
		
		
		obj.SetB(20);
		
		// obj.cc=30;
		obj.SetC(30);
		
		obj.Disp();
		
	}

}
