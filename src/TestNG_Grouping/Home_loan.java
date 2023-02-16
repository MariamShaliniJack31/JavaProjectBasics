package TestNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Home_loan {
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home Loan");
	}

	@Test(groups = { "SmokeTest" })
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home Loan");
		Reporter.log("Home Loan - Smoke Test");
	}

	@Test
	public void APILoginHomeLoan() {
		System.out.println("API Login Home Loan");
	}
}
