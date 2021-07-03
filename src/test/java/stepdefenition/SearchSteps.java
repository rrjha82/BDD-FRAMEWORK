package stepdefenition;

import org.junit.Assert;

import GoogleSearchImplementation.Product;
import GoogleSearchImplementation.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	Product product;
	Search search;
	
	@Given("Google URL")
	public void google_url() {
		System.out.println("Step 1:I am on the seaaarh page");
	}

	@When("User search for {string} and {int} in google.")
	public void user_search_for_and_in_google(String Productname, Integer Price) {
		System.out.println("Step 2:User search for the product named" + Productname + Price);
		product =new Product(Productname,Price);
	}

	@When("User enter Password in the password field.")
	public void user_enter_password_in_the_password_field() {
		System.out.println("Step 3:Enter the password");
	}

	@Then("User should be able to see {string} and {int} in search result.")
	public void user_should_be_able_to_see_and_in_search_result(String Productname, Integer Price) {
		System.out.println("Step 4:User search for the product named" + Productname + "price is" + Price);
		search =new Search();
		String name= search.displayproduct(product);
		System.out.println("Searched product is"+ name);
		Assert.assertEquals(product.getProductname(), name);
	}

}
