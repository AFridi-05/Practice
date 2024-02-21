package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simpleform_Steps {
	
	WebDriver driver;
	
	@Given("User opens the browser and navigate to training form website")
	public void user_opens_the_browser_and_navigate_to_training_form_website(){
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
        driver.manage().window().maximize();
	}

	@When("User Enter Firstname, Lastname, Email")
	public void user_Enter_Firstname_Lastname_Email() {
		driver.findElement(By.id("firstName")).sendKeys("Shaik");
		driver.findElement(By.id("lastName")).sendKeys("Afridi");
		driver.findElement(By.id("email")).sendKeys("Me@job.com");
	}

	@When("Contact Number, Message")
	public void contact_Number_Message() {
	    driver.findElement(By.id("number")).sendKeys("9849129525");
	    driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Mama pandulu gumpuluga vastai!!");
	}

	@When("User clickes on submit")
	public void user_clickes_on_submit() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("A confirmation popup is displayed")
	public void a_confirmation_popup_is_displayed() {
		System.out.println("Clicked on Submit");
		driver.quit();
	}
	

}
