package pk9;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person returnSelf() {
		return this;
	}
	
	
	
	public static void main(String[] args) {
		Person noName = new Person();
		Person name = new Person("장길산", 28);
		
		// 기본생성자 객체	
		System.out.println(noName.name);
		System.out.println(noName.age);
		// 오버로딩생성자 객체
		System.out.println(name.name);
		System.out.println(name.age);
		
		System.out.println(noName.returnSelf());
		
	}

}
