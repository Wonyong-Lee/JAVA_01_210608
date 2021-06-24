package Exam;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {

		/*
		 키보드에서 수를 입력받아, 입력받은 수. 그 숫자가 소수인지 아닌지를 판별하시오.
		 소수 : 1과 자기자신 이외는 다른 숫자와는 나누어 떨어지지 않는 수
		 예) 7, 11, 13, 19, 23,...
		 */
		
		
		// 변수선언
		int a=0;		
		
		// 스캔
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		
		a=scan.nextInt();
		// for 구현
		int i=0;
		for(i=2; i<=a; i++) {                 // i를 for안에서 선언하고 하면 for문이끝나고 난 후, if문에서는 사용불가하므로 미리선언하고 들어올것
			if(a%i==0) {
				break;
			}
		}
		
			
		// if 구현
		if (i==a) {
			System.out.println(a + "는(은) 소수입니다.");
		}else {
			System.out.println(a + "는(은) 소수가 아닙니다.");
		}
		
		
	}

}
