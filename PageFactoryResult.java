package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pageobject.PageFactoryPgm;
import browser.PageFactory_eg;
import browser.browser;

public class PageFactoryResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver n = PageFactory_eg.select("firefox", "http://newtours.demoaut.com/mercurywelcome.php");
		PageFactoryPgm tc = PageFactory.initElements(n, PageFactoryPgm.class);
		tc.login();
				
   }

}
