package week3.day3;

public abstract class RemoteDriver implements WebDriver {
	
	@Override
	public void findElements() {
		System.out.println("Abstract FindElements");
	}
	
	@Override
	public void findElement() {
		System.out.println("Abstract FindElements");
	}
	
	@Override
	public void get() {
		System.out.println("Abstract get");		
	}
	
	public static void main(String[] args) {
		
		//abstract class cannot able to create the object for interface.
		//WebDriver object = new WebDriver();
		
					
		
	}
	
	

}
