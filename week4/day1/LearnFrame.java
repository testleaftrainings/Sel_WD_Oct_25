package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		//Transfers the driver focus back to the main DOM.
		driver.switchTo().defaultContent();
		
		//Handling the nested frame - Parent Frame
		driver.switchTo().frame(2);
		
		//switching to child frame(Nested Frame) - Child Frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		//Switch to parent frame
		driver.switchTo().parentFrame();
		
		//child frame - parent frame - DOM
		driver.switchTo().defaultContent();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
