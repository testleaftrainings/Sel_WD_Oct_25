package week3.day3;

public class Execution extends RemoteWebDriver{
	
	@Override
	public void get() {
		System.out.println("Execution get");
	}
	
	@Override
	public void keys() {
		System.out.println("Execution Keys");
	}

	public static void main(String[] args) {
		
		Execution exe = new Execution();
		exe.click();
		exe.findElements();
		exe.findElement();
		
		
		
	}

}
