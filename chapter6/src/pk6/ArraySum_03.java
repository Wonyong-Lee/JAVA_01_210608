package pk6;

public class ArraySum_03 {

	public static void main(String[] args) {                 // main�� ������ ���������� ��������ؼ�
		
		/*
		int[] score= {83, 90, 87};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("���� : "+ sum);	
		*/
		
		int sum2=add(new int[] {83, 90 , 87});
		System.out.println("���� : "+ sum2);
		System.out.println();
		
	}
	
	
	// �Ű����� : �޼ҵ带 �����Ͻ� ���Ǵ� ����
	public static int add(int[] score) {
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		return sum;
	}

}
