package definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.*;

public class definitions {
	WebDriver driver;
	
	@Given("^signinpage$")
	public void signinpage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^username is given as \"([^\"]*)\"$")
	public void username_is_given_as(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^password is given as \"([^\"]*)\"$")
	public void password_is_given_as(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}
	
	@Then("^Login$")
	public void login() throws Throwable {
		driver.findElement(By.name("Login")).click();
	}
	/*
	@Given("^loginpage$")
	public void loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}
	*/
	@When("^search headphones$")
	public void search_headphones() throws Throwable {
		/*
		signinpage();
		username_is_given_as("lalitha");
		 password_is_given_as("Password123");
		 login();
		*/
		driver.findElement(By.id("myInput")).sendKeys("Headphone");
		Actions a= new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
	}

	@When("^try payment$")
	public void try_payment() throws Throwable {
	   System.out.println("User trying to move forward without adding product to cart");
	}

	@Then("^TestMeApp dont show cart icon$")
	public void testmeapp_dont_show_cart_icon() throws Throwable {
	   System.out.println("This is Impossibe");
	}

}
