package pk7;

public class Method {
	
	// �ʵ����=�������
	// ������ ����(�⺻�����ڸ� ���)

	void makeBread() {
		System.out.println("���� ��������ϴ�.");
	} // method1
	
	void makeBread(int count) {
		// ù ��° ���� ��������ϴ�.
		// �� ��° ���� ��������ϴ�.
		for(int i=0; i<count; i++) {
			System.out.println((i+1) + ("��° ���� ��������ϴ�."));			
		}
		System.out.println();
		System.out.println("��û�Ͻ� " + count + "���� ���� ��� �ϼ��Ǿ����ϴ�.");
	} // method2
	
	void makeBread(int count, String name) {
		// ù ��° ���� ��������ϴ�.
		// �� ��° ���� ��������ϴ�.
		for(int i=0; i<count; i++) {
			System.out.println((i+1) + "��° " + name +("���� ��������ϴ�."));			
		}
		System.out.println();
		System.out.println("��û�Ͻ� " + count + "���� " + name + "���� ��� �ϼ��Ǿ����ϴ�.");
	} // method3

} // class
