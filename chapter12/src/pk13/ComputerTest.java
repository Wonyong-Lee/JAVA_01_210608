package pk13;

public class ComputerTest {

	public static void main(String[] args) {
	
		// c1,c3 error -> 추상클래스에만 오류 -> 구현부가 없음 -> 오버라이드를 해야함 -> 상속을 해야함
		// 추상클래스는 인스턴스 할 수 없다.(즉, 객체,heap,object)
		//Computer c1 = new Computer(); 
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.typing();
		c4.typing();

	}

}
