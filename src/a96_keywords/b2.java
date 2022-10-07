package a96_keywords;

class b5{
	
	void m1() {
		
		System.out.println("m1");
	}
}
public class b2 extends b5 {
	
	// use 2: use to call parent class methods
	
	void m2() {
		
		super.m1();
		System.out.println("m2");
	}

	public static void main(String[] args) {

		b2 b2=new b2();
		
		b2.m2();
	}

}
