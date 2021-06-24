package pk4;

public class Arith_Test_02 {

	public static void main(String[] args) {

		int mathScore=90;
		int engScore=70;
		
		int totalScore=mathScore+engScore;
		System.out.println(totalScore);
		
		int avgScore=(totalScore)/2;        // totalScore대신 (mathScore+engScore)로도 사용가능
		System.out.println(avgScore);
	}

}
