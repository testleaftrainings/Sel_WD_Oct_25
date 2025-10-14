package week3.day2;

public class AutoMobileParts {

	// horn // break // steering // clutch // accelator

	public void horn() {
		System.out.println("HORN");
	}

	public void steering() {
		System.out.println("steering");
	}
	
	public void clutch() {
		System.out.println("clutch");

	}
	
	public void breaks() {
		System.out.println("Drum break");

	}
	
	public static void main(String[] args) {
		
		//create an object for this class to access the methods we have declared
		AutoMobileParts auto = new AutoMobileParts();
		auto.clutch();
		auto.horn();
		auto.steering();
		
	}

}
