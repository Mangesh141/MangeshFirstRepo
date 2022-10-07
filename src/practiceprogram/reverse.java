package practiceprogram;

public class reverse {

	public static void main(String[] args) {

		   int a;
		   int c;
		   String b="mangesh";
		   String b2="";
		   a=b.length();
		   
		   for(c=a-1; c>=0;c--) {
			   
			   b2=b2+b.charAt(c);
		   }
		
		       System.out.println(b2);
		
		
		
	}

}
