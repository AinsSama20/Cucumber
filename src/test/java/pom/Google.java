package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google extends BasePage{
    public Google(WebDriver driver){super(driver);}
    By search = By.name("q");
    By btnk = By.name("btnK");
    String searchYoutube = "Youtube";
    public void searchYoutube() throws Exception {
        this.ingresarTexto(search).sendKeys(searchYoutube);
    }
    public void clickSearchYoutube() throws Exception {
        this.click(btnk);
    }
}
