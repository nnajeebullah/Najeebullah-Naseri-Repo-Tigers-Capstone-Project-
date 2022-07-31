package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'TEST ENVIRONMENT']")
	private WebElement retailWebsitText;
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(xpath = "//div//input[@id= 'input-email']")
	private WebElement emailAddressField;
	@FindBy(xpath = "//div//input[@id= 'input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value= 'Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text() = 'My Account']")
	private WebElement myAccountDashboard;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateAccountLink;
	@FindBy(id = "input-company")
	private WebElement companyNameField;
	@FindBy(id ="input-website")
	private WebElement websiteField;
	@FindBy(id = "input-tax")
	private WebElement TaxIdField;
	@FindBy(xpath = "//input[@value='cheque']" )
	private WebElement chequePaymentMethod;
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement payPalPaymentMethod;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferPaymentMethod;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeNameField;
	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliatAccountSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAccount;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;
	@FindBy (id = "input-bank-name")
	private WebElement bankNameField;
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumberField;
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberField;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editContinueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	@FindBy(id = "input-email")
	private WebElement editEmailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editAccountContinueButton;
	@FindBy(xpath = "//div//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAccounInfSuccessMessage;
	
	public String getTestEnvironmentText() {
		String textFromUI = retailWebsitText.getText();
		return textFromUI;
	}
	public void clickOnMyAccount() {
		myAccountButton.click();
	}
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public String getTextAfterLogin() {
		String mayAccountText = myAccountDashboard.getText();
		return mayAccountText;
	}
	
	
	public void clickOnRegisterForAffiliateAccountLink() {
		registerForAffiliateAccountLink.click();
	}
	public void enterCompanyName(String companyName) {
		companyNameField.sendKeys(companyName);
	}
	public void enterWebsite(String website) {
		websiteField.sendKeys(website);
	}
	public void enterTaxId(String taxId) {
		TaxIdField.sendKeys(taxId);
	}
	public void clickOnChequeRadioButton() {
		chequePaymentMethod.click();
	}
	public void enterChequePayeeName(String chequePayeeName) {
		chequePayeeNameField.sendKeys(chequePayeeName);
	}
	public void clickOnAboutUsCheckBox() {
		aboutUsCheckBox.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getAffiliateAccountSuccessMessage() {
		String successMessage = affiliatAccountSuccessMessage.getText();
		return successMessage;
	}
	
	
	public void clickOnEditAffiliateAccountLink() {
		editAffiliateAccount.click();
	}
	public void clickOnBankTransferRadioButton() {
		bankTransferRadioButton.click();
	}
	public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}
	public void enterABANumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}
	public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}
	public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}
	public void clickOnEditContinueButton() {
		editContinueButton.click();
	}
	public String getEditAffiliateAccountSuccessMessage() {
		String textFromUI = editSuccessMessage.getText();
		return textFromUI;
	}
	
	
	public void clickOnEditAccoutInfLink() {
		editYourAccountInformation.click();
	}
	public void editFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	public void editLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	public void editEditEmail(String email) {
		editEmailField.sendKeys(email);
	}
	public void editTelephone(String telephone) {
		telephoneField.sendKeys(telephone);
	}
	public String getEditAccountInfoSuccessMessage() {
		String editAccountInfoSuccessText = editAccounInfSuccessMessage.getText();
		return editAccountInfoSuccessText;
	}
	
	
	
	
	

}








