package Exam;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {

		/*
		 키보드에서 두 수를 입력받아, 입력받은 두 수의 최대공약수 구하기.
		 예) 10, 4를 입력: 10 => 2 5 10 , 4 => 2 4
		 예) 3, 7를 입력:  		 
		 */
		
		// 변수
		int a=0;
		int b=0;
		int check=0;
		
		// 두수 스캔
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요");
		a=scan.nextInt();
		
		System.out.print("두 번째 수를 입력하세요");
		b=scan.nextInt();
		
		// 두 수중에 작은 수를 추출
		if(a>=b) {
			check=b;
		}
		else {
			check=a;
		}
		
		// for(작은 수;1보다 크거나 같을때까지; i--)
		int i=0;
		for(i=check;i>=1; i--) {
			if((a%i==0) && (b%i==0)) {
				break;
			}
		}
			
		// 출력
		if(i==1) {      // 두 숫자의 약수가 둘다 1일뿐일경우
			System.out.println("서로소입니다.");
		}else {
			System.out.println(a + "과(와) " + b + "의 최대공약수는 " + i);
		}
		
		
		
	}

}
