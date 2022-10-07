package a93_Abstraction;

interface a42{
	
	abstract void ICICI();
	
}

interface a43{
	
	abstract void BOB();
	
}

interface a13{
	
	abstract void SBI();
	
}

interface a4{
	
	abstract void AXIS();
	
}

interface a5{
	
	abstract void IDBI();
	
}

 public class a41 implements a42,a43,a13,a4,a5{
	 
	 public void ICICI() {
		
		System.out.println("ICICI Bank For 1 year ROI is"+5.35+"%");
	}
	
	 public void BOB() {
		 
		  System.out.println("BOB Bank For 1 year ROI is"+5.80+"%");
		  
	 }
	 
	 public void SBI() {
		 
		 System.out.println("SBI Bank For 1 year ROI is"+5.30+"%");
		 
		  }
	 
	  public void AXIS() {
		  
		  System.out.println("AXIS Bank For 1 year ROI is"+5.45+"%");
	  }
	
	   public void IDBI() {
		   System.out.println("IDBI Bank For 1 yeat ROI is"+5.35+"%");
		   
	   }
	   
	   public static void main(String[] args) {
		   
		   a41 k1=new a41();
		   k1.ICICI();
		   k1.BOB();
		   k1.SBI();
		   k1.AXIS();
		   k1.IDBI();
		   

	}

}

