package pk9;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		String str="";
		
		side=Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		Encapsulation ec = new Encapsulation();
		
		Area = ec.Cal_Area(side, height);
		str="�簢���� ���̴� " + Area + "�Դϴ�.";
		System.out.println("�簢���� ���̴� " + Area + "�Դϴ�.");
		JOptionPane.showMessageDialog(null, str);
		
	}

}
