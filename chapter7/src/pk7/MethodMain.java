package pk7;

import javax.swing.JOptionPane;

public class MethodMain {

	public static void main(String[] args) {

		// �����ϰ� ���� Ŭ������ �޸𸮰�ü(mh) ����(�⺻ ������ ���)
		Method mh=new Method();
		
		mh.makeBread();
		System.out.println("----------------------");
		mh.makeBread(5);
		System.out.println("----------------------");
		mh.makeBread(5, "ũ��ġ��");
		
		
		
	}

}
