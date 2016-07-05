package edu.iis.mto.bdd.cucumber.steps;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.iis.mto.bdd.cucumber.workflowsteps.AuthenticationWorkflowSteps;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class UserAuthenticationSteps 
{
    @Steps
    AuthenticationWorkflowSteps authenticationWorkflowSteps;

    @Managed
    private WebDriver driver;
	
    @Given("^(.*) is a registered Frequent Flyer$")
    public void givenARegisteredFrequentFlyer(FrequentFlyerMember user) {}

    @When("^(.*) authenticates with a valid email address and password$")
    public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(FrequentFlyerMember user) 
    {
    	authenticationWorkflowSteps.enterCredentials(user);
    }

    @Then("^(.*) should be given access to (?:her|his) account$")
    public void thenTheUserShouldBeGivenAccessToAccount(FrequentFlyerMember user) 
    {
    	authenticationWorkflowSteps.verifyWelcomeMessageFor(user);
    }

    @Given("^(.*) has logged on$")
    public void aUserHasLoggedOnAs(FrequentFlyerMember user) 
    {
    	authenticationWorkflowSteps.enterCredentials(user);
    }

    @When("^(?:.*) views the home page$")
    public void whenAUserViewsTheHomePage() {}
    
    @After
    public void close(){
    	driver.close();
    }

}
