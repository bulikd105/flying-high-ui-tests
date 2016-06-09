package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/#/home")
public class HomePage extends PageObject
{
	@FindBy(id = "welcome-message")
	private WebElement message;
	
	
	public void checkWelcomeMessage(FrequentFlyerMember user)
	{
		assertThat(message.getText(), equalTo("Witaj "+user.getFirstName()));
	}
}
