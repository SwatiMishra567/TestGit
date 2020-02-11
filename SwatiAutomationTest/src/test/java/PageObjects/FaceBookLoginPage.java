package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	WebDriver ldriver;
	
	public FaceBookLoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="email")
	WebElement usrname;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement LoginBtn;
	
	@FindBy(id="abc")
	WebElement PostBtn;
	
	public void setUsername(String uname) {
		usrname.sendKeys(uname);
		
	}
	
	public void setpwd(String pwd) {
		password.sendKeys(pwd);
		
	}
	
	public void clickLoginBtn() throws InterruptedException {
		LoginBtn.click();
		Thread.sleep(1000);
		
	}
	
}
