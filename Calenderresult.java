package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pageobject.calender;

public class Calenderresult {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver x= browser.browser.findbrowser("firefox", "https://www.cleartrip.com/flights");
		calender cl = PageFactory.initElements(x, calender.class);
		cl.calc();
		
		
	}

}
