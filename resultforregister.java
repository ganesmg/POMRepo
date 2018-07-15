package testsuite;

import org.openqa.selenium.WebDriver;

import Pageobject.register;
import browser.browser;

public class resultforregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver x = browser.findbrowser("firefox", "http://newtours.demoaut.com/mercurywelcome.php");
		
		register  rs = new register(x);
		rs.login();
		rs.afterlogin();
		
		

	}

}
