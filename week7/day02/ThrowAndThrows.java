package week7.day2;

import java.util.NoSuchElementException;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException  {

		Thread.sleep(3000);
		throw new NoSuchElementException("Invalid UserName");
		
	}

}
