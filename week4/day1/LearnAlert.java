package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		//Model Alert ; Non Model Alert.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//SimpleAlert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		//org.openqa.selenium.NoAlertPresentException
		//To fetch the text
		String text1 = alert1.getText();
		System.out.println(text1);
		alert1.accept();
		
		//Confirmation Alert - (//span[text()='Show'])[2]
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		//org.openqa.selenium.UnhandledAlertException
		
		String text2 = alert1.getText();
		System.out.println(text2);
		alert2.accept();
		
		//Non-Model alert - sweet Alert
		//(//span[text()='Show'])[3]
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
