package pk11;

public class B {
	// 같은 패키지 안이라 객체생성하여 참조
	public void method() {
		A a = new A();        // 상속에서는 super();
		a.field="value";
		a.method();
	}

	public static void main(String[] args) {
		B b = new B();
		b.method();
		
	}

}
