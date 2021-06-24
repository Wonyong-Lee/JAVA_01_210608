package Exam;

import java.util.Scanner;

public class Example_13Main {

	public static void main(String[] args) {

		Example_13 ws=new Example_13();
		
		// 정답 반환 method 호출 (computer)
		String answer=ws.getAnswer();       
		
		// 가쟈온 단어를 섞어서 넣기. 즉, 문제 생성
		String question=ws.getScrambledWrd(answer);
		
		// 섞어진 단어 출력
		System.out.println("문제 : " + question);
		
		while(true) {
			System.out.print("단어는 ? " );
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			
			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str + "정답!!");
				break;
			}else {
				System.out.println(str + "오답!!");
			}
			
		}
	}

}
