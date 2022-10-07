package a96_keywords;

public class a1 {

	// use 1: use to refer current class instance variable
	
	int a;
	
	void m1(int a) {
		
		this.a=a;
		
	}
	
	
	
	public static void main(String[] args) {

		a1 a=new a1();
		
		a.m1(100);
		
	}

}
