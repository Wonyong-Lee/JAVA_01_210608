package pk9;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person() {
		this("�̸�����", 1);
	}
	
	public Person returnSelf() {
		return this;
	}
	
	
	
	public static void main(String[] args) {
		Person noName = new Person();
		Person name = new Person("����", 28);
		
		// �⺻������ ��ü	
		System.out.println(noName.name);
		System.out.println(noName.age);
		// �����ε������� ��ü
		System.out.println(name.name);
		System.out.println(name.age);
		
		System.out.println(noName.returnSelf());
		
	}

}
