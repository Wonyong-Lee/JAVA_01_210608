package pk8;

public class TakeTrans {

	public static void main(String[] args) {

		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentJames2=new StdInfo("James", 10000);
		StdInfo studentTomas=new StdInfo("Tomas", 3000);
		StdInfo studentTomas2=new StdInfo("Tomas", 7000);
		
		Bus bs = new Bus(6);
				
		studentJames.takeBus(bs);            // ���� ��������, �°�����
		studentJames.showInfo();             // �л����� , ��-
		bs.busInfo();                        // �������� , ��+
	
		studentJames2.takeBus(bs);
		studentJames2.showInfo();
		bs.busInfo();
		
		
		System.out.println();
		
		
		Subway sb = new Subway("�߾Ӽ�");
			
		studentTomas.takeSubway(sb);         // ����ö ��������, �°�����
		studentTomas.showInfo();             // �л����� , ��-
		sb.subwayInfo();                     // ����ö���� , ��+
		
		studentTomas2.takeSubway(sb);
		studentTomas2.showInfo();
		sb.subwayInfo();
		
	}

}

