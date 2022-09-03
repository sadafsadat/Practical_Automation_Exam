package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackGroundColor {
	
	
	
	
	@FindBy(how = How.CSS, using = "#extra > button:nth-child(12)") WebElement BlueSky;
	@FindBy(how = How.CSS, using = "#extra > button:nth-child(13)") WebElement WhiteSky;

	
	public void blueSkyButton() {
		BlueSky.click();
	}
	
	public void whiteSkyButton() {
		WhiteSky.click();
	}
	
}
