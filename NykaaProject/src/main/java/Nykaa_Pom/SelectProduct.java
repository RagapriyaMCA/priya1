package Nykaa_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
public static WebDriver driver;
@FindBy(xpath="(//a[text()='skin'])[2]")
private WebElement skinCare;

@FindBy(xpath="//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash')]")
private WebElement faceWash;

@FindBy(xpath="/html/body/div[1]/div/div/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/a")
private WebElement selectPro;

@FindBy(xpath="//button[@class='css-aesrxy']")
private WebElement addBag;

@FindBy(xpath="//span[text()='Proceed']")
private WebElement proceed;

public WebElement getSkinCare() {
	return skinCare;
}

public WebElement getFaceWash() {
	return faceWash;
}

public WebElement getSelectPro() {
	return selectPro;
}
public WebElement getAddBag() {
	return addBag;
}

public WebElement getProceed() {
	return proceed;
}
public SelectProduct(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
}

}
