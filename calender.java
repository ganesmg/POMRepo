package Pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class calender {
	
	WebDriver cal;
	
	public calender (WebDriver d)
	{
		this.cal=d;
	}
	
	
		@FindBy (how=How.ID,using="//*[@id='DepartDate']")
		WebElement dp;
		
					
		@FindBy (how=How.XPATH,using="//div[@class='monthBlock first']/table/tbody/tr/td/a")
		List<WebElement> dat;
	
		
	public void calc() throws InterruptedException
	
	{
		Thread.sleep(2000);
		dp.click();
		
		for(WebElement s:dat)
		{
			String vl = s.getText();
			System.out.println(vl);
			if(vl.equalsIgnoreCase("29"))
			{
				s.click();
				break;
			}
		}
	}

}
