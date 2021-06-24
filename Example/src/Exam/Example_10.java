package Exam;

import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {

		// 키보드에서 숫자와 특수문자를제외한 알파벳을 무작위로 입력받는다 => scan으로 받는다
		// 입력받은 문자열에 소문자 a가 몇 개 있는지를 판별하는 로직을 구현
		
		// 예) 문자입력>asdfasdfasdf
		// 답) a의 갯수>3개
		
		Scanner scan=new Scanner(System.in);
		
		String str;
		// str.charAt(i) == 'a'
		int count=0;
		
		//입력 //for //if
		
		System.out.print("문자를 입력하세요.");
		
		str=scan.next();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 갯수는 " + count);		
		
	}

}
