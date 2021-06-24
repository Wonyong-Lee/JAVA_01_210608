package pk13;

public abstract class Computer {
	
	// 하나 이상의 abstract method가 들어 있으면, 반드시 클래스도 추상적이여야한다.
	public abstract void display();             // {} 구현부가 빠진 클래스가 추상화
	public abstract void typing();             
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
