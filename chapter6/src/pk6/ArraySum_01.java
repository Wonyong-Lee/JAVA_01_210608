package pk6;

public class ArraySum_01 {

	public static void main(String[] args) {

		int[] score= {83, 90, 87};
		
		System.out.println("scre[0]: " + score[0]);
		System.out.println("scre[1]: " + score[1]);
		System.out.println("scre[2]: " + score[2]);
		
		int sum=0;
		
		for(int i=0; i<3; i++) {
			sum+=score[i];
		}
		System.out.println("���� : " + sum);
		double avg=(double)sum/3;
		// String.format : ���ڿ� ����
		System.out.println(String.format("��� : %.2f", avg));
		// �ݿø�
		System.out.println("��� : " + Math.round(avg));
	}

}
