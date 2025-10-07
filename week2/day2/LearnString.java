package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		
		//String Literal
		String name ="Meenakshi";
		
		//String Instantiation
		String varName = new String("MeenaKshi");
		
		//.length(); - to find the number of character in the value.
		System.out.println("No.Of characters in name - " + name.length());
		
		//.equals(); - to compare two String values.
		if (name.equals(varName)) {
			System.out.println("Both the values are equal");
		}else {
			System.out.println("Both the values are not equal");
		}
		
		//.equlaIgnoreCase(); - compares the String value, not the case sensitive.
		String refName = "janani";
		String newRefName = "JaNaNi";
		
		if (refName.equalsIgnoreCase(newRefName)) {
			System.out.println("Ref value is Equal");
		} else {
			System.out.println("Ref value is not Equal");
		}
		
		//.contains(); - it will check the char is present or not.(Case sensitive)
		//return type is boolean //local variable ctrl+2 - l
		boolean contains = refName.contains("j");
		System.out.println(contains);
		
		//.toCharArray(); - to convert the string to character array.
		String data = "Gowtham";
		char[] charArray = data.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.println(charArray[i]);
		}
		
		//.charAt(); - index value starts from '0'.
			System.out.println("index value of 3 is " +data.charAt(3));
		
		
	}

}
