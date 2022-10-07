package constructor;

public class a3 {
       
	String name;
	int marks;
	
	a3(String name, int marks) {
		
		this.name=name;
		this.marks=marks;
		
		System.out.println(this.name+": "+this.marks);
		
	}
	
      public static void main(String[] args) {

    	  a3 a=new a3("tom",97);
    	  a3 a1=new a3("jerry",95);
    	  a3 a2=new a3("bob",97);
    	  a3 a3=new a3("jem",92);
    	  a3 a4=new a3("sandy",90);
    	  
	}

}
