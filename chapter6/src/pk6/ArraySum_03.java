package pk6;

public class ArraySum_03 {

	public static void main(String[] args) {                 // main의 역할은 실행파일을 만들기위해서
		
		/*
		int[] score= {83, 90, 87};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : "+ sum);	
		*/
		
		int sum2=add(new int[] {83, 90 , 87});
		System.out.println("총합 : "+ sum2);
		System.out.println();
		
	}
	
	
	// 매개변수 : 메소드를 컴파일시 사용되는 변수
	public static int add(int[] score) {
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		return sum;
	}

}
