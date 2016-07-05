package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/#/home")
public class HomePage extends PageObject
{
    public HomePage(WebDriver driver) 
    {
        super(driver);
    }
    
    public void selectMenuOptions(String... menuOptions) 
    {
        for (String menuChoice : menuOptions)
        {
            $(".mainMenu").findBy(By.linkText(menuChoice)).click();
        }
    }

    public String getWelcomeMessage() 
    {
        return getDriver().findElement(By.id("welcome-message")).getText();
    }
}
