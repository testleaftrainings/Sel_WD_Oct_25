package week7.day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {

	public static void main(String[] args) {

		//Step1
		ExtentHtmlReporter wb= new ExtentHtmlReporter("./report/loginReport.html");
		
		//Step2
		ExtentReports repo=new ExtentReports();
		
		//Step3
		repo.attachReporter(wb);
		
		//Step4
		ExtentTest test = repo.createTest("LoginPage","LeafTaps");
		test.pass("Enter the valid userName");
		test.fail("Enter the Invalid password");
		test.fail("Login failed");
		repo.flush();
	}

}
