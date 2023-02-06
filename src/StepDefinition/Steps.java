package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {

    WebDriver driver;

    @Given("^Open the Chrome and launch the application$")
    public void open_the_Chrome_and_launch_the_application() throws Throwable
    {
        //path of chromedriver.exe set
        System.setProperty("chromedriver",
                "/usr/local/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //launch URL
        driver.get("http://demo.guru99.com/v4");
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("This Step open the Chrome and launch the application.");

    }


    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("^Reset the credential$")
    public void	Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
        System.out.println("This step click on the Reset button.");
    }

}