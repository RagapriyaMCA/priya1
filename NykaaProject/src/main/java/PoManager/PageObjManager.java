package PoManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Nykaa_Pom.Login;
import Nykaa_Pom.PlaceOrder;
import Nykaa_Pom.SelectProduct;

public class PageObjManager {
private Login l;
private SelectProduct s;
private PlaceOrder p;
private WebDriver driver;
public Login getL() {
	l=new Login(driver);
	return l;
}
public SelectProduct getS() {
	s=new SelectProduct(driver);
	return s;
}
public PlaceOrder getP() {
	p=new PlaceOrder(driver);
	return p;
}
public PageObjManager(WebDriver Driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}
