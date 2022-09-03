package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.BackGroundColor;
import util.BrowserFactory;

public class ChangeBackGroundTest {
	
	WebDriver driver;
	
	@Test
	public void changeBakground() throws InterruptedException {
		
		driver = BrowserFactory.init(); 
		
		BackGroundColor color = PageFactory.initElements(driver, BackGroundColor.class);
		
		color.blueSkyButton();
		Thread.sleep(5000);
		color.whiteSkyButton();
		
		//BrowserFactory.tearDown();
	}

}
