package a96_keywords;

class b4{
	
	int a;
}



public class b1 extends b4{

	// use 1: use to refer parent class instance variable
	
	void m1(int a) {
		
		super.a=a;
	}
	
	public static void main(String[] args) {

		b1 b=new b1();
		
		b.m1(10);
		
		System.out.println(b.a);
		
	}

}
