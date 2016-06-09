package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import edu.iis.mto.bdd.model.FrequentFlyerMember;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/#/welcome")
public class LoginPage extends PageObject
{
	
	/*private final WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void Open()
	{
		driver.get("http://localhost:8080/#/welcome");
	}
	
	public void signingWithCredentials(FrequentFlyerMember user)
	{
		driver.findElement(By.name("email")).sendKeys(user.getEmail());
		driver.findElement(By.name("password")).sendKeys(user.getPassword());
		driver.findElement(By.name("signin")).click();
	}*/
	
	private WebElement email;
	private WebElement password;
	private WebElement signin;
	
	public void signingWithCredentials(FrequentFlyerMember user)
	{
		email.sendKeys(user.getEmail());
		password.sendKeys(user.getPassword());
		signin.click();
	}

}
