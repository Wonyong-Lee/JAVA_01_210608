package pk13;

public class AnimalExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// 각각의 객체를 만들어서 Cat과 Dog의 sound method 호출
		System.out.println("---각각의 객체 생성---");
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println();
		
		Dog dog = new Dog();
		dog.sound();

		System.out.println("---자동형변환(Upcasting)---");
		System.out.println("방법1-----");
		Animal ani1 = new Cat();
		ani1.sound();
		
		System.out.println("방법2-----");
		Animal ani2 = null;  // 초기화가 안되있는 상태 선언
		ani2 = new Dog();    // heap 할당
		ani2.sound();
		
		System.out.println();
		
		ani2 = new Cat();
		ani2.sound();
		
		System.out.println("---method의 매개변수 사용---");
		animalSound(new Cat());            // Animal animal = new Cat();  같은의미
		animalSound(new Dog());
		
	}
	

}
