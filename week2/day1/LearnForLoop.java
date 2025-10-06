package week2.day1;


public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization
		//condition
		//increment or decrement
		
		int number = 10;
		
		//Break & Continue
		for (int i = 0; i < number; i++) {
			if (i==3) {
				System.out.println("The given value is Equal to 3");
				continue;
			}else if (i == 4) {
				System.out.println("The given value is Equal to 4");
				continue;
			} else if(i == 6) {
				break;
			}
		}
		
	}

}
