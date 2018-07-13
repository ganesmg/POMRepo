package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	
	static WebDriver wb;
	
	// Page without Factory
	
	public static WebDriver findbrowser(String n, String URL)
	{
		if(n.equalsIgnoreCase("firefox"))
		{
			wb = new FirefoxDriver();
		}
		
		else if(n.equalsIgnoreCase("chrome")) 
		{
			wb = new ChromeDriver();
		}
		wb.get(URL);
		return wb;
	}

}
