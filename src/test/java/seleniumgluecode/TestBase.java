package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.ComicPage;
import pom.HomePage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();

    //protected HomePage homePage = new HomePage(driver);
    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);

    protected ComicPage comicPage = PageFactory.initElements(driver,ComicPage.class);
}
