package practiceprogram;

public class swipe1 {

	public static void main(String[] args) {

		// Swipe number using third variable
		
		int a=10;
		int b=20;
		int c;
		
		System.out.println("Before swipe value of a="+a+"b="+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swipe value of a="+a +"b="+b);
	}

}
