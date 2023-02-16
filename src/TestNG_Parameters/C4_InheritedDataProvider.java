package TestNG_Parameters;

import org.testng.annotations.Test;

public class C4_InheritedDataProvider {
    
	@Test (dataProvider = "data-provider", dataProviderClass = C5_DP.class)
    public void myTest (String val) {
		System.out.println("Current Status : " + val);
    }
}