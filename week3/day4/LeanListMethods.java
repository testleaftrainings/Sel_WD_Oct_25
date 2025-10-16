package week3.day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class LeanListMethods {
	public static void main(String[] args) {
		List<Integer> value = new ArrayList<Integer>();
		//index starts with 0.
		value.add(100);
		value.add(10);
		value.add(101);
		value.add(12);
		
		System.out.println(value);
		//value.add();
		value.add(22);
		System.out.println(value);

		// .get();
		System.out.println("Get the value present in index 2 :" + " " + value.get(2));

		// Add All values to a list
		value.addAll(value);
		System.out.println(value);
		
		//remove value based on index
		System.out.println("Removed the value of index 3 " + " "+ value.remove(3));
		System.out.println(value);
		
		//sort the list value.
		Collections.sort(value);
		System.out.println(value);
		
		//.clear();
		value.clear();
		System.out.println(value);
	}
}
