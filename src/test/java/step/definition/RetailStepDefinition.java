package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	
	RetailPageObject retailPageObject = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailPageObject.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text in Retail Website were verified successfully");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPageObject.clickOnMyAccount();
		logger.info("My account button were clicked successfully");
	 
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.clickOnLoginLink();
		logger.info("Login link were clicked successfully");
	    
	}
	

    @When("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
    	retailPageObject.enterEmail("najeeb.naserie@gmail.com");
	    retailPageObject.enterPassword("123456");
	    logger.info("email and password were entered successfully");
    }
	

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObject.clickOnLoginButton();
		logger.info("Login button were clicked successfully");
	    
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String actualText = retailPageObject.getTextAfterLogin();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPageObject.clickOnRegisterForAffiliateAccountLink();
    	logger.info("Link of register for an affiliate account were successfully clicked");
		
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
	    retailPageObject.enterCompanyName(data.get(0).get("company"));
	    retailPageObject.enterWebsite(data.get(0).get("website"));
	    retailPageObject.enterTaxId(data.get(0).get("taxID"));
	    retailPageObject.clickOnChequeRadioButton();
	    retailPageObject.enterChequePayeeName(data.get(0).get("chequePayeeName"));
	    logger.info("Registration form for affiliate account is filled-out successfully");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.clickOnAboutUsCheckBox();
		logger.info("About Us check box were clicked successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickOnContinueButton();
		logger.info("Continue botton were clicked successfully");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = retailPageObject.getAffiliateAccountSuccessMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("Affiliate account success text were verified successfullly");
		Utils.takeScreenshotForStep();
		
	}
	
	
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPageObject.clickOnEditAffiliateAccountLink();
		logger.info("Edit affiliate account link were clicked successfully");
	  
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.clickOnBankTransferRadioButton();
		logger.info("Bank transfer radio button were clicked successfully");
	  
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterBankName(data.get(0).get("bankName"));
		retailPageObject.enterABANumber(data.get(0).get("abaNumber"));
		retailPageObject.enterSwiftCode(data.get(0).get("swiftCode"));
		retailPageObject.enterAccountName(data.get(0).get("accountName"));
		retailPageObject.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("Registration form for edit affiliate account is filled-out successfully");
		Utils.takeScreenshotForStep();
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPageObject.clickOnEditAccoutInfLink();
		logger.info("Edit accout infromation account link were cliked successfully");
	   
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.editFirstName(data.get(0).get("firstname"));
		retailPageObject.editLastName(data.get(0).get("lastName"));
		retailPageObject.editEditEmail(data.get(0).get("email"));
		retailPageObject.editTelephone(data.get(0).get("telephone"));
		logger.info("Registration form for edit account information is filled-out successfully");
	}

	@When("User click on continue button")
	public void user_click_on_edit_continue_button1() {
		retailPageObject.clickOnEditContinueButton();
		logger.info("Edit account infromation continue button were clicked successfully");
	    
	}

	@Then("User should see a message Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		String expectedEditSuccessMessage = "Success: Your account has been successfully updated.";
		String actualEditSuccessMessage = retailPageObject.getEditAccountInfoSuccessMessage();
		Assert.assertEquals(expectedEditSuccessMessage, actualEditSuccessMessage);
		logger.info("Edit account information success message were verified successfully");
		Utils.takeScreenshotForStep();
	}

}
