package pk5;

public class ForTest_03 {

	public static void main(String[] args) {

		// int i;   // 생략가능 for안으로
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		
		System.out.println("1부터 10까지의 합은: " + sum + "입니다.");
		
	}

}
