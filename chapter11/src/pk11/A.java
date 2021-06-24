package pk11;

public class A {
	
	// 같은 패키지에서는 protected라고 하더라도 public과 같다
	// 다른 패키지에서는 상속받은 자식클래스에는 public, 일반클래스에는 private의 성격을 갖는다
	
	// 멤버 변수
	protected String field;
	
	// 생성자
	public A() {  // 기본 생성자
		
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}
}
