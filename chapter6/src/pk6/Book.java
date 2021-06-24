package pk6;

public class Book {
	
	public String bookName; // 멤버변수 : 클래스안에서 쓰는 변수
	public String author;   // 멤버변수
	
	
	// 메소드나 생성자는 같은이름이 중복될 수 없다.
	// 그러나 매개변수의 객수나 타입이 다르면 올 수 있다.
	// 다형성
	
	//생성자의 다형성=오버로딩
	public Book() {};       // 생성자 : 클래스를 초기화
	
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", "+ author);
	}
	
	
	
}
