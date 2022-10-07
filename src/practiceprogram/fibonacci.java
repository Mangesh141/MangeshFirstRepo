package practiceprogram;

public class fibonacci {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c;
		
		System.out.println(a +" "+ b);
		
		for(int m=1; m<=5; m++) {
		
		c=a+b;
		
		System.out.println(" "+ c);
		
		a=b;
		b=c;
		
		
	}

}

}