package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");

		// find the first data in the webTable.
		String firstElement = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println(firstElement);

		// find the 4th row 3th column value -
		String randomElement = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[4]/td[3]"))
				.getText();
		System.out.println(randomElement);

		// print 3rd row values -
		// //div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]
		String thirdRow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]"))
				.getText();
		System.out.println(thirdRow);

		// print 2rd row values -
		// //div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]
		String secondrow = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td")).getText();
		System.out.println(secondrow);

		List<WebElement> rowElements = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		List<WebElement> colElements = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));

		for (int i = 1; i <= rowElements.size(); i++) {
			System.out.print("|");

			for (int j = 1; j <= colElements.size(); j++) {

				String data = driver
						.findElement(By.xpath(
								"//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();

				System.out.print(data + "|");

			}

			System.out.println();

		}

	}

}
