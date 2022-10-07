package practiceprogram;

public class palindrome {

	public static void main(String[] args) {

		int a=121;
		int b=a;    //121
		int rem;
		int rev=0;  //121
		
		while(b!=0) {   //1
			
			rem=b%10;       // 1 // reminder
			rev=rev*10+rem;  //120+1=121
			b=b/10;         // 0 quotient
			
		}
		
		if(a==rev) {
			
			System.out.println("given num is palindrome");
			
		}
		
		else {
			
			System.out.println("not palindrome");
		}
	}

}
