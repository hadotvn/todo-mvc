package base;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import static common.Browser.captureScreenShot;
import static common.Browser.closeBrowser;


public class TestBase {
    @AfterMethod(alwaysRun = true)
    protected void tearDown(ITestResult testResult){
        String tcName=testResult.getMethod().getMethodName();
        if(!testResult.isSuccess()){
            captureScreenShot(tcName);
        }
    }
}