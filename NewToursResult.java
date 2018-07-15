package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pageobject.NewTours;

public class NewToursResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver x = browser.browser.findbrowser("firefox", "http://newtours.demoaut.com/");
		NewTours nt = PageFactory.initElements(x, NewTours.class);
		nt.login();
		nt.dropdowns("London");
		nt.radiobtn();

	}

}
