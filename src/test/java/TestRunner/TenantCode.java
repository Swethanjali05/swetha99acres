package TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenantCode {

    WebDriver driver;
    @Given("user is logged into the website")
    public void user_is_logged_into_the_website() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	WebElement anchorTag = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[1]/div[2]"));
		anchorTag.click();
    }

    @When("the user navigates to {string}")
    public void the_user_navigates_to() {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://www.99acres.com/#");

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @When("the user selects {string} option a dropdown is visible")
    public void the_user_selects_option_a_dropdown_is_visible(String option) {
        // Find the dropdown element and select the given option
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-id']")); // Update this with your actual dropdown's XPath or ID
        dropdown.click();
        WebElement optionElement = dropdown.findElement(By.xpath("//option[text()='" + option + "']"));
        optionElement.click();
    }

    @Then("the user selects {string} as option")
    public void the_user_selects_as_option(String option) {
        // Find and click the option element
        WebElement optionElement = driver.findElement(By.xpath("//button[text()='" + option + "']")); // Update the XPath as needed
        optionElement.click();
    }

    @Then("selects For tenants as option")
    public void selects_for_tenants_as_option() {
        // Find and click the "For tenants" option
        WebElement tenantsOption = driver.findElement(By.xpath("//button[text()='For tenants']")); // Update the XPath as needed
        tenantsOption.click();
    }

    @Then("the user selects {string} option")
    public void the_user_selects_option(String option) {
        // Find and click the specified option
        WebElement optionElement = driver.findElement(By.xpath("//button[text()='" + option + "']")); // Update the XPath as needed
        optionElement.click();
    }

    @Then("selects {string} as option")
    public void selects_as_option(String option) {
        // Find and click the specified option
        WebElement optionElement = driver.findElement(By.xpath("//button[text()='" + option + "']")); // Update the XPath as needed
        optionElement.click();
    }

    @Then("selects a filter")
    public void selects_a_filter() {
        // Example: Find and select a filter (update XPath or ID as needed)
        WebElement filterElement = driver.findElement(By.xpath("//input[@type='checkbox']")); // Update the XPath as needed
        filterElement.click();
    }

    @Then("selects the desired property")
    public void selects_the_desired_property() {
        // Example: Select the desired property (update XPath or ID as needed)
        WebElement propertyElement = driver.findElement(By.xpath("//div[contains(@class, 'property')]")); // Update the XPath as needed
        propertyElement.click();
    }
    
    // Cleanup method to close the browser
    @Then("close the browser")
    public void close_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
