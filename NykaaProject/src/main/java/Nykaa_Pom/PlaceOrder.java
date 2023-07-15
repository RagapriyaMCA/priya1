package Nykaa_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
public static WebDriver driver;

@FindBy(xpath="//button[text()='Deliver here']")
private WebElement delivery;

@FindBy(xpath="//p[text()='Cash on delivery']")
private WebElement payCash;

@FindBy(xpath="//button[text()='Place order']")
private WebElement placeOrder;


public WebElement getDelivery() {
	return delivery;
}

public WebElement getPayCash() {
	return payCash;
}

public WebElement getPlaceOrder() {
	return placeOrder;
}
public PlaceOrder(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
}
}
