package pk6;

public class ArrayTest_03 {

	public static void main(String[] args) {
		
		double[] data=new double[5];
		
		data[0]=0.0;
		data[1]=10.0;
		data[2]=20.0;
		data[3]=30.0;
		data[4]=40.0;
		// �ʱ�ȭ �������� �������� �⺻���� 0.0���� �����Ǿ� ����
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

}
