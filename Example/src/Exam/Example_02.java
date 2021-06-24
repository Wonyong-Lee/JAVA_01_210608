package Exam;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		/*Scanner를 통해 정수 n1, n2를 입력받는다. 
		 * 그리고 n1부터 n2까지의 합을 계싼하여 그 결과를 출력하시오. 
		 * ex) scan으로 5,2로 입력 : 2+3+4+5의 출력결과 13를 콘솔에 출력
		 */
		
		// 변수 선언
		
		int n1=0, n2=0;
		int result=0;
		int temp=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		n1=scan.nextInt();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		n2=scan.nextInt();
		
		// 혹시 큰 수가 n1에 입력되면 스왑을 이용하여 작은 수가 n1에 오도록
		if(n1>n2) {
			temp=n1;
			n1=n2;
			n2=temp;
		}				
			
		// for문을 이용하여 합을 구함
		for(int i=n1; i<=n2; i++) {
			result += i;
		}
		System.out.println("결과 : " + result);
		
		
	}

}
