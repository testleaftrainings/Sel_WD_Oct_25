package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Open']")).click();
		// syntax - driver.getWindowHandle();

		// print the Current Widow Address.
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		// To print the current window Title
		String title = driver.getTitle();
		System.out.println(title);

		// getWindowHandles();
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);

		/*
		 * // To print the child window Title String title2 = driver.getTitle();
		 * System.out.println(title2);
		 */

		// To transfer the driver focus to child window
		List<String> getWindow = new ArrayList<String>(childWindow);
		driver.switchTo().window(getWindow.get(1));

		// To print the child window Title
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//handling anelement in the child Window.
		driver.findElement(By.id("email")).sendKeys("gowthammanoharan@gmail.com");
		
		driver.close();
		
		//transfer the driverfocus from child window to parent window.
		driver.switchTo().window(getWindow.get(0));
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//To print the address of third window.
		Set<String> thirdWindow = driver.getWindowHandles();
		System.out.println(thirdWindow);
		
		//To print the title of third window.
		String title3 = driver.getTitle();
		System.out.println(title3);
		
	}
}
