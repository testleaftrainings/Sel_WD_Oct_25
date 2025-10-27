package week5.day1;

public class LearnStaticKeyWord {
	
	//static - Variable
	static int number = 05;
	
	//Static - Mehtod
	public static void staticMethod() {
		System.out.println("Iam a static Method");
	}
	
	//Static - block
	static {
		System.out.println("Iam a static Block");
	}
	
	public static void main(String[] args) {
		
		LearnStaticKeyWord.staticMethod();
		
		staticMethod();
		
		System.out.println(LearnStaticKeyWord.number);

	}

}
