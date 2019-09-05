package testNG;

import org.testng.annotations.Test;

public class FirstTestNGClass {

	@Test(priority=1,description="test case started")
	public void loginAppl() {
		System.out.println("started");
	}
	@Test(priority=3,description="test case in end")
	public void loginApplend() {
		System.out.println("end");
	}
	@Test(priority=2,description="test case in mid")
	public void loginApplmid() {
		System.out.println("mid");
	}
}
