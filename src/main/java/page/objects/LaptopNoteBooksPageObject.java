package page.objects;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textFormUI;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebookTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNoteBookOption;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	@FindBy(id = "button-cart")
	private WebElement addToTheCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement macBookSuccessMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userSee1ItemAdded;
	@FindBy(id = "cart-total")
	private WebElement cartOption;
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement xButton;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cartShow0item;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookProductComprationIcon;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement macBookAirProductComprationIcon;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement macBookAirSuccessMessage;
	@FindBy(xpath = "//a[text()='Product Compare (2)']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//a[text()='Product Comparison']")
	private WebElement productComparisonChart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconOnSonyVio;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sonyVioWachListWariningMessage;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPriceTag;
	
	public void clickOnLaptopAndNotebookTab() {
		laptopAndNotebookTab.click();
	}
	public void clickOnShowAllLaptopAndNoteBookOption() {
		showAllLaptopAndNoteBookOption.click();
	}
	public void clickOnMacBookItem() {
		macBookItem.click();
	}
	public void clickOnAddToTheCartButton() {
		addToTheCartButton.click();
	}
	public String getMacBookSuccessMessage() {
		String macSuccessMessage = macBookSuccessMessage.getText();
		return macSuccessMessage;
	}
	public String getUserSee1ItemText() {
		String itemInCardText = userSee1ItemAdded.getText();
		return itemInCardText;
	}
	public void clickOnCartOption() {
		cartOption.click();
	}
	public void clickOnXButton() {
		xButton.click();
	}
	public String getTextcartShow0item() {
		String textCart0 = cartShow0item.getText();
		return textCart0;
	}
	
	
	public void clickOnMacBookProductComprationIcon() {
		macBookProductComprationIcon.click();
	}
	public void clickOnMacBookAirProductComprationIcon() {
		macBookAirProductComprationIcon.click();
	}
	public String getMacBookAirSuccessMessage() {
		String macBookAirMessage = macBookAirSuccessMessage.getText();
		return macBookAirMessage;
	}
	public void clickOnProductComparisonLink(){
		productComparisonLink.click();
	}
	public void getTextProductComparisonChart() {
		productComparisonChart.getText();
	}
	
	
	
	public void clickOnHeartIconOnSonyVio() {
		heartIconOnSonyVio.click();
	}
	public void getSonyVioWachListWarningMessage() {
		sonyVioWachListWariningMessage.getText();
	}
	
	
	public void clickOnMacBookProItem() {
		macBookProItem.click();
	}
	public String getTextSonyVaioPrice() {
		String sonyVaioText = macBookProPriceTag.getText();
		return sonyVaioText;
	}
	
	
	
	
	

}
