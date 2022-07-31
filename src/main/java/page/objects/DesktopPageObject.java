package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textFormUI;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement destopTab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopLink; 
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30ItemIndesktopPage;
	
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement addToTheCartOptionHP;
	@FindBy(id = "input-quantity")
	private WebElement quantityFieldHP;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement HpAddtoTheCartButton;
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMassegeForHP;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement addToTheCartCannon;
	@FindBy(xpath = "//select[@id='input-option226']//child::option[2]")
	private WebElement seclectColordropdown;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityFieldCanon;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement canonAddToTheCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMassegeForCanon;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEos5dCamraItem;
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviewsLink;
	@FindBy(id = "input-name")
	private WebElement nameInputField;
	@FindBy(id = "input-review")
	private WebElement yourReveiwInputField;
	@FindBy(xpath = "//input[@value='5']")
	private WebElement ratingRadioButton;
	@FindBy(xpath = "//button[@class = 'btn btn-primary']")
	private WebElement reveiwContinueButon;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMassegeReview;
	


    public String getTextFromUi() {
	String textFromUi = textFormUI.getText();
	return textFromUi;
    }
    public void clickOnDesktopTab() {
    	destopTab.click();
    }
    public void clickOnShowAllDesktopLink() {
    	showAllDesktopLink.click();
    }
    public String getAppleCinema30Text() {
    	String appleCinema30Text = appleCinema30ItemIndesktopPage.getText();
    	return appleCinema30Text;
    }
    
    
    public void clickOnAddToCartHp() {
    	addToTheCartOptionHP.click();
    }
    public void enterHpQuantity(String quantity) {
    	quantityFieldHP.sendKeys("quantity");
    }
    public void clickOnAddToCartButton() {
    	HpAddtoTheCartButton.click();
    }
    public String getHpSccessMessageFromUI() {
    	String hpSuccessMessage = successMassegeForHP.getText();
    	return hpSuccessMessage;
    }
    
    
    
    public void clickOnAddToTheCartCanon() {
    	addToTheCartCannon.click();
    }
    public void selectRedColor() {
    	seclectColordropdown.click();
    }
    public void enterCanonQuantity() {
    	quantityFieldCanon.sendKeys("quantity");
    }
    public void canonAddToThecartButton() {
    	canonAddToTheCartButton.click();
    }
    public String getCanonSccessMessageFromUI() {
    	String CanonSuccessMessage = successMassegeForCanon.getText();
    	return CanonSuccessMessage;
    }
    
    
    public void clickOnCanonEos5dCamra() {
    	canonEos5dCamraItem.click();
    }
    public void clickOnReviewsLink() {
    	reviewsLink.click();
    }
    public void enterYourName(String yourname) {
    	nameInputField.sendKeys(yourname);
    }
    public void enterYourReviewComment(String yourReview) {
    	yourReveiwInputField.sendKeys(yourReview);
    }
    public void clickOnRatingRadioButton() {
    	ratingRadioButton.click();
    }
    public void clickOnReviewContinueButton() {
    	reveiwContinueButon.click();
    }
    public String getCanonReviewSccessMessageFromUI() {
    	String canonReviewSuccessMessage = successMassegeReview.getText();
    	return canonReviewSuccessMessage;
    }
    
    
    
    
    






}








