package pk13;

public class ComputerTest {

	public static void main(String[] args) {
	
		// c1,c3 error -> �߻�Ŭ�������� ���� -> �����ΰ� ���� -> �������̵带 �ؾ��� -> ����� �ؾ���
		// �߻�Ŭ������ �ν��Ͻ� �� �� ����.(��, ��ü,heap,object)
		//Computer c1 = new Computer(); 
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.typing();
		c4.typing();

	}

}
