package week7.day2;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Cannot Divided by 0 ");
	}

}
