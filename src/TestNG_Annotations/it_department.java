package TestNG_Annotations;		//https://www.javatpoint.com/testng-afterclass-annotation

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class it_department {

	@Test
	public void software_developers() {
		System.out.println("Software Developers");
	}
	
	@AfterTest // annotated method placed in the beginning.
	public void before_test() {
		System.out.println("It will be executed last as it is in First Class");
	}
	
	@Test
	public void software_testers() {
		System.out.println("Software Testers");
	}

	@Test
	public void qa_analyst() {
		System.out.println("QA Analyst");
	}
}