package week2.day1;

public class LearnMethods {

	private void method1() {
		System.out.println("Im a private method ");
	}
	
	public String method2(String name, int num) {
		System.out.println("Im a public method");
		return name + num;
	}
	
	 void method3() {
		 System.out.println("Im a default method");
	}
	 
	 protected void method4() {
		 System.out.println("Im a protected method");
	}
	
	public static void main(String[] args) {
		
		//ClassName objectName = new ClassName();
		
		LearnMethods DilipKumar = new LearnMethods();
		DilipKumar.method1();
		DilipKumar.method3();
		DilipKumar.method4();
		String method2 = DilipKumar.method2("DilipKumar ", 10);
		System.out.println(method2);
		
		LearnMethods janani = new LearnMethods();
		janani.method1();
		System.out.println(janani.method2("Janani ", 100));
		janani.method3();
		
		String name = "Anbu";
		
	}

}
