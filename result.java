package testsuite;

import org.openqa.selenium.WebDriver;

import Pageobject.loginwithoutpf;
import browser.Choosebrowser;

public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver x = Choosebrowser.selectbrowser("firefox","http://newtours.demoaut.com/mercurywelcome.php");
		
		loginwithoutpf  lp = new loginwithoutpf(x);
		lp.login();
		lp.logout();
		
		

	}

}
