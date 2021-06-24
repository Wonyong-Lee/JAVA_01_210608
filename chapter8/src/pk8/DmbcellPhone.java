package pk8;

public class DmbcellPhone extends CellPhone{             // 확장시킨 CellPhone

	// 필드 
	int channel;
	
	// 생성자
	public DmbcellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 종료합니다.");
	}
	
}
