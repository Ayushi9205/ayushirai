package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reports.ExtentManager;
import reports.ExtentTestManager;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	    ExtentTestManager.setTest(ExtentManager.getReport().createTest(result.getMethod().getMethodName()));
	  }
	
	@Override
	public void onTestSuccess(ITestResult result) {
	   ExtentTestManager.getTest().pass("Test Passed");
	  }
	
	@Override
	  public void onTestFailure(ITestResult result) {
		    ExtentTestManager.getTest().fail(result.getThrowable());
		  }
	 
	@Override
	  public void onFinish(ITestContext context) {
		   ExtentManager.getReport().flush();
		  }
}
