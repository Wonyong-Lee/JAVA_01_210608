package pk6;

public class CharArray_02 {

	public static void main(String[] args) {

		char[] alphabets = new char[26];               // 1���� �迭, 2���� �迭�� ���� arr[1,2] => 1�� 2��
		char ch='A';  // ASCII=65
		
		/*System.out.println(ch++);
		System.out.println(ch);*/
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i]=ch;
		}
		
		for(int i=0; i<alphabets.length;i++) {
			System.out.println(alphabets[i] + ", "+ (int)(alphabets[i]));
		}
	}

}
