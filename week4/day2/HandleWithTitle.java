package week4.day2;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		//parentWindow Button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		String childWindow = "Dashboard";

		for (String st : allWindows) {
			driver.switchTo().window(st);
			if (driver.getTitle().contains(childWindow)) {
				driver.findElement(By.id("email")).sendKeys("gowthammanoharan@gmail.com");
			}
		}

	}

}
