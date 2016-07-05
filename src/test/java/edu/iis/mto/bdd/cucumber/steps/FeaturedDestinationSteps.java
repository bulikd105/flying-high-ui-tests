package edu.iis.mto.bdd.cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

/**
 * A description goes here.
 * User: john
 * Date: 6/10/13
 * Time: 9:13 PM
 */
public class FeaturedDestinationSteps 
{

	private  WebDriver driver;

	@Before
	public void init()
	{
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("default");

		driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
    @Then("^(?:she|he) should see ([0-9]+) featured destinations$")
    public void shouldSeeFeaturedDestinations(int featuredCount) {}

    @Then("^the featured destinations should include (.*) costing ([0-9]+)$")
    public void featuredDestinationsShouldInclude(String expectedDestination, int price){}
    
    @After
    public void close()
    {
    	driver.close();
    }
}
