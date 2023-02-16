package TestNG_Parameters;

import org.testng.annotations.DataProvider;

public class C5_DP
{
    @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
        return new Object[][] {{"Value Passed"}, {"ValuePassed2"}};
     } 
}