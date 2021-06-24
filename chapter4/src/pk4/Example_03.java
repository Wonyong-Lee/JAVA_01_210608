package pk4;

public class Example_03 {

	public static void main(String[] args) {

		// 삼항연산자를 이용하여 score가 90보다 크면 'A'이고, score가 80보다 크면 'B'
		
		int score=70;
		
		char R;
		R = (score>90) ? 'A' : 'B';
		System.out.println(R);
		
		
		// 삼항연산자를 이용하여 score가 90보다 크면 'A'이고, score가 80보다 크면 'B'고 그 이하는 모두 'C'로 간주
		
		R = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(R);
	}

}
