package pk13;

public class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing");
	}
	
	// Abstract를 구현할게 남아있다면 Abstract를 넣어줘야하고, 완성되었으면 넣지않아도된다, 추상클래스는 다형성, 상속은 유지보수와 중복방지

}
