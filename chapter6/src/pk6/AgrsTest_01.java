package pk6;

public class AgrsTest_01 {

	public static void main(String[] args) {

		// 배열 초기화방법
		// int a[]=new int[5];        // 한줄로 하는법
		// int[] a;
		// a=new int[5];              // 두줄로 하는법
		
				
		int aVal;
		int bVal;
		int cVal;
		int Tot;
		
		
		/*
		 args=new String[2];
		 args[0]="1"; 
		 args[1]="2";
		 */
		
		if(args.length==3) {               // 배열의 길이가 3개랑 같다면
			// String => Int로 변환, 자료형타입이 다르니깐!
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
			cVal=Integer.parseInt(args[2]);
		}else {
			aVal=0;
			bVal=0;
			cVal=0;
		}
		
		Tot=aVal+bVal+cVal;
		
		System.out.println(Tot);
		
	}

}
