package pk6;

import java.util.ArrayList;

public class EnhancedForLoop_02 {

	public static void main(String[] args) {

		// ArrayList : 배열에 동적메모리를 지원(사용한 만큼 메모리 할당)
		ArrayList<Book> library=new ArrayList<Book>(); // <>사이에는 클래스가 들어가야함
		
		
		library.add(new Book("태백산맥", "조경래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		for(int i=0; i<library.size();i++) {
			Book book=library.get(i); // library[0]
			book.showBookInfo();      // library[0].showBOokInfo()
		}
		System.out.println();
		System.out.println("--향상된 for문 사용--");
		
		for(Book book:library) {
			book.showBookInfo();
		}
		
	}

}
