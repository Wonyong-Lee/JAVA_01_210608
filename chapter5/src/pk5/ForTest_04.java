package pk5;

public class ForTest_04 {

	public static void main(String[] args) {

		// 0부터 출발해서 100까지의 합은
		
		int sum=0;
		
		for(int i=0; i<101; i++) {
			sum+=i;
		}
		System.out.println("0부터 100까지의 합 :" +  sum + "입니다.");
	}

}
