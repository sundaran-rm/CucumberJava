package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {


	WebDriver driver = null;
	By searchBox = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

	@Given("Browser is open") 
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver");
		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@And("User is on Google search page")
	public void user_is_on_google_search_page() {

		String url = "https://www.google.com";
		driver.get(url);
	}

	@When("^User enters \"([^\"]*)\" in google search box$")
	public void user_enters_searchtext_in_google_search_box(String searchtext) {	
		
		driver.findElement(searchBox).sendKeys(searchtext);
	}

	@And("User hits enter")
	public void user_hits_enter() {

		driver.findElement(searchBox).sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to the search results page")
	public void user_is_navigated_to_the_search_results_page() {

		driver.getPageSource().contains("Selenium");
		driver.close();
		driver.quit();
	}

}
