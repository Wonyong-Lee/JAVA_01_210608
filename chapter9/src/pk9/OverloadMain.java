package pk9;

public class OverloadMain {

	public static void main(String[] args) {

		Overload obj = new Overload(20, 170);
		obj.Disp();
		System.out.println("-----------------");
		
		Overload obj2 = new Overload(20, 170, "�̿���");
		obj2.Disp();
		
	}

}
