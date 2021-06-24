package pk6;

public class ArrayTest_04 {

	public static void main(String[] args) {

		double[] data=new double[5];
		int size=0;
		
		
		// 배열5까지 다 채우지 않고 사용하려고할때는 비어있는 타입을 추가하여 그 타입만큼만 추가시켜서 출력하면 됨
		data[0]=0.0;
		size++;
		data[1]=10.0;
		size++;		
		data[2]=20.0;
		size++;
		
		for(int i=0; i<size;i++) {
			System.out.println(data[i]);
		}
	}

}
