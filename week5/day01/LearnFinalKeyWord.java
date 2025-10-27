package week5.day1;

public final class LearnFinalKeyWord {

	//final - Variable
	final int number = 18;
	
	//final - method
	public final void finalMethod() {
		System.out.println("Iam a final method");
	}
	
	public static void main(String[] args) {
		LearnFinalKeyWord obj2 = new LearnFinalKeyWord();
		System.out.println(obj2.number);
		obj2.finalMethod();
		//obj2.number = 07; - cannot reassign the values to the final variable.
	}

}
