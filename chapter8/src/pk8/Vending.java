package pk8;

public class Vending {

	// 멤버 변수
	private Can can[] = new Can[5];         // 선언만하고 초기화를 안했음
	private int money;
	
	// 생성자
	
	// 초기화 method는 init()
	public void init() {
		can[0] = new Can("사이다", 900); 
		can[1] = new Can("콜라", 1400); 
		can[2] = new Can("환타", 1200); 
		can[3] = new Can("미란다", 1300); 
		can[4] = new Can("바나나우유", 1100); 
	}
	
	public void showCans(int m) {
		money=m;
		
		// 사용자의 돈으로 살 수 있는 음료만 보여주기
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice()<=money)
			System.out.println(can[i].getCanName() + " : " + can[i].getPrice() + "원");			
		}
	}
	
	// 선택한 음료 제공 후 잔액을 계산해서 주는 method
	public void outCan(String name) {
		
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
			System.out.println(can[i].getCanName() + "을(를) 선택하셨습니다. ");
			System.out.println("잔액은 " + (money-can[i].getPrice() + "원입니다." ));
			}
		}
		
	}
	
}
