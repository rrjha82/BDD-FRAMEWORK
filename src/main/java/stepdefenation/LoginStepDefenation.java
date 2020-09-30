
	package stepdefenation;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStepDefenation {

    @Given("^User is present on login page$")
    public void user_is_present_on_login_page() throws Throwable {
        System.out.println("Logged in Success");
    }

    @When("^title of login page is FREE CRM$")
    public void title_of_login_page_is_free_crm() throws Throwable {
    	System.out.println("title of login page if FREE crm in Success");
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    	System.out.println("User enter username and password successfully");
    }
    
    
    @Then("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
    }
    

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	System.out.println("User clicks on login button");
    }
    
}

