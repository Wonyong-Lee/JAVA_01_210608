package Exam;

public class Example_12 {

	public static void main(String[] args) {

		/*
		 2���� �迭�� ����� �Ʒ��� ���� ������ ä���ִ´�.
		 int arr[][] = {{1,2,3,4,5,}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
		 2���� �迭 arr�� ��� ��� ���� �� �հ� ����� ���ϴ� ���α׷��� �ϼ�����.
		 */
		
		int arr[][] = {{1,2,3,4,5,}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
		
		int total=0;
		float avg=0;
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total+=arr[i][j];
				count++;
			}
		}
		avg=(float)total/count;
		System.out.println("���� = " + total);
		System.out.println("��� = " + avg);
				
	}

}
