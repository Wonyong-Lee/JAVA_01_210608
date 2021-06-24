package pk9;

public class KoreaExample {

	public static void main(String[] args) {
		
		Korea kr = new Korea("박자바", "123456-1234567");
		
		System.out.println("kr.name : " + kr.name);
		System.out.println("kr.ssn : " + kr.ssn);
		
		Korea kr2 = new Korea("박자바", "123456-1234567");
		
		System.out.println("kr2.name : " + kr2.name);
		System.out.println("kr2.ssn : " + kr2.ssn);
		
		Korea kr3 = new Korea();        // 디폴트 생성자를 이용

		System.out.println("kr3.name : " + kr3.name);
		System.out.println("kr3.ssn : " + kr3.ssn);
		
	}

}
