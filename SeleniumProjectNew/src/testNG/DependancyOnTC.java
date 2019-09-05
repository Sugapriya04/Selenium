package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyOnTC {

		@Test
		public void startApp() {
			System.out.println("Starting app");
			Assert.assertEquals(12, 17);
		}
		
		
		@Test(dependsOnMethods="startApp")
		public void LoginApp() {
			System.out.println("Login App");
			
		}
		
		@Test(dependsOnMethods="startApp")
		public void logoutApp() {
			System.out.println("Logout App");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

