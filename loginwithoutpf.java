package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginwithoutpf {
	
	WebDriver dr;
	
	By link = By.linkText("Home");
	By user = By.name("userName");
	By pwd = By.name("password");
	By log = By.name("login");
	
	public loginwithoutpf(WebDriver d)
	{
		this.dr = d;
		
	}
	public void login() 
	
	{
		//dr.get("http://newtours.demoaut.com/mercurywelcome.php");	
		dr.findElement(link).click();
		dr.findElement(user).sendKeys("123");
		dr.findElement(pwd).sendKeys("123");
		dr.findElement(log).click();
	}
	
	public void logout ()
	
	{
		
		
	}

}
