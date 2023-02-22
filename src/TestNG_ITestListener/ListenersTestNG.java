package TestNG_ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {
	
	//onStart: This method invokes when the test class is instantiated and before executing any test method.
	public void onStart(ITestContext context) {	
		System.out.println("onStart method started\n");
	}

	//onFinish: This method invokes when all the test methods have run, and calling of all of their configuration methods happens.
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started\n");
	}
	
	//onTestStart:  This method invokes every time a test method is called and executed.
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart Method : " +result.getName());
	}
		
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method : " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method : " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method : " +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage : " +result.getName());
	}
}