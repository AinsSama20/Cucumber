package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    private String titulo = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    //private By titleComics = By.id("menu-item-2008");

    @FindBy(id="menu-item-2008")
    private WebElement titleComics;

    public HomePage (WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed()throws Exception{
        return this.getTitle().equals(titulo);
    }

    public void clickOnTitleComics() throws Exception{
        this.click(titleComics);
    }
}
