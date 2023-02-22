package TestNG_IInvokedMethodListener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ListenersTestNG  implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before Invocation of: " + method.getTestMethod().getMethodName() + "  of Class:  " + testResult.getTestClass());
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invocation of: " + method.getTestMethod().getMethodName() + "  of Class:  " + testResult.getTestClass());
	}
}