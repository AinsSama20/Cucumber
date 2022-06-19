package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicPage extends BasePage{
    //private By pageTitle = By.className("page-title");
    private String titulo = "Category: comics";

    @FindBy(className = "page-title")
    private WebElement pageTitle;

    public ComicPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed()  throws Exception{
        return this.isDisplayed(pageTitle) && this.getText(pageTitle).equals(titulo);
    }
}
