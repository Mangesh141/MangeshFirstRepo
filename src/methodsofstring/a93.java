package methodsofstring;

public class a93 {

	public static void main(String[] args) {

		// split
		
		String a="hey@how@are@you";    //hey@ho@     @are@you
		
		String[] b=a.split("@");       //0-hey 1-how 2-are 3-you
		
		String b1=b[0];     // hey
		
		String b2=b[1];     // how
		
		String b3=b[2];     // are
		
		String b4=b[3];     //you
		
		System.out.println(b2);
		
		//OR
		
		System.out.println(b[2]);
				
	}

}
