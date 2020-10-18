package ca.mcgill.ecse.flexibook.features;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ca.mcgill.ecse.flexibook.Controller.FlexibookController;
import ca.mcgill.ecse.flexibook.Controller.InvalidInputException;
import ca.mcgill.ecse.flexibook.application.FlexiBookApplication;
import ca.mcgill.ecse.flexibook.model.Business;
import ca.mcgill.ecse.flexibook.model.FlexiBook;
import ca.mcgill.ecse.flexibook.model.Owner;
import ca.mcgill.ecse.flexibook.model.Service;

public class UpdateServiceDefinitions {
	private  FlexiBook flexibook;
	  private String error;
	  
	  @When("{string} initiates the update of the service {string} to name {string}, duration {string}, start of down time {string} and down time duration {string}")
	  public void initiates_the_update_of_the_service_to_name_duration_start_of_down_time_and_down_time_duration(String string, String string2, String string3, String string4, String string5, String string6) {
	      // Write code here that turns the phrase above into concrete actions
	      throw new io.cucumber.java.PendingException();
	  }



	  @Then("the service {string} shall be updated to name {string}, duration {string}, start of down time {string} and down time duration {string}")
	  public void the_service_shall_be_updated_to_name_duration_start_of_down_time_and_down_time_duration(String string, String string2, String string3, String string4, String string5) {
	      // Write code here that turns the phrase above into concrete actions
	      throw new io.cucumber.java.PendingException();
	  }
	  
	  @Then("the service {string} shall still preserve the following properties:")
	  public void the_service_shall_still_preserve_the_following_properties(String string, io.cucumber.datatable.DataTable dataTable) {
	      // Write code here that turns the phrase above into concrete actions
	      // For automatic transformation, change DataTable to one of
	      // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	      // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	      // Double, Byte, Short, Long, BigInteger or BigDecimal.
	      //
	      // For other transformations you can register a DataTableType.
	      throw new io.cucumber.java.PendingException();
	  }
	  
	  @After
	  public void tearDown() {
	     flexibook=FlexiBookApplication.getflexibook();
	      flexibook.delete();
	  }
}