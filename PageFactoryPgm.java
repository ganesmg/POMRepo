package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryPgm {

	WebDriver wd;
	
	public PageFactoryPgm (WebDriver a)
	{
		
		this.wd = a;
	}
	
	@FindBy(how=How.NAME,using="userName")
	WebElement user;
	
	@FindBy(how=How.NAME,using="login")
	WebElement log;
	
	@FindBy(how=How.NAME,using="password")
	WebElement pwd;
	
	public void login()
	
	{
		log.click();
		user.sendKeys("123");
		pwd.sendKeys("123");
		
	}
}
