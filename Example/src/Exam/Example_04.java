package Exam;

import java.util.Scanner;

public class Example_04 {

	public static void main(String[] args) {

		/*
		 키보드에서 두 수를 입력받아, 입력받은 두 수의 최소공배수 구하기.
		 예) 2, 5를 입력: 2 4 6 8 10 , 5 10 15 20 25  >> 10		 
		    3과 3을 입력: 3		  
		 */
		
		// 변수
		int a=0;
		int b=0;
		int c;
		// Scanner 객체		
		Scanner scan=new Scanner(System.in);
		// 안내문구와 함께 입력을 받음
		System.out.print("첫 번째 숫자를 입력하세요.");
		a=scan.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요.");
		b=scan.nextInt();
		
		c=(a*b);
		
		int i=0;
		// 최소공배수 for문
				
		for(i=1;i<=c; i++) {
			if((i % a==0) && (i % b==0))
				break;
		}
		System.out.println(a + "과(와) " + b + "의 최소공배수 : " + i);
		
		// 최소공배수 while문		
		
		/*
		 * while(true) { i++; if(i % a==0 && i % b==0) break; } System.out.println(a +
		 * "과(와) " + b + "의 최소공배수 : " + i);
		 */
		
		
	}

}
