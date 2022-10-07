package a96_keywords;

public class a3 {

	// use 3: use to call or invoke current class constructor
	
	a3(){
		
		System.out.println("hi");
	}
	
	a3(int a){
		
		this();
		System.out.println("hello");
	}
	public static void main(String[] args) {

		a3 a3=new a3(10);
	}

}
