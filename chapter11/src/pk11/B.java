package pk11;

public class B {
	// ���� ��Ű�� ���̶� ��ü�����Ͽ� ����
	public void method() {
		A a = new A();        // ��ӿ����� super();
		a.field="value";
		a.method();
	}

	public static void main(String[] args) {
		B b = new B();
		b.method();
		
	}

}
