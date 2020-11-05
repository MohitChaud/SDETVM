package stepDefine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DefineSteps {
	WebDriver driver;
	@Given("application is opened")
	public void application_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	  System.out.println("app is opened");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		
	}

	@When("user brought mobile for {int}")
	public void user_brought_mobile_for(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
	   System.out.println("user purchased mobile for "+int1);
	}


}
