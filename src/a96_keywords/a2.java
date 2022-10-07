package a96_keywords;

public class a2 {

	   // use 2: use to call current class method
	
	void m1(int a, String b) {
	
	    System.out.println("m1");
	    
}
	
	void m2(int c) {
		
		this.m1(10, "hello");
		System.out.println("m2");
	}
	
	
	public static void main(String[] args) {

		a2 a2=new a2();
		
		a2.m2(10);
		
	}

}
