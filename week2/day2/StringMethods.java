package week2.day2;

public class StringMethods {

	public static void main(String[] args) {

		// .split(); - to split the given string using delimiter.
		String name = "Today is Tuesday";
		String[] splitName = name.split(" ");
		System.out.println(splitName);
		// using for loop
		for (int i = 0; i < splitName.length; i++) {
			System.out.println(splitName[i]);
		}

		// .replace(); - to replace a character in string with another character.
		String replaceValue = "Good afternoon";
		String replaced = replaceValue.replace('o', '0');
		System.out.println(replaced);

		// .replaceAll(); - to replace each character of the String.
		// [a-z], [A-Z], [a-z A-Z], [0-9], [<@$#*>], [^0-9]
		String repAll = "Welcome to TestLeaf @ 2025";
		String replacedAll = repAll.replaceAll("[^0-9]", "A");
		System.out.println(replacedAll);

		// .toLowerCase(); - to convert the entire string value to lower case.
		String lowCase = "IAM UPPERCASE";
		System.out.println(lowCase.toLowerCase());

		// .toUpperCase(); - to convert the entire string value to upper case.
		String upCase = "iam lowercase";
		System.out.println(upCase.toUpperCase());

		// .parseInt(); - It converts the String into an integer (a primitive Integer)
		String price = "2500";
		int int1 = Integer.parseInt(price);
		System.out.println(int1);

	}
}
