package TestNG_Parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/////Note: Unlike parameters in TestNG, the dataproviders can be run directly through the test case file.
public class C3_TestNGDataProvider
{
    @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
	 return new Object[][] {{"First-Value"}, {"Second-Value"}, {"Third-Value"}};
     }
	
    @Test (dataProvider = "data-provider")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
}