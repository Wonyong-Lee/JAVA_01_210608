package pk5;

import javax.swing.JOptionPane;

public class IfExample_03 {

	public static void main(String[] args) {

		char grade;
		int Jumsu;
		
		Jumsu = Integer.parseInt(JOptionPane.showInputDialog("�����Է�:"));
		
		if(Jumsu >= 90 ) {
			grade = 'A';
		}else if(Jumsu >= 80) {
			grade = 'B';
		}else if(Jumsu >= 70) {
			grade = 'C';
		}else if(Jumsu >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}

}
