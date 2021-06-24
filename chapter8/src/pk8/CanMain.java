package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		// 변수선언
		String select = "";                     // null값으로 설정
		int money=0;
		
		// 객체선언		
		Vending vd = new Vending();             // Can can = new Can(); 은 이미 Vending에서 했기때문에 Vending을 불러오면 됨
		vd.init();                              // 초기화; 음료수 셋팅 완료
		
		// 입력받아 showCans 호출
		System.out.print("돈을 투입하세요 : ");
		Scanner scan = new Scanner(System.in);
		money=scan.nextInt();
		vd.showCans(money);
		
		// 입력받아 outCan 호출
		System.out.print("음료수를 선택하세요 :");
		select=scan.next();
		vd.outCan(select);
		
	}

}
