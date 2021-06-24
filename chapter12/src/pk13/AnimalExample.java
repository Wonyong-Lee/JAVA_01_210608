package pk13;

public class AnimalExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// ������ ��ü�� ���� Cat�� Dog�� sound method ȣ��
		System.out.println("---������ ��ü ����---");
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println();
		
		Dog dog = new Dog();
		dog.sound();

		System.out.println("---�ڵ�����ȯ(Upcasting)---");
		System.out.println("���1-----");
		Animal ani1 = new Cat();
		ani1.sound();
		
		System.out.println("���2-----");
		Animal ani2 = null;  // �ʱ�ȭ�� �ȵ��ִ� ���� ����
		ani2 = new Dog();    // heap �Ҵ�
		ani2.sound();
		
		System.out.println();
		
		ani2 = new Cat();
		ani2.sound();
		
		System.out.println("---method�� �Ű����� ���---");
		animalSound(new Cat());            // Animal animal = new Cat();  �����ǹ�
		animalSound(new Dog());
		
	}
	

}
