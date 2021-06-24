package pk7;

import javax.swing.JOptionPane;

public class MethodMain {

	public static void main(String[] args) {

		// 참조하고 싶은 클래스의 메모리객체(mh) 생성(기본 생성자 사용)
		Method mh=new Method();
		
		mh.makeBread();
		System.out.println("----------------------");
		mh.makeBread(5);
		System.out.println("----------------------");
		mh.makeBread(5, "크림치즈");
		
		
		
	}

}
