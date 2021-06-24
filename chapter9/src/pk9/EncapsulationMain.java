package pk9;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		String str="";
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		Encapsulation ec = new Encapsulation();
		
		Area = ec.Cal_Area(side, height);
		str="사각형의 넓이는 " + Area + "입니다.";
		System.out.println("사각형의 넓이는 " + Area + "입니다.");
		JOptionPane.showMessageDialog(null, str);
		
	}

}
