package pk6;

public class ArrayTest_03 {

	public static void main(String[] args) {
		
		double[] data=new double[5];
		
		data[0]=0.0;
		data[1]=10.0;
		data[2]=20.0;
		data[3]=30.0;
		data[4]=40.0;
		// 초기화 되지않은 나머지는 기본값인 0.0으로 설정되어 있음
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

}
