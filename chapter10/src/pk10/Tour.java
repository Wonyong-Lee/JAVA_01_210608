package pk10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour {

	public static void main(String[] args) {
		
		
		System.out.print("관광객 수 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// 초기화되면서 메모리 확보 및 객체 생성(Guide에서 Guest의 객체 생성)
		Guide guide = new Guide(n);  // **********가장 중요한 부분**********
		
		System.out.println("관광객 등록");
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + ". 이름 : ");
			guide.guest[i].setName(scan.next());
			
			System.out.println((i+1) + ". 성별 : ");
			String gen=scan.next();
			guide.guest[i].setGender(gen);
			System.out.println("----------------------");
		}
		
		outer : while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>>");
			
			int select = scan.nextInt();
			
			switch(select) {
				case 1:
					for(int i=0; i<n; i++) {
						System.out.println((i+1) + ". 이름 : " + guide.guest[i].getName());
						System.out.println((i+1) + ". 성별 : " + guide.guest[i].getGender());
						System.out.println((i+1) + ". 목적지 : " + guide.guest[i].getPoint());
					}break;
				case 2:
					System.out.println("어디로 변경하시겠습니까? ");
					Guide.point=scan.next();
					System.out.println(Guide.point + "로 목적지 변경");
					break;
				case 3:
					System.out.println("종료");
					break outer;
			}		
		}
	}
}




/*
int select;
Guest gst = new Guest();


gst.setName(JOptionPane.showInputDialog("이름"));
gst.setGender(JOptionPane.showInputDialog("성별"));

outer : while(true) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("----------------------------------");
	System.out.println("1. 관광객 정보 | 2. 목적지 변경 | 3. 종료");
	System.out.println("----------------------------------");
	System.out.print("선택 >>");
	
	
	select = Integer.parseInt(scan.nextLine());
	
	switch(select) {
		case 1: 
			System.out.println("관광객 정보를 선택하셨습니다.");
			
			System.out.println("이름 : " + gst.getName() + "\n" + "성별 : " + gst.getGender());
			break;
		case 2:
			System.out.println("목적지 변경을 선택하셨습니다.");
			String str=scan.nextLine();
			System.out.println(str + "로 목적지 변경");
			str = Guide.point;
			
			break;
		case 3:
			System.out.println("종료를 선택하셨습니다.");
			break outer;				
			
	}		
}
*/
