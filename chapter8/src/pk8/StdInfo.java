package pk8;

public class StdInfo {

	public String studentName;
	public int gread;
	public int money;            // 기본5000원
	
	// 생성자(오버로딩) studentName 과 money는 갖고 태어남
	
	public StdInfo (String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bs) {
		bs.take(1000);
		this.money-=1000;
	}
	
	public void takeSubway(Subway sb) {
		sb.take(1500);
		this.money-=1500;		
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은 " + money + "원입니다.");
	}
	
}
