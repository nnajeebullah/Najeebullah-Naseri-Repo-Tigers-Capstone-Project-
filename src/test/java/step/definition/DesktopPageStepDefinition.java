package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject destopPageObject = new DesktopPageObject();
	

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		destopPageObject.clickOnDesktopTab();
		logger.info("Desktop tab were clicked successfully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		destopPageObject.clickOnShowAllDesktopLink();
		logger.info("Show all desktop link were clicked successfully");
	   
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		String expectedText = "Apple Cinema 30\"";
		String actualText = destopPageObject.getAppleCinema30Text();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Apple Cenema 30 text were successfully verified in the desktop page");
		
	  
	}
	
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		destopPageObject.clickOnAddToCartHp();
		logger.info("User successfully clicked on add to the cart option in Hp");
	}

	@When("User select {string}")
	public void user_select(String quantity) {
		destopPageObject.enterHpQuantity("1");
		logger.info("User successfully entered the hp quantity");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		destopPageObject.clickOnAddToCartButton();
		logger.info("User successfully clicked on add to the cart button");
		
	}
	@Then("User should see a message'Success: You have added HP LP3065 to your shopping cart! '")
	public String user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
		String actualHpTex = destopPageObject.getHpSccessMessageFromUI();
		return actualHpTex;
		
	}
	
	
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		destopPageObject.clickOnAddToTheCartCanon();
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		destopPageObject.selectRedColor();
		
	}

	@Then("User should see a message'Success: You have added Canon EOS 5D to your shopping cart!'")
	public String user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		String actualCanonText = destopPageObject.getCanonSccessMessageFromUI();
		return actualCanonText;
	}
	
	
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		destopPageObject.clickOnCanonEos5dCamra();
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		destopPageObject.clickOnReviewsLink();
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		destopPageObject.enterYourName(data.get(0).get("yourname"));
		destopPageObject.enterYourReviewComment(data.get(0).get("yourReview"));
		destopPageObject.clickOnRatingRadioButton();
		logger.info("Review information field were successfuly filled");
	}
	@When("user click on Continue button")
	public void user_click_on_Continue_button() {
		destopPageObject.clickOnReviewContinueButton();
		logger.info("Review continue button were clicked successfully");
		
	}

	@Then("User should see a message with'Thank you for your review. It has been submitted to the webmaster for approval.'")
	public String user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		String canonReviewSuccessMessage = destopPageObject.getCanonReviewSccessMessageFromUI();
		return canonReviewSuccessMessage;
	}



}
