package pk6;

import javax.swing.JOptionPane;

public class CharArray_01 {

	public static void main(String[] args) {

		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		
		
		int i=0;
		
		for(i=0;i<str.length;i++) {
			res=res+str[i]+"\n";            // res=res+str[i]+"\n";
		}
		
		System.out.println(res);
		
		JOptionPane.showMessageDialog(null, "�迭������ ��\n" + res);           // �޼����� ������, showinput�� �Է�!
	}

}
