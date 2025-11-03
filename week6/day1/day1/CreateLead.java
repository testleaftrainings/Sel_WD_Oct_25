package week6.day1;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.CreateLeadIntegration;

public class CreateLead extends BaseClass {

	//Dynamic Parameterization.
	//Dynamic Parameterization.
		@DataProvider(name="getValue")
		public String[][] data() throws IOException{
			return CreateLeadIntegration.fetchData();
			
			
		}

	@Test(dataProvider= "getValue")
	public void createLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}
}
