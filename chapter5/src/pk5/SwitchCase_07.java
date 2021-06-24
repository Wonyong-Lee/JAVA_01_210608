package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_07 {

	public static void main(String[] args) {

		int time=(int)(Math.random()*4+9); // double -> int
		
		System.out.println("[현재시간: " + time + "시]"); // [현재시간: 8시]
		
		switch(time) {
			case 9:
				System.out.println("출근합니다.");
				break;
				
			case 10:
				System.out.println("커피를 마시고 쉽니다.");
				break;
		
			case 11:
				System.out.println("점심을 먹습니다.");
				break;
				
			default:
				System.out.println("탈력근무를 합니다.");
			
				
		}
		
	}

}
