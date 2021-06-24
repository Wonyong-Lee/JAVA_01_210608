package pk4;

public class Example_01 {

	public static void main(String[] args) {

		/*과수원이 있다
		 * 배, 사과, 오렌지를 키우고 있는데하루에 생산되는 양은 각각 5개, 7개, 5개
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균개수를 출력
		 * 단, 평균값을 담는 변수는 float으로 지정할 것*/
		
		int p=5;
		int a=7;
		int o=5;
		
		int f;
		f = p +a+ o;
		System.out.println("생산된 총 과일의 수 : " + f);
		
		float fAvg;
		fAvg = f/24F;
		System.out.println("시간당 전체 과일의 평균 :" + fAvg);
		
	}

}
