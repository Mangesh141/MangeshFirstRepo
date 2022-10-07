package Polymorphism;

 class overriding1{
	 
	  void m1(int a, String b) {
		  
		  System.out.println("overriding");
		  
	  }
 }
     public class overriding extends overriding1 {
	     
    	 void m1(int a, String b) {
		  
    		 System.out.println("overriding1");
    		 
    	 }
	public static void main(String[] args) {

		  overriding a=new overriding();
		  a.m1(10,"onkar");
	}

}

 