package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {

		// 전위형은 계산하고 출력, 후위형은 현재 값을 출력 후 계산을 나중에
		
		// 전위 연산
		int gameScore=150;               
		int lastScore1=++gameScore;        // 1을 더하고 읽기 151
		System.out.println(lastScore1);    // 151
		
		int lastScore2=--gameScore;        // 1을 빼고 읽기 150
		System.out.println(lastScore2);    // 150
		
		
		// 후위 연산
		int lastScore3=gameScore++;        // 읽고난 후 1을 더하기
		System.out.println(lastScore3);    // 150
		System.out.println(gameScore);     // 151
		
		int lastScore4=gameScore--;        // 읽고난 후 1을 빼기
		System.out.println(lastScore4);    // 151
		System.out.println(gameScore);     // 150
		
				
 	}

}
