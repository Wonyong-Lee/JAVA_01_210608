package pk8;

public class Subway {

	public String lineNumber;      // 지하철 노선
	public int passengerCount;     // 승객
	public int money;              // 수입금액
	
	// 생성자
	
	// heap 메모리생성
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {  // 승객이 탄경우
		this.money += money;       // 수입 증가
		passengerCount++;          // 승객수 증가
	}
	
	
	public void subwayInfo() {       // 지하철 정보
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
	}
	
}
