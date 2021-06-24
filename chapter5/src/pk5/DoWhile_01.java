package pk5;

public class DoWhile_01 {

	public static void main(String[] args) {

		int num=1;      // index 변수 초기화
		int sum=0;
		
		do {            // do~while문의 header
			sum += num; // 1이라는 값을 증가
			num++;      // 2로 index 변수 증가
		}while(num<=10);// do~while문 조건비교해서 닫기
		
		// do~while문 종료후 수행
		System.out.println("1부터 10까지의 합 : " + sum + "입니다.");
	}

}
