package Exam;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {

		/* Scanner를 통해 정수 n을 입력받는다
		 * 그리고 부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하시오.
		 * ex) scan으로 5를 입력 : 1+2+3+4+5의 출력결과는 15를 콘솔에 출력
		 */
		
		System.out.print("숫자를 입력하세요: ");
		
		Scanner scan=new Scanner(System.in);            // 스캐너설정
		
		int n=scan.nextInt();                           // n은 스캐너로부터 받아옴
		int result=0;                                   // 결과값 저장할 곳
		
		for(int i=0; i<=n; i++) {                       // i는 n보다 작거나 크고 i는 1씩증가(기본값 0)
			result+=i;          
		}
		System.out.println("결과 : " + result);
		
		
	}

}
