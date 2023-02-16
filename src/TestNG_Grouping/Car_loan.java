package TestNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car_loan {
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("Web Login Car Loan");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}

	@Test(groups = { "SmokeTest" })
	public void APILoginCarLoan() {
		System.out.println("API Login Car Loan");
		Reporter.log("Car Loan - Smoke Test");
	}
}
