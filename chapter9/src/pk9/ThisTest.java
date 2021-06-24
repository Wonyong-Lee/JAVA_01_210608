package pk9;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	// 기본 생성자
	public ThisTest() {
		this(10, 3, "Bab", "20210608");
	}
	
	public ThisTest(int Speed, int Age, String RobotName, String RobotNum) {
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	public void Move() {
		Speed += 20;
		System.out.println("RObotSpeed : " + Speed);
	}
	
	public void Stop() {
		Speed = 0;
		System.out.println("RObotSpeed : " + Speed);
	}
	
	public void RAge() {
		Age += 1;
		System.out.println("RObotAge : " + Age);
	}
	
	public void RName() {
		
		System.out.println("RObotName : " + RobotName);
	}
	
	public void RNum() {
		
		System.out.println("RObotNum : " + RobotNum);
	}
	
}
