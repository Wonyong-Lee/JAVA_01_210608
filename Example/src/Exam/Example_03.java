package Exam;

import java.util.Random;
import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		// 예) 416
		// 1~9 사의 수를 입력하세요 :
		/*
		 첫번째 수를 입력 하세요 : 4
		 첫번째 수를 입력 하세요 : 5
		 첫번째 수를 입력 하세요 : 6
		 Strike 0Ball
		 
		 첫번째 수를 입력 하세요 : 7
		 첫번째 수를 입력 하세요 : 8
		 첫번째 수를 입력 하세요 : 9
		 OUT!!
		 
		 첫번째 수를 입력 하세요 : 1(4)
		 첫번째 수를 입력 하세요 : 6(5)
		 첫번째 수를 입력 하세요 : 5(6)
		 0Strike 2Ball
		 
		 첫번째 수를 입력 하세요 : 4
		 첫번째 수를 입력 하세요 : 5
		 첫번째 수를 입력 하세요 : 6
		 WIN!!
		 */
		
		Scanner scan=new Scanner(System.in);
		
		// 컴퓨터가 발생할 난수 세 개
		int com1=0, com2=0, com3=0;
		
		// 1에서 9까지의 난수 발생(Computer)
		// 컴퓨터의 자료 준비
		do {
			
		com1=new Random().nextInt(9)+1;
		com2=new Random().nextInt(9)+1;
		com3=new Random().nextInt(9)+1;
		
		}while(com1 == com2 || com1 == com3 || com2 == com3);
		
				
		
		// 사용자가 입력할 숫자
		int user1=0, user2=0, user3=0;
		
		while(true) {
			System.out.println("1~9 사이의 수를 입력하세요");
			System.out.println("첫 번째 수를 입력 하세요: ");
			user1=scan.nextInt();  // 사용자의 수를 입력 받는다
			System.out.println("두 번째 수를 입력 하세요: ");
			user2=scan.nextInt();  // 사용자의 수를 입력 받는다
			System.out.println("세 번째 수를 입력 하세요: ");
			user3=scan.nextInt();  // 사용자의 수를 입력 받는다
			
			int strike=0;
			int ball=0;
			
			// 만약에 사용자가 입력한 첫번째 play숫자와 com1이랑 같으면 strike 1점 획득
			if(user1==com1) {
				strike++;
			}
			// user1을 기준으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
			else if((user1==com2 || user1==com3)) {
				ball++;
			}				
			// 만약에 사용자가 입력한 두번째 play 숫자와 com2가 같으면 strike 1점 획독
			if(user2==com2) {
				strike++;
			}
			// user2를 기준으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
			else if((user2==com1 || user2==com3)) {
				ball++;
			}
			// 만약에 사용자가 입력한 세번째 play 숫자와 com3가 같으면 strike 1점 획독
			if(user3==com3) {
				strike++;
			}
			// user3를 기준으로 숫자는 맞지만 자리수가 다를 경우 볼로 판정 : ball 1점 획득
			else if((user3==com1 || user3==com2)) {
				ball++;
			}				
			// strike 3점이면 WIN!!출력 후 종료
			if(strike==3) {
				System.out.println("WIN!! - " + com1 + com2 + com3);
				break;
			}
			// strike 0, ball 0이면 OUT!!
			else {
				if((strike>0)||(ball>0)) {
					System.out.println(strike + "Strike " + ball + "ball");				
				}
				else {          // 아무것도 못했을경우
					System.out.println("OUT!!");
				}
			}
		}  // while
		
	} //main

} //class
