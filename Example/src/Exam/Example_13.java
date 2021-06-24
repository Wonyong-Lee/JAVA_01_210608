package Exam;

import java.util.Random;

public class Example_13 {

	/*  
	 String[] strArr= {"CHANGE","LOVE","HOPE","VIEW","APPLE"};
	 WordScramble 클래스를 만들어 위와 같은 배열을 선언하고, 이를 이용하여 WordScrambleMain클래스에서 실행했을 때 아래의 결과가 출력되게 해보자.
	 
	 실행결과:
	 문제: PEALP
	 단어는? : ealpp
	 ealpp 오답..
	 단어는? apple
	 apple 정답!!
	 */
	
	String [] strArr= {"CHANGE","LOVE","HOPE","VIEW","APPLE"};       // 
	String shake = "";
	
	// 정답 반환 메서드
	
	public String getAnswer() {
		
		int idx=new Random().nextInt(strArr.length);
		return strArr[idx];
	}
	
	// 문제를 섞어서 반환하는 method
	public String getScrambledWrd(String str) {
		
		// 정답 단어를 문자 단위 끊어서 저장
		// int 배열생성
		int inArr[]=new int[str.length()];
		
		// 만들어진 inArr배열의 각 방에 겹치지 않도록 처리한 난수를 입력
		for(int i=0; i<inArr.length; ) {
			inArr[i]=new Random().nextInt(str.length());
			boolean check=false;
			
			// 중복성 제거
			for(int j=0; j<i; j++) {
				if(inArr[i] == inArr[j]) {
					check=true;
					break;
				}
			}
			// 중복이 되지 않으면 i증가
			if(!check) {                     // 중복이 없을때 check=false
				
				i++;                         // for 문에서 증가값을 단어가 같지 않을때 증가시킴
			}
		} // outer for
		
		for(int i=0; i<str.length(); i++) {
			// str을 문자단위로 분리
			// 위의 코드에서발생시킨 난수의 순서대로 shake변수에 추가
			shake+=str.charAt(inArr[i]);
		}
		return shake;
	}
	
}
