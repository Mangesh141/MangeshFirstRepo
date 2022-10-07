package practiceprogram;

public class swipe2 {

	public static void main(String[] args) {

		//Swipe number without using third variable
		
		int a=10;
		int b=20;
		
		System.out.println("Before swipe value of a="+a +"b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swipe value of a="+a +"b="+b);
	}

}
