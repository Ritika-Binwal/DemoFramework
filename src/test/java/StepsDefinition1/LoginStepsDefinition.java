package StepsDefinition1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects1.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsDefinition 
{

	public WebDriver driver;			// Driver Object
	public LoginPageObject loginpg;		// Object of LoginPageObject class


	@Given("User Launch Chrome Browser")
	public void launchbrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg = new LoginPageObject(driver);		// Initialize the object of LoginPageObject class 
	}
	
	
	@When("User enter URL {string}")
	public void enterurl(String url) 
	{
		driver.manage().window().maximize();
	    driver.get(url);
	}

	
	@And("User enter Username as {string} and Password as {string}")
	public void enterdetails(String email, String password)
	{
	   loginpg.EnterEmail(email);
	   loginpg.EnterPassword(password);
	}

	
	@And("User Click on Login")
	public void clicklogin() 
	{
	   loginpg.Login();
	}

	
	@Then("Page Title should be {string}")
	public void VerifyPageTitle(String expectedtitle)
	{
	   String actualtitle = driver.getTitle();
	   if(actualtitle.equals(expectedtitle))
	   {
		   Assert.assertTrue(true);
	   }
	   
	   else
	   {
		   Assert.assertTrue(false);
	   }	
	 
	}
	
	@And("User Click on Add to cart")
	public void Clickcart() 
	{
	    loginpg.AddtoCart();
	}
	
	@When("User Click on Hamburger menu")
	public void user_click_on_hamburger_menu() 
	{
		loginpg.Hamburgermenu();
	}

	@And("User Click on Logout link")
	public void clicklogout() throws InterruptedException 
	{
		
	    loginpg.Logout();
	}
	
	@And("Close Browser")
	public void close_browser()
	{
		driver.close();
	}

}
