package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	
	HomePageObject homePageObject = new HomePageObject();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrancyDropdown();
		logger.info("Currancy dropdown was clicked successfully");
	 
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.clickOnEuroCurrancy();
		logger.info("Euro currancy was selected successfully");
	    
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObject.getTextcurrancyValueChange();
		logger.info("Currancy value were changed successfully");
		Utils.takeScreenshotForStep();
	  
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.clickOnshopingCartButton();
		logger.info("Shoping card button were clicked successfully");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expectedCartText = "Your shopping cart is empty!";
		String actualCartText = homePageObject.getTextShopingCartEmpty();
		Assert.assertEquals(expectedCartText, actualCartText);
		logger.info("Your shoping cart is empty! has successfully displayed");
		Utils.takeScreenshotForStep();
	   
	}

}
