package inheritance;

class prt4{
	
	void m1() {
		System.out.println("m1");
}

}
class hera1 extends prt4{
	
	void m2() {
		System.out.println("m2");
		
	}
}
public class hera extends prt4 {
	
	  void m3() {
		  System.out.println("m3");
}

		public static void main(String[] args) {

			hera1 h1=new hera1();
			hera h=new hera();
			
			h1.m1();
			h1.m2();
			
			h.m1();
			h.m3();
			
		}
		
}



