package inheritance;

class bird{
	
	void fly() {
		System.out.println("can fly");
		
	}
}
public class parrot extends bird {
	
	void speak() {
		System.out.println("can speak");
		
	}

	public static void main(String[] args) {
	
		
		parrot parrot=new parrot();
		parrot.fly();
		parrot.speak();

	}

}
