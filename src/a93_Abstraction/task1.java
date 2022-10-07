package a93_Abstraction;

abstract class bankname{
	
abstract void ICICI();

abstract void BOB();

abstract void SBI();

abstract void AXIS();

abstract void IDBI();

}

public class task1 {

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
		
		System.out.println("IDBI Bank For 1 year ROI is"+5.35+"%");
		
	}
	
	public static void main(String[] args) {

		  task1 k=new task1();
		  k.ICICI();
		  k.BOB();
		  k.SBI();
		  k.AXIS();
		  k.IDBI();
		  
	}

}
