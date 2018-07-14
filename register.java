package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class register {
	
	WebDriver wr;
	
	By log = By.name("login");
	By user = By.name("userName");
	By pwd = By.name("password");
	
	public register(WebDriver d) {
		
		this.wr =d;
	}
	
	public void login()
	{
		
		wr.findElement(user).sendKeys("123");
		wr.findElement(pwd).sendKeys("123");
		wr.findElement(log).click();
	}
	
	public void afterlogin() 
	{
		WebElement we = wr.findElement(By.xpath("//select[@name ='passCount']"));
		Select st = new Select(we);
		st.selectByValue("3");
		
		WebElement ww = wr.findElement(By.xpath("//select[@name='fromPort']"));
		Select st1 = new Select(ww);
		st1.selectByVisibleText("London");
		
		List<WebElement> li = wr.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement s:li) 
		{
		String vl = s.getAttribute("value");
		
		if(vl.equalsIgnoreCase("Business")) 
		{
			s.click();
			break;
		}
		
		}
		
		WebElement wt = wr.findElement(By.xpath("//select[@name='toPort']"));
		Select st2 = new Select(wt);
		st2.selectByVisibleText("San Francisco");
				
		
	}

}
