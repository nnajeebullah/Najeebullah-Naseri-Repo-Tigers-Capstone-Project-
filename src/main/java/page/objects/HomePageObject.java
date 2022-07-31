package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currancyDropdown;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroCurrancy;
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currancyValueChange;
	
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shopingCartButton;
	@FindBy(xpath ="//p[text()='Your shopping cart is empty!']")
	private WebElement shopingCartEmpty;
	
	public void clickOnCurrancyDropdown() {
		currancyDropdown.click();
	}
	public void clickOnEuroCurrancy() {
		euroCurrancy.click();
	}
	public String getTextcurrancyValueChange() {
		String currancyValue = currancyValueChange.getText();
		return currancyValue;
	}
	
	
	public void clickOnshopingCartButton() {
		shopingCartButton.click();
	}
	public String getTextShopingCartEmpty() {
		String shopingCartText = shopingCartEmpty.getText();
		return shopingCartText;
	}
	

}
