package ca.mcgill.ecse.flexibook.features;

import static org.junit.Assert.assertEquals;

import ca.mcgill.ecse.flexibook.Controller.FlexibookController;
import ca.mcgill.ecse.flexibook.Controller.InvalidInputException;
import ca.mcgill.ecse.flexibook.application.FlexiBookApplication;
import ca.mcgill.ecse.flexibook.model.FlexiBook;
import ca.mcgill.ecse.flexibook.model.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCustomerOrOwnerAccountStepDefinition {

	private String error;
	private String oldUsername;
	private String oldPassword;

	private int errorCount = 0;

	private FlexiBook flexibook = FlexiBookApplication.getflexibook();

	//	@Given("an owner account exists in the system with username {string} and password {string}")
	//	public void an_owner_account_exists_in_the_system_with_username_and_password(String string, String string2) {
	//	    
	//		
	//		// Write code here that turns the phrase above into concrete actions
	//	    //throw new io.cucumber.java.PendingException();
	//	}



	@When("the user tries to update account with a new username {string} and password {string}")
	public void the_user_tries_to_update_account_with_a_new_username_and_password(String newUsername, String newPassword) throws InvalidInputException {

		try {
			oldUsername = FlexiBookApplication.getCurrentuser().getUsername();
			oldPassword = FlexiBookApplication.getCurrentuser().getUsername();

			FlexibookController.UpdateAccount(oldUsername, newUsername, newPassword);
		} catch (InvalidInputException e) {
			error = e.getMessage();
			FlexiBookApplication.setmessage(error);
		}
		errorCount ++;
	}

	@Then("the account shall not be updated")
	public void the_account_shall_not_be_updated() {

		assertEquals(oldUsername, flexibook.getCustomer(0).getWithUsername(oldUsername).getUsername());
		assertEquals(oldPassword, flexibook.getCustomer(0).getWithUsername(oldUsername).getPassword());
	}

}
