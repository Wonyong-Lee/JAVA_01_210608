package pk8;

public class TakeTrans {

	public static void main(String[] args) {

		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentJames2=new StdInfo("James", 10000);
		StdInfo studentTomas=new StdInfo("Tomas", 3000);
		StdInfo studentTomas2=new StdInfo("Tomas", 7000);
		
		Bus bs = new Bus(6);
				
		studentJames.takeBus(bs);            // 버스 수입증가, 승객증가
		studentJames.showInfo();             // 학생정보 , 돈-
		bs.busInfo();                        // 버스정보 , 돈+
	
		studentJames2.takeBus(bs);
		studentJames2.showInfo();
		bs.busInfo();
		
		
		System.out.println();
		
		
		Subway sb = new Subway("중앙선");
			
		studentTomas.takeSubway(sb);         // 지하철 수입증가, 승객증가
		studentTomas.showInfo();             // 학생정보 , 돈-
		sb.subwayInfo();                     // 지하철정보 , 돈+
		
		studentTomas2.takeSubway(sb);
		studentTomas2.showInfo();
		sb.subwayInfo();
		
	}

}

