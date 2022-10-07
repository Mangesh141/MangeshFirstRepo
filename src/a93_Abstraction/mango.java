package a93_Abstraction;

abstract class fruit{
	
	  abstract void taste();
	  
	  
	  void m1() {
		  
		  System.out.println("i am m1");
	  }
}
  
class apple extends fruit{
	
	public void taste() {
		
		 System.out.println("taste is sweet");
	}
}
public class mango extends fruit {
	
	 public void taste() {
		 
		 System.out.println("taste is scour");
	 }

	public static void main(String[] args) {

		fruit mango=new mango();
		fruit apple=new apple();
		
		apple.taste();
		mango.taste();
		mango.m1();
		
		}
	}
