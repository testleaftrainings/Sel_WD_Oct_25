package week3.day1;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebDriverMethods {

	private static @Nullable String domAttribute;

	public static void main(String[] args) {
	
		//webdriver methods 
		//.getTitle();
		//.getCurrentUrl();
		//.getAttribute();
		//.isEnabled();
		//.isDisabled();
		//.getText();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//printing the Title.
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Check")) {
			System.out.println("It contains the Value - 'CHECK'");
			
		} else {
			System.out.println("It doesn't contains the Value - 'CHECK'");

		}
		
		//CurrentUrl();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//.getText();
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(text);
		
		//getAttribute getDomAttribute
		//.getAttribute(); - depreciated before selenium 4.27.0
		//After selenium 4.27.0 - .getDomAttribute();
		driver.findElement(By.xpath("//input[@id='password']")).getAttribute(text);
		domAttribute = driver.findElement(By.xpath("//input[@id='password']")).getDomAttribute("type");
		
		System.out.println(domAttribute);
		
		//isEnabled - To check is enabled or not
		boolean displayed = driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
	
		System.out.println(displayed);
		
	}

}