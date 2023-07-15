package Nykaa_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseClass;

public class Login {
public static WebDriver driver;
@FindBy(xpath="(//button[text()='Sign in'])[1]")
private WebElement signin;
@FindBy(xpath="(//button[@class='css-ejuz3m'])[1]")
private WebElement mobNum;
@FindBy(xpath="//input[@class='input text-center']")
private WebElement enterNum;
@FindBy(xpath="//button[@type='submit']")
private WebElement submit;
@FindBy(xpath="//input[@placeholder='OTP']")
private WebElement otp;
@FindBy(xpath="//button[@class='button big fill full ']")
private WebElement verify;

public WebElement getSignin() {
	return signin;
}
public WebElement getMobNum() {
	return mobNum;
}
public WebElement getEnterNum() {
	return enterNum;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getOtp() {
	return otp;
}
public WebElement getVerify() {
	return verify;
}
public Login(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
}

}
