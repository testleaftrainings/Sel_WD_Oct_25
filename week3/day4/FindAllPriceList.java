package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPriceList {

	public static void main(String[] args) {
		
		//ctrl+shift+O
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
		
		//System.out.println(elements);
		//size - products
		int size = elements.size();
		System.out.println(size);
		
		//create a empty list
		List<Integer> price = new ArrayList<Integer>();
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
			
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
				
				int int1 = Integer.parseInt(replaceAll);
				
				price.add(int1);
			}
		}Collections.sort(price);
		System.out.println(price);
		
		Set<Integer> unique = new TreeSet<Integer>(price);
		System.out.println(unique);
		
	}

}
