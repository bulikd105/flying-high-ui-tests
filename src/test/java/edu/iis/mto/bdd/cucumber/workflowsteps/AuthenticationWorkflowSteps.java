package edu.iis.mto.bdd.cucumber.workflowsteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.iis.mto.bdd.cucumber.pages.HomePage;
import edu.iis.mto.bdd.cucumber.pages.LoginPage;
import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.thucydides.core.annotations.Step;

public class AuthenticationWorkflowSteps 
{
	LoginPage loginPage;
    HomePage homePage;

    @Step
    public void enterCredentials(FrequentFlyerMember frequentFlyerMember) 
    {
        loginPage.open();
        loginPage.signingWithCredentials(frequentFlyerMember);
    }

    @Step
    public void verifyWelcomeMessageFor(FrequentFlyerMember frequentFlyerMember) 
    {
        String welcomeMessage = homePage.getWelcomeMessage();
        assertThat(welcomeMessage, equalTo("Witaj " + frequentFlyerMember.getFirstName()));
    }
}
