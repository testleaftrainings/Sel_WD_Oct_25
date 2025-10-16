package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Types of Arrays - Static , Dynamic
		char[] values = {'a','e','i','o','u'};
		Set<Character> unique = new TreeSet<Character>();
		//forEach Loop.
		for (Character i : values) {
			unique.add(i);
		}System.out.println(unique);
	}

}
