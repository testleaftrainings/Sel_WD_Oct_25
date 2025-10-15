package week3.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		//syntax Array literals :
		int[] number = {98,96,74,89,88};
		
		//to find the length of Array
		int arrlength = number.length;
		System.out.println(arrlength);
		
		//to find the last index value
		System.out.println("LAST ARRAY VALUE" + " "+ number[arrlength-1]);
		
		//find the first index value
		System.out.println("FIRST INDEX VALUR OF ARRAY" + " "+ number[0]);
		
		//To sort the array value.
		Arrays.sort(number);
		System.out.println("After sorting the Arrays value" + " "+ number[0]);
		
		//to iterate the Arrays value - ForLoop.
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			
		}
	}

}
