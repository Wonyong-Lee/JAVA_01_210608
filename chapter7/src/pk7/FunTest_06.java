package pk7;

import javax.swing.JOptionPane;

public class FunTest_06 {

	public static void Disp(String A[]) {  // A[] {"ab111","cd222","ef333","gh444","ij555"}; 
		
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+ "\n";
		}
		System.out.println(res);
			
		JOptionPane.showMessageDialog(null, "�迭�� ���� �� \n" + res);
		
	}
	
	public static void main(String[] args) {

		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		Disp(str);
		
	} // main

} // class
