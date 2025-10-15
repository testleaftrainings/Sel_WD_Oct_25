package week3.day3;

public class RemoteWebDriver implements WebDriver {

	//class - class = 'Extends';
	//Interface - Abstract = 'Implements' (Abstract Class); 
	//class - interface = 'implements' (Concrete Class); 
	
	
	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void got() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keys() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//in concrete class i can create an object and access the methods from the interface.
	RemoteWebDriver obj = new RemoteWebDriver();
	obj.click();
	obj.clicked();
	obj.findElement();
	obj.click();
	
	
	
	
	}
	

}
