package practiceprogram;

public class PrimeNum {

	
	public static void main(String[] args) {

		
		int a=3;     
	    int c=0;
	    
	    for(int b=2;b<=a-1;b++) {
	    	
	    	if(a%2==0) {
	    		
	    		c=c+1;
	    	}
	    }
	
	    if(c==0) {
	    	
	    	System.out.println("given num prime");
	    	
	    }
	    else {
	    	
	    	System.out.println("not prime");
	    }
	}

}
