package Dam;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import TescoPages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private static final String URL = "http://www.tesco.com/direct";

	private HomePage hmPg;
	private WebDriver driver;

	@Before
	public void start() {
		driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		hmPg = new HomePage(driver);
	}

	@After
	public void stop() {
		driver.quit();
	}

	@Given("^User is on Tesco Direct Home Page$")
	public void User_is_on_Tesco_Direct_Home_Page() throws Throwable {

		// Assert.assertTrue(HmPg.SignInorRegister().isDisplayed());
		// Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains(
				"Tesco direct: Electricals"));
		System.out.println("Page UP running");
	}

	@When("^User tries to login with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void User_tries_to_login_with_Username_and_Password(String email,
			String pswd) throws Throwable {
		// GetSignIn
		// HmPg.GetSignIn().click();
		// HmPg.emailForm().sendKeys(email);
		// driver.findElement(By.xpath("//*[@id='nav-bar']/div[2]/ul/li[1]/a")).click();
		// driver.findElement(By.xpath("//*[@class='first sign-in']/a")).click();
		hmPg.getSignIn().click();
		hmPg.emailForm().sendKeys(email);
		// Thread.sleep(1000);
		System.out.println("Click Signin link");
		/*
		 * WebElement message = (new WebDriverWait(driver, 5)) .until(new
		 * ExpectedCondition<WebElement>(){ public WebElement apply(WebDriver d)
		 * { return d.findElement(By.id("signin-email")); } }
		 */
		// driver.findElement(By.id("signin-email")).sendKeys(email);
		System.out.println("Type Email");

		/*
		 * try { HmPg.GetSignIn().click(); System.out.println("Click Sign IN");
		 * Thread.sleep(10000); HmPg.signInLink().sendKeys(email);
		 * System.out.println("Type"+ email);
		 * 
		 * //driver.findElement(By.id("search-submit")).click();; } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

	}

	@Then("^User can see the profile page with sign out option$")
	public void User_can_see_the_profile_page_with_sign_out_option()
			throws Throwable {

	}
}
