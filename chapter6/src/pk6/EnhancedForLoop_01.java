package pk6;

public class EnhancedForLoop_01 {

	public static void main(String[] args) {

		String[] strArray= {"Java","Python","Android","C","JavaScript"};
		/*
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray);         // strArray에 해당하는 주소값          
		}
		*/
		
		for(String lang: strArray ) {               // C에서의 포인터개념,
			System.out.println(lang);
		}
	}

}
