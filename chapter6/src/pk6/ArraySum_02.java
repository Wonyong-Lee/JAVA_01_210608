package pk6;

public class ArraySum_02 {

	public static void main(String[] args) {

		int[] score= {83, 90, 87};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("���� : "+ sum);
		
		double avg=(double)sum/score.length;
		System.out.println(String.format("��� : %.2f", avg));
		
		
	}

}
