package pk6;

public class AgrsTest_01 {

	public static void main(String[] args) {

		// �迭 �ʱ�ȭ���
		// int a[]=new int[5];        // ���ٷ� �ϴ¹�
		// int[] a;
		// a=new int[5];              // ���ٷ� �ϴ¹�
		
				
		int aVal;
		int bVal;
		int cVal;
		int Tot;
		
		
		/*
		 args=new String[2];
		 args[0]="1"; 
		 args[1]="2";
		 */
		
		if(args.length==3) {               // �迭�� ���̰� 3���� ���ٸ�
			// String => Int�� ��ȯ, �ڷ���Ÿ���� �ٸ��ϱ�!
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
			cVal=Integer.parseInt(args[2]);
		}else {
			aVal=0;
			bVal=0;
			cVal=0;
		}
		
		Tot=aVal+bVal+cVal;
		
		System.out.println(Tot);
		
	}

}
