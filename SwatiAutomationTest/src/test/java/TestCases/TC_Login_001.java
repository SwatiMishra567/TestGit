package TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FaceBookLoginPage;
import PageObjects.HomePage;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseurl);
		
		FaceBookLoginPage obj1= new FaceBookLoginPage(driver);
		HomePage obj2=new HomePage(driver);
		obj1.setUsername(username);
		obj1.setpwd(password);
		obj1.clickLoginBtn();
		
		
		if(driver.getTitle()!=null) {
			
			obj2.postStatus("Hello World");
			Alert alert=driver.switchTo().alert();
				alert.accept();
				obj2.postStatus("Hello World");
			}
			
			else 
			{
				Assert.assertTrue(false);		}
		
		
	}
	

	
	
	
	
	
	
}
