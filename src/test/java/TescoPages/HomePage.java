package TescoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Dam.BasePage;
import Dam.StepDefinition;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	//WebElement signInLink = driver.findElement(By.xpath("//*[@id='nav-bar']/div[2]/ul/li[1]/a"));
//	WebElement emailLink = driver.findElement(By.id("signin-email"));
	//WebElement passwrd = driver.findElement(By.id("signin-password"));

	public WebElement getSignIn() {
		return driver.findElement(By.xpath("//*[@id='nav-bar']/div[2]/ul/li[1]/a"));
	/*	try{
			 driver.findElement(By.xpath("//*[@id='nav-bar']/div[2]/ul/li[1]/a"));	
		}           
       catch (Exception e) {
       	
       	if(e!=null)
           e.printStackTrace();
           }
		return null;*/
	}
	
	public WebElement emailForm() {	
		return driver.findElement(By.id("signin-email"));
	}
	
		/*try{
	}
		return driver.findElement(By.id("signin-email"));
	}           
    catch (Exception e) {
    	
    	if(e!=null)
        e.printStackTrace();
        }
		return null;
	}*/
	}
	
	

