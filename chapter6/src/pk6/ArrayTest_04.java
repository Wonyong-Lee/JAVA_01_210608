package pk6;

public class ArrayTest_04 {

	public static void main(String[] args) {

		double[] data=new double[5];
		int size=0;
		
		
		// �迭5���� �� ä���� �ʰ� ����Ϸ����Ҷ��� ����ִ� Ÿ���� �߰��Ͽ� �� Ÿ�Ը�ŭ�� �߰����Ѽ� ����ϸ� ��
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
