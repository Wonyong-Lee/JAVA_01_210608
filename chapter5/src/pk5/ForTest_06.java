package pk5;

public class ForTest_06 {

	public static void main(String[] args) {

		int num=0;
		int sum=0;
				
		// 합이 100을 초과하면 멈춤
		for(num=0; ; num++) {
			sum+=num;
			if(sum>=100)
				break;

		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		// 합이 100보다 작을 때까지 출력
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(sum<100) {
				System.out.println(sum);
			}
		}
		
	}

}
