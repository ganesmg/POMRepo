package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewTours {
	
	WebDriver wd;
	
	@FindBy(how=How.NAME,using="userName")
	WebElement user;
	
	@FindBy(how=How.NAME,using="password")
	WebElement pwd;
	
	@FindBy(how=How.NAME,using="login")
	WebElement log;
	
	@FindBy(how=How.XPATH,using="//select[@name='fromPort']")
	WebElement dp_cou;
	
	@FindBy(how=How.XPATH,using="//input[@type='radio']")
	List<WebElement> lw;
	
	public NewTours(WebDriver d)
	{
		this.wd = d;
		
	}
	public void login() 
	{
			
		user.sendKeys("123");
		pwd.sendKeys("123");
		log.click();
	}
	
	public void dropdowns(String cou)
	{		
		Select sl = new Select(dp_cou);
		sl.selectByVisibleText(cou);
		
	}
	
	public void radiobtn()
	
	{
		for(WebElement s:lw)
		{
			String vl = s.getAttribute("value");
			if(vl.equalsIgnoreCase("First"))
			{
				s.click();
				break;
			}
			
		}
	}

}
