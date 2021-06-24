package pk5;

public class ForTest_05 {

	public static void main(String[] args) {

		// 0부터 출발해서 100까지의 합을 구하되 합이 100에 가까워질때 멈추는 i
		
		int num=0;
		int sum=0;
				
		for(num=0; sum<100; num++) {
			sum+=num;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}

}
