package pk11;

public class Car {

	public int speed;
	
	public void speedUP() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("ÀÚµ¿Â÷°¡ ¸ØÃä´Ï´Ù.");
		speed = 0;
	}
	
}
