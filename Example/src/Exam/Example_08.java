package Exam;

public class Example_08 {

	public static void main(String[] args) {

		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		int tcount=0;
		
		// outter for		
		int count=0;
		for(int i=0; i<array.length; i++) {           // �� 3�� �ݺ� 0,1,2
			for(int j=0; j<array[i].length; j++) {    // inner for // �� 2�ݺ�,3�ݺ�,5�ݺ�
				sum+=array[i][j];
				count++;
			}
			avg=(double)sum/count;
			System.out.println("sum : " + sum);
			System.out.println("avg : " + avg);
			total += sum;    // �ʱ�ȭ ���� ���� 
			tcount+=count;   // �ʱ�ȭ ���� ����  // 2, 3, 5 = 10
			sum=0;           // sum �ʱ�ȭ (�����Ⱚ ����)
			avg=0;           // avg �ʱ�ȭ (�����Ⱚ ����)
			count=0;         // count �ʱ�ȭ (�����Ⱚ ����)
			System.out.println("============");
		}
		System.out.println("���� ���հ� ���");
		double avgf=(double)total/tcount;
		
		System.out.println("sum : " + total);
		System.out.println("avg : " + avgf);
	}

}
