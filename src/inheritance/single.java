package inheritance;

class prt1{                             //  m1
	void m1( ) {
		
		System.out.println("i am m1");
	}
}

public class single extends prt1 {                  //m1, m2
	
	void m2() {
		
		System.out.println("i am m2");
	}

	public static void main(String[] args) {

		single s=new single();
		s.m1();
		s.m2();
		
	}

}
