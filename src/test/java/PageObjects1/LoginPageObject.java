package PageObjects1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject
{

	WebDriver localdriver;

	public LoginPageObject(WebDriver rdriver)  // constructor
	{
		localdriver = rdriver; 
		PageFactory.initElements(rdriver, this);
	}
	

	//Web elements of the web page :
	
	
	@FindBy(id = "user-name")
	WebElement name;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement LoginBtn;
	
	@FindBy(id ="add-to-cart-sauce-labs-backpack")
	WebElement Addcart;
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement Menu;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement Logout;
	
	
	public void waitmethod()
	{
		
	}
	
	// Actions Methods for web elements :

	
	public void EnterEmail(String emailid)
	{
		name.sendKeys(emailid);
	}

	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void Login()
	{
		LoginBtn.click();
	}

	public void AddtoCart()
	{
		Addcart.click();
	}
	
	public void Hamburgermenu()
	{
		Menu.click();
	}
	
	public void Logout()
	{
		WebDriverWait wait = new WebDriverWait(localdriver, Duration.ofSeconds(10));
		Logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
		Logout.click();
	}

}

