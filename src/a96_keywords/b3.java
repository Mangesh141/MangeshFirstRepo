package a96_keywords;

class b6{
	
	b6(int a){
		
		System.out.println("b6");
		
	}
}

public class b3 extends b6 {
	
	// use 3: use to call or invoke parent class constructor
	
	b3(){
		 
		super(10);
		System.out.println("b3");
	}

	public static void main(String[] args) {

		b3 b3=new b3();
	}

}
