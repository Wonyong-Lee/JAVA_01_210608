package pk5;

import javax.swing.JOptionPane;

public class IfExample_02 {

	public static void main(String[] args) {

		// 10의 배수 판별법
		int dat;
		dat=Integer.parseInt(JOptionPane.showInputDialog("값 입력:"));
		
		if(dat % 10 == 0) {
			System.out.println(dat + "은(는) 10의 배수 입니다.");
		}else {
			System.out.println(dat + "은(는) 10의 배수가 아닙니다.");
		}
		
		
		//int dat2;
		//dtat2 = Integer.parseInt(JoptionPane.showInputDialog("사원번호입력:"));
		//System.out.println(dat2);
	}

}
