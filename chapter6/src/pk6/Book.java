package pk6;

public class Book {
	
	public String bookName; // ������� : Ŭ�����ȿ��� ���� ����
	public String author;   // �������
	
	
	// �޼ҵ峪 �����ڴ� �����̸��� �ߺ��� �� ����.
	// �׷��� �Ű������� ������ Ÿ���� �ٸ��� �� �� �ִ�.
	// ������
	
	//�������� ������=�����ε�
	public Book() {};       // ������ : Ŭ������ �ʱ�ȭ
	
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
