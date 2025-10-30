package week5.day4;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	//Dynamic Parameterization.
	@DataProvider(name="getValue")
	public String[][] fetchData(){
		String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Anbu";
		data[0][2] = "Raj";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Poornima";
		data[1][2] = "M";
		
		return data;
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
