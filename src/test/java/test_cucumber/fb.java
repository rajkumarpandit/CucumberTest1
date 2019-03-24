package test_cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb {
    WebDriver driver;

    @Given("^open firefox and start application$")
    public void open_firefox_and_start_application() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Raj\\intellij_workspace\\gecko\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) throws Exception {
        driver.findElement(By.id("email")).sendKeys("rkp@rkp.com");
        driver.findElement(By.id("pass")).sendKeys("password");
    }

    @Then("^user logs in unsuccessfully$")
    public void user_logs_in_unsuccessfully() throws Exception {
        driver.findElement(By.id("loginbutton")).click();
    }
}
