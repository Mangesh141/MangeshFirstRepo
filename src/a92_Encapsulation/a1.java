package a92_Encapsulation;

public class a1 {

	private int rollNo;    // data hiding
	
	public void setrollno(int rollNo) {
	
		this.rollNo=rollNo;
	}
	
	public int getrollNo() {
		 
		 return rollNo;
	}
		
	public static void main(String[] args) {

		a1 a=new a1();
		a.setrollno(101);
		System.out.println(a.getrollNo());
		
		a.setrollno(102);
		System.out.println(a.getrollNo());
		
	}

}
