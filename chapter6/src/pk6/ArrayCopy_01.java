package pk6;

public class ArrayCopy_01 {

	public static void main(String[] args) {

		int [] array1= {10,20,30,40,50};
		int [] array2= {1,2,3,4,5};
		
		// 배열 복사: System.arraycopy(array1, 첨자(복사가 시작될 첨자), array2, 붙여넣기 시작첨자, 붙여넣기 끝첨자);
		System.arraycopy(array1, 0, array2, 1, 4);      // array1의 0번째부터 array2 두번째부터 4개를 복사
		
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
	}

}
