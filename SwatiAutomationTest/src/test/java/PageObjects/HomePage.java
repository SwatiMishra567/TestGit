package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


WebDriver ldriver;
	
	public HomePage(WebDriver cdriver) {
		ldriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Write something here...')]")
	WebElement postStatusmsg;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/section[2]/form/div/div[1]/h3")
	WebElement postBtn;
	

	public void postStatus(String msg) {
		postStatusmsg.sendKeys(msg);
		postBtn.click();
		
	}

}
