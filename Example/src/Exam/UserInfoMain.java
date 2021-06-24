package Exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {

		int select;
		
		int money;
		
		// 객체
		UserInfo ui = new UserInfo();
		
		// while문:무한반복
		// while(True) 1,2,3,4 목록받고 scan으로 번호입력할수있게.. scan입력 select
		// switch(select)
		
		outer: while(true) {
			System.out.println("===================================");
			System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
			System.out.println("===================================");
			System.out.print("선택> ");
			
			Scanner scan = new Scanner(System.in);
			
			select=Integer.parseInt(scan.nextLine());
			
			switch(select) {
				case 1:
					System.out.println("입금을 선택하셨습니다.");
					System.out.print("입금할 금액을 입력하세요 : ");
					money=scan.nextInt();
					ui.deposit(money);
					break;
				case 2:
					System.out.println("출금을 선택하셨습니다.");
					System.out.print("출금할 금액을 입력하세요 : ");
					money=scan.nextInt();
					ui.withdraw(money);
					break;
				case 3:
					System.out.println("잔액확인을 선택하셨습니다.");
					System.out.println("현재 잔액은 " + ui.showMoney() + "원입니다.");
					break;
				case 4:
					System.out.println("종료를 선택하셨습니다.");
					break outer;
			}
			
		}
		
	}

}
