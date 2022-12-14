package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopNoteBooksPageObject = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksPageObject.clickOnLaptopAndNotebookTab();
		logger.info("Laptop and Notebook tab was clicked successfully"); 
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksPageObject.clickOnShowAllLaptopAndNoteBookOption();
		logger.info("Show all laptop and notebook option was clicked successfully");  
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNoteBooksPageObject.clickOnMacBookItem();
		logger.info("MacBook item was clicked successfully");	   
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopNoteBooksPageObject.getMacBookSuccessMessage();
		logger.info("User successfully seen the success message");
	}
	@Then("User should see 1item\\(s) showed to the cart")
	public void user_should_see_1item_s_showed_to_the_cart() {
		laptopNoteBooksPageObject.getUserSee1ItemText();
		logger.info("User successfully seen the 1 items add to the card");
	}
	@When("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBooksPageObject.clickOnCartOption();
		logger.info("The cart option was clicked successfully");
	}
	@When("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObject.clickOnXButton();
		logger.info("Red x button was clicked successfully");
		
	}
	@Then("item should be removed and cart should show0 item\\(s)")
	public void item_should_be_removed_and_cart_should_show0_item_s() {
		laptopNoteBooksPageObject.getTextcartShow0item();
		logger.info("item successfully remove");
	    Utils.takeScreenshotForStep();
	}
	
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNoteBooksPageObject.clickOnMacBookProductComprationIcon();
		logger.info("MacBook product comprison icon were clicked successfully");
	}

	@When("User click on product comparison icon on ‘MacBook Air’")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNoteBooksPageObject.clickOnMacBookAirProductComprationIcon();
		logger.info("MacBook air product comprison icon were clicked successfully");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		laptopNoteBooksPageObject.getMacBookAirSuccessMessage();
		logger.info("MacBook Air success message were seen successfully");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBooksPageObject.clickOnProductComparisonLink();
		logger.info("Product comprison link were clicked successfully");
		
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNoteBooksPageObject.getTextProductComparisonChart();
		logger.info("Product comparison chart were seen successfully");
		Utils.takeScreenshotForStep();
	}
	
	
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopNoteBooksPageObject.clickOnHeartIconOnSonyVio();
		logger.info("Heart icon on sony vaio item was clicked successfully");
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		laptopNoteBooksPageObject.getSonyVioWachListWarningMessage();
		logger.info("User got sony vaio warning message successfully");
		Utils.takeScreenshotForStep();
	}
	
	

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopNoteBooksPageObject.clickOnMacBookProItem();
		logger.info("MackBook pro item were clicked successfully");
	    
	}

	@Then("User should see price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui() {
		String expectedPrice= "$2,000.00";
		String acualPrice = laptopNoteBooksPageObject.getTextSonyVaioPrice();
		Assert.assertEquals(expectedPrice, acualPrice);
		logger.info("Macbook pro price text were verified successfully");
		Utils.takeScreenshotForStep();
	}


}
