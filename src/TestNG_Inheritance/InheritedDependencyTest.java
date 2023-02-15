package TestNG_Inheritance;

import org.testng.annotations.Test;

public class InheritedDependencyTest extends SuperClass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
}
