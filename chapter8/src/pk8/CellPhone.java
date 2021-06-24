package pk8;

public class CellPhone {

	// 필드
	String model;
	String color;
	
	// 생성자
	
	// method
	void powerOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다. ");
	}
	
	void bell() {
		System.out.println("벨이 울립니다. ");
	}
	
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	void receVoice(String messaga) {
		System.out.println("상대방 : " + messaga);
	}
	
	void hangUp() {
		System.out.println("전원을 끊습니다. ");
	}
	
	
	
}
