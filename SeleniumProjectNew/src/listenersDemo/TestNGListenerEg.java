package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerEg implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcases started and test case details are "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcases success and test case details are "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcases failed and test case details are "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases skipped and test case details are "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
}
