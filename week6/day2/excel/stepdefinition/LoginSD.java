package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
    @Given("Launch the browser and load the URL")
public void launch_the_browser_and_load_the_url() {
    driver=new ChromeDriver();
    driver.get("")
}
@When("Enter the username")
public void enter_the_username() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Enter the password")
public void enter_the_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Click on LoginButton")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
