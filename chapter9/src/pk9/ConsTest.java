package pk9;

public class ConsTest {

	private int aa;
	private int bb;	
	
	
	// 생성자를 통해서 멤버변수 세팅
	public ConsTest(int aa, int bb) {              // 은닉화된 private를 public으로 생성자만든 후, 출력
		this.aa=aa;
		this.bb=bb;
	}	
	
	public static void main(String[] args) {
	
		ConsTest cons = new ConsTest(10,20);       // 객체 끌어옴
		
		
		System.out.println(cons.aa);
		System.out.println(cons.bb);
	}


	

}
