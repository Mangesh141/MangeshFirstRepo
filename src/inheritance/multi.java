package inheritance;

class prt2{             //m1
	
	  void m1() {
		  
		   System.out.println("m1");
		   
	  }
}

 class prt3 extends prt2{        //m1,   m2
	
	 void m2() {
		
		 System.out.println("m2");
	 }
 }

public class multi extends prt3 {        // m1,m2,m3

	    void m3() {
	    	
	    	 System.out.println("m3");
	    	 
	    }
	
	public static void main(String[] args) {

		multi m=new multi();
		
		m.m1();
		m.m2();
		m.m3();
		
	}

}
