package pk6;

public class ArrayTest_01 {

	public static void main(String[] args) {

		
		/*
		 배열 선언
		 1줄로 표현
		 int number1[]=new int[10];       int[] number1= new int[10]; 
		 
		 2줄로 표현
		 int number1[];
		 number1= new int[10];
		 
		 초기화하는법
		 int[] number1=new int[] {1,2,3,4,5,6,7,8,9,10};        => 배열 10개설정후 그 안에 값을 1~10으로 채움
		 int[] number1=new int[10] {1,2,3,4,5,6,7,8,9,10};      => 에러발생 why? 배열안에 값을 지정하면 안됨.
		 int number1[]={1,2,3,4,5,6,7,8,9,10};
		 int[] number1={1,2,3,4,5,6,7,8,9,10};
		 */
		
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int i=0;
		
		int len=number.length;       // length는 갯수로 보면됨
		
		for(i=0; i<len;i++) {
			System.out.println(number[i]);
		}
		
	}

}
