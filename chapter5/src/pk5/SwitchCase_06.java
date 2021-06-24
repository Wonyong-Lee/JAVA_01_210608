package pk5;

public class SwitchCase_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;         // ½ÃÀÛÀ» 1À¸·Î ÇÏ°Ú´Ù¶ó´Â ÀÇ¹Ì·Î »ý°¢ÇÏ¸éµÊ
		
		switch(num) {
		
			case 1:
				System.out.println("1¹ø È¹µæ");
				break;
				
			case 2:
				System.out.println("2¹ø È¹µæ");
				break;
				
			case 3:
				System.out.println("3¹ø È¹µæ");
				break;
				
			case 4:
				System.out.println("4¹ø È¹µ¶");
				break;
				
			case 5:
				System.out.println("5¹ø È¹µæ");
				break;
				
			default:
				System.out.println("6¹ø È¹µæ");
			
			
		}
		
	}

}
