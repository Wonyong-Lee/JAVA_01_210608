package pk6;

import java.util.ArrayList;

public class EnhancedForLoop_02 {

	public static void main(String[] args) {

		// ArrayList : �迭�� �����޸𸮸� ����(����� ��ŭ �޸� �Ҵ�)
		ArrayList<Book> library=new ArrayList<Book>(); // <>���̿��� Ŭ������ ������
		
		
		library.add(new Book("�¹���", "���淡"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		for(int i=0; i<library.size();i++) {
			Book book=library.get(i); // library[0]
			book.showBookInfo();      // library[0].showBOokInfo()
		}
		System.out.println();
		System.out.println("--���� for�� ���--");
		
		for(Book book:library) {
			book.showBookInfo();
		}
		
	}

}
