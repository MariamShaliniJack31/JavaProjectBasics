package TestNG_Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hr_department {

	@Test
	public void manager() {
		System.out.println("Manager");
	}

	@Test
	public void hr() {
		System.out.println("HR");
	}

	@Test
	public void counsellor() {
		System.out.println("Counsellor");
	}
	
	@BeforeTest // annotated method placed in the beginning.
	public void before_test() {
		System.out.println("It will be executed first");
	}

}