package pk6;

public class ArrayTest_01 {

	public static void main(String[] args) {

		
		/*
		 �迭 ����
		 1�ٷ� ǥ��
		 int number1[]=new int[10];       int[] number1= new int[10]; 
		 
		 2�ٷ� ǥ��
		 int number1[];
		 number1= new int[10];
		 
		 �ʱ�ȭ�ϴ¹�
		 int[] number1=new int[] {1,2,3,4,5,6,7,8,9,10};        => �迭 10�������� �� �ȿ� ���� 1~10���� ä��
		 int[] number1=new int[10] {1,2,3,4,5,6,7,8,9,10};      => �����߻� why? �迭�ȿ� ���� �����ϸ� �ȵ�.
		 int number1[]={1,2,3,4,5,6,7,8,9,10};
		 int[] number1={1,2,3,4,5,6,7,8,9,10};
		 */
		
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int i=0;
		
		int len=number.length;       // length�� ������ �����
		
		for(i=0; i<len;i++) {
			System.out.println(number[i]);
		}
		
	}

}
