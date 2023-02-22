package TestNG_IInvokedMethodListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = ListenersTestNG.class)
public class TestNGClass {

	@Test
	public void test1() {
		System.out.println("My First Test");
	}

	@Test
	public void test2() {
		System.out.println("My Second Test");
	}

	@BeforeClass
	public void setUp() {
		System.out.println("Before Class Method");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("After Class Mwethod");
	}
}