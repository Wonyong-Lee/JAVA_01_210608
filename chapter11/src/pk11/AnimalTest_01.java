package pk11;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}
}

public class AnimalTest_01 {
	
	public void moveAnimal(Animal animal) {     // �Ű����� ����Ŭ������ ��ü
		animal.move();
		
	}
	
	public static void main(String[] args) {

		AnimalTest_01 aTest = new AnimalTest_01();
		aTest.moveAnimal(new Human());          // Animal animal = new Human();
		aTest.moveAnimal(new Tiger());          // Animal animal = new Tiger();
		aTest.moveAnimal(new Eagle());          // Animal animal = new Eagle();
	}

}
