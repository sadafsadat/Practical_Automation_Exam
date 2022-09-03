package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.BackGroundColor;
import util.BrowserFactory;

public class StepDefinition extends BackGroundColor {
	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() {
		BrowserFactory.init();
	}

	@When("I click on the button")
	public void i_click_on_the_button() {
		blueSkyButton();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
	   
	}

//	@Given("Set SkyWhite Background button exists")
//	public void given_Set_SkyWhite_Background_button() {
//	    
//	}
//	@When("I click on the button")
//	public void i_click_on_the_button() {
//		whiteSkyButton();
//	}
//
//	@Then("the background color will change to white")
//	public void the_background_color_will_change_to_white() {
//		
//	}

}
