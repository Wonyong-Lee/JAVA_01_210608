package pk6;

public class EnhancedForLoop_01 {

	public static void main(String[] args) {

		String[] strArray= {"Java","Python","Android","C","JavaScript"};
		/*
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray);         // strArray�� �ش��ϴ� �ּҰ�          
		}
		*/
		
		for(String lang: strArray ) {               // C������ �����Ͱ���,
			System.out.println(lang);
		}
	}

}
