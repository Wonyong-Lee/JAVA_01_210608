package pk5;

public class IfExample_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;
		// double num1=(Math.radom()*6); // ½Ç¼öÀÎ ¼ıÀÚ°¡ ·£´ıÀ¸·Î ÃßÃâ
		
		if(num==1) {
			System.out.println(num + "1¹ø È¹µ¶");
		}else if(num==2) {
			System.out.println(num + "2¹ø È¹µ¶");
		}else if(num==3) {
			System.out.println(num + "3¹ø È¹µ¶");
		}else if(num==4) {
			System.out.println(num + "4¹ø È¹µ¶");
		}else if(num==5){
			System.out.println(num + "5¹ø È¹µ¶");
		}else {
			System.out.println(num + "6¹ø È¹µ¶");
		}
	}

}
