//package stepDefinitions;
//
//import java.util.List;
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
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepDefinition {
//	
//	WebDriver driver;
//	WebDriverWait wait;
//	
//	@Given("^User is already on the Login Page$")
//	public void user_is_already_on_the_Login_Page() {
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://classic.crmpro.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    
//	}
//
//	@When("^Title of login page is CRMPRO$")
//	public void title_of_login_page_is_CRMPRO() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//
//	@Then("^User enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1)); 
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
//	public void user_is_on_Home_page() {
//		wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleIs("CRMPRO"));
//		String title = driver.getTitle();
//		System.out.println("Home page title:- " + title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("mainpanel")));
//		driver.switchTo().frame("mainpanel");
//		WebElement dealsLink = driver.findElement(By.linkText("Deals"));
//		Actions action = new Actions(driver);
//		action.moveToElement(dealsLink).build().perform();
//		driver.findElement(By.linkText("New Deal")).click();
//	   
//	}
//
//	@Then("^user enters title and amount and probability and commission$")
//	public void user_enters_title_and_amount_and_probability_and_commission(DataTable details) {
//		List<List<String>> data = details.raw();
//		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
//		driver.findElement(By.xpath("//input[@value='Save']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.quit();
//	}
//}
