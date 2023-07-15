package Nykaa_StepDefinition;

import org.openqa.selenium.WebDriver;

import BaseClass.baseClass;
import NykaaRunner.Runner;
import Nykaa_Pom.Login;
import PoManager.PageObjManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import property.FileReaderManager;

public class StepDef extends baseClass {
	
	public static WebDriver driver=Runner.driver;
	PageObjManager pom=new PageObjManager(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl(FileReaderManager.getinstance().getinstanceCR().geturl());
	}

	@When("^user Click The Sign in button$")
	public void user_Click_The_Sign_in_button() throws Throwable {
		moveToElement(pom.getL().getSignin());
		click(pom.getL().getSignin());
	}

	@When("^user Click The Sign in with Mobile/Email$")
	public void user_Click_The_Sign_in_with_Mobile_Email() throws Throwable {
	   moveToElement(pom.getL().getMobNum());
	   click(pom.getL().getMobNum());
	}

	@When("^user Enter Email Or Phone Number$")
	public void user_Enter_Email_Or_Phone_Number() throws Throwable{
		String num=FileReaderManager.getinstance().getinstanceCR().getnum();
	    sendKey(pom.getL().getEnterNum(),num);
	}

	@When("^User Click The proceed Button$")
	public void user_Click_The_proceed_Button() throws Throwable {
	   click(pom.getL().getSubmit());
	}

	@When("^user Enter The OTP Which Coming To Mobile Number Or Email$")
	public void user_Enter_The_OTP_Which_Coming_To_Mobile_Number_Or_Email() throws Throwable {
	  otp(pom.getL().getOtp()); 
	}

	@When("^user Click The Verify Button$")
	public void user_Click_The_Verify_Button() throws Throwable {
	   click(pom.getL().getVerify());
	}

	@When("^user Drag Mouse Over The Item And Click The Product Title$")
	public void user_Drag_Mouse_Over_The_Item_And_Click_The_Product_Title() throws Throwable {
	    moveToElement(pom.getS().getSkinCare());
	    moveToElement(pom.getS().getFaceWash());
	}

	@When("^Page Navigate to the Next Window$")
	public void page_Navigate_to_the_Next_Window() throws Throwable {
	    getWindowHandles(1);
	}

	@When("^user Select The Product From The List Of Products$")
	public void user_Select_The_Product_From_The_List_Of_Products() throws Throwable {
	  // scrollIntoView(pom.getS().getSelectPro());
	   moveToElement(pom.getS().getSelectPro());
	   click(pom.getS().getSelectPro());
			}

	@When("^page Navigate To The Next Window$")
	public void page_Navigate_To_The_Next_Window() throws Throwable {
	   click(pom.getS().getSelectPro());
	}

	@When("^user Click The Add To Bag Button$")
	public void user_Click_The_Add_To_Bag_Button() throws Throwable {
	    click(pom.getS().getAddBag());
	}

	@When("^user Click The Proceed Button To Purchase the Product$")
	public void user_Click_The_Proceed_Button_To_Purchase_the_Product() throws Throwable {
	   click(pom.getS().getProceed());
	}

	@When("^user Click Deliver Here Button$")
	public void user_Click_Deliver_Here_Button() throws Throwable {
	    click(pom.getP().getDelivery());
	}

	@When("^user select The cash On delivery$")
	public void user_select_The_cash_On_delivery() throws Throwable {
	   click(pom.getP().getPayCash());
	}

	@When("^user Place the Order$")
	public void user_Place_the_Order() throws Throwable {
	    click(pom.getP().getPlaceOrder());
	}
}
