//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	WebDriverWait wait;
//
//	@Given("^User is already on the Login Page$")
//	public void user_already_on_login_page() {
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://classic.crmpro.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}
//	
//
//	@When("^Title of login page is CRMPRO$")
//	public void title_of_login_page_is_CRMPRO() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	
//
//	@Then("^User enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//	}
//
//	@Then("^User clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//	
//	@Then("^User is on Home page$")
//	public void user_is_on_Home_page() throws InterruptedException  {
//		wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleIs("CRMPRO"));
//		String title = driver.getTitle();
//		System.out.println("Home page title:- " + title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() throws InterruptedException  {
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//	    driver.findElement(By.id("first_name")).sendKeys(firstname);
//	    driver.findElement(By.id("surname")).sendKeys(lastname);
//	    driver.findElement(By.id("company_position")).sendKeys(position);
//	    driver.findElement(By.xpath("//input[@value='Save']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser()  {
//	   driver.quit();
//	}
//
//
//}
