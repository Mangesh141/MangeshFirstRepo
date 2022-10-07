package a98_Finally;

public class a1 {

	public static void main(String[] args) {

		try {
			
			int a=10;
			int b=2;     //0
			int c;
			
			c=a/b;
			
			System.out.println(c);     //ArithmetiException
		}
	    catch(ArithmeticException e) {
	    	
	    	System.out.println(e);
	 }
	 finally {
		 
		 System.out.println("hello");
	 }
	 
	}
	
	

}
