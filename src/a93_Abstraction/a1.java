package a93_Abstraction;

interface a2{
	
	void m1();  // by default public abstract
	
	int a=10;   // by default public static final

	 // java  8th
	
	  default void m2() {
		  
		  System.out.println("i am m2");
		  
	  }

      public static void m3() {
    	  
    	  System.out.println("i am m3");
      }

      // java 9th
      
      private void m4() {

}

}

  interface a3{
	  
	  default void m6() {
		 
	  }
	  
   }
  
public class a1 implements a2, a3 {
	
	   public void m1()  {
		   
		   System.out.println("i am m1");
	   }

	public static void main(String[] args) {

		    a1 a=new a1();
		    a.m1();
		    a.m2();
		    a.m6();
		
		
	}

}
