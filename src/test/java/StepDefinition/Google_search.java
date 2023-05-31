package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Google_search {
	WebDriver driver;
	
	@Given("^user on google search page$")
	public void user_on_google_search_page()
	{
	   System.setProperty("webdriver.chrome.driver", "D:\\Cucumber_java\\Cucumber_Maven\\src\\test\\resources\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   
	}

	@When("^user enters search (.*) in search box$")
	public void user_enters_search_item_in_search_box(String item) throws InterruptedException
	{
	  driver.findElement(By.name("q")).sendKeys(item);
	  Thread.sleep(3000);
	}

	@And("^clics on the search button$")
	public void clics_on_the_search_button() 
	{
		driver.findElement(By.name("btnK")).click();
	}

	@Then("^user able to get perticular serch information$")
	public void user_able_to_get_perticular_serch_information() 
	{
	System.out.println(driver.getPageSource().contains("Google Account: Manikanta Siva  \r\n"
			+ "(manikantasiva1@gmail.com)"));
	
	driver.quit();
	}

}
