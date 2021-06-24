package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_01 {

	public static void main(String[] args) {

		/*int ranking;
		char medalColor;
		
		ranking=Integer.parseInt(JOptionPane.showInputDialog("등수를 입력하세요."));
		
		switch(ranking) {
		
			case 1:medalColor='G';
				break;
			
			case 2:medalColor='S';
				break;
			
			case 3:medalColor='B';
				break;
			
			default:                           // default에는 break가 자체적으로 있으므로 적지않아도 된다.
				medalColor='A';
		}
		
		System.out.println(ranking + "등 메달은 : " + medalColor + "입니다.");*/
		
		int ranking;
		char medalColor='A';          // 초기값을 설정하고 시작하면 default를 작성하지 않아도 된다.
		
		ranking=Integer.parseInt(JOptionPane.showInputDialog("등수를 입력하세요."));
		
		switch(ranking) {
		
			case 1:medalColor='G';
				break;
			
			case 2:medalColor='S';
				break;
			
			case 3:medalColor='B';
				break;
			
		}
		
		System.out.println(ranking + "등 메달은 : " + medalColor + "입니다.");
		
		
	}

}
