package week3.day2;

public class Browser {
	
	//method overloading
	//inside the same class same method name with different arguments & increased count of arguments
	
	
	public void browserDetails(String browserName, int browserversion) {
		
		System.out.println(browserName + " " + browserversion);
		
	}
	
	public void browserDetails(String browserName) {
		
		System.out.println("Iam Browser");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
