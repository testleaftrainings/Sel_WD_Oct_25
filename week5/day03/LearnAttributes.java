package week5.day3;

import org.testng.annotations.Test;

public class LearnAttributes {

	
	@Test(priority=1)
	public void EditLead() {
		System.out.println("Iam EditLead");
	}
	
	@Test(priority = -3)
	public void CreateLead() {
		System.out.println("Iam CreateLead");
	}
	

	@Test (priority = 2)
	public void DeleteLead() {
		System.out.println("Iam DeleteLead");

	}
	
	@Test (enabled = true)
	public void DuplicateLead() {
		System.out.println("Iam DuplicateLead");

	}
	
	@Test (enabled = false, priority = 4)
	public void MergeLead() {
		System.out.println("Iam MergeLead");
	}

}
