package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {
		
		//to handle the chrome notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		//to close the browser/window
		driver.close();
		
		
	}

}
