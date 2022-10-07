package Polymorphism;

public class a1 {                       //method overloading : All method in one class
	
	public void m1(int a) {
		
		System.out.println("i am m1");
		
	}
	public void m1(String b) {
		
		System.out.println("i am m1-2");
	}
    
	public void m1() {
		System.out.println("hi");
	}

	public static void main(String[] args) {

		   a1 a=new a1();
		   a.m1(10);
		   a.m1("hello");
		   a.m1();
	}

}
