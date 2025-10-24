package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		
		WebElement expWait = driver.findElement(By.id("j_idt87:j_idt89"));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = w.until(ExpectedConditions.visibilityOf(expWait));
		
		String text = until.getText();
		System.out.println(text);
		
	}

}
