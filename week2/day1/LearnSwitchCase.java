package week2.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName = "Edge";
		
		switch (browserName) {
		case "chrome":
			System.out.println("The current script is executing in Chrome");
			break;
		case "FireFox":
			System.out.println("The current script is executing in FireFox");
			break;
		case "Edge":
			System.out.println("The current script is executing in Edge");
			break;
		default:
			System.out.println("Please enter the valid browser name");
			break;
		}
	}
}
