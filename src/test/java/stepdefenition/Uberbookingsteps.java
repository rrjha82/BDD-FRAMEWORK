package stepdefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Uberbookingsteps {
	
	@Given("user wants to seleact a car type {string} from uber application")
	public void user_wants_to_seleact_a_car_type_from_uber_app(String carType) {
	     System.out.println("User is in Step1");
	}

	@When("^user select car \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
	public void user_select_car_and_pick_up_point_and_drop_location(String carType, String Pickuppoint, String Droppoint) {
	  
		System.out.println("Step2" + carType + " " + Pickuppoint + " " + Droppoint );	
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    
		 System.out.println("User is in Step3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    
		 System.out.println("User is in Step4");
		
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer price) {
		
	   
		System.out.println("Step5 :" + price);
		
	}

}
