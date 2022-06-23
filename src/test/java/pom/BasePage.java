package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePage {
    private WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento "+element);
        }
    }

    public void click(WebElement element) throws Exception{
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento "+element);
        }
    }
    public void clickOnMenu(By element,By element2) throws Exception{
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(element)).perform();
        WebElement sub_menu=driver.findElement(element2);
        a.moveToElement(sub_menu).click().perform();
    }


    public boolean isDisplayed(By element) throws Exception{
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }

    public void sendKeys(By element,String argument) throws Exception{
        try {
            driver.findElement(element).sendKeys(argument);
        }catch (Exception e){
            throw new Exception("No se pudo escribir en el elemento "+element);
        }
    }

    public void entrarCatalogoLink() throws Exception {
        try {
            driver.get("https://tu-casa-ahora2-qa.ide-solution.com/detalle-catalogo/1");
        }catch (Exception e){
            throw new Exception("No se pudo entrar al link");
        }
    }

    public List<WebElement> listaButton(By element) throws Exception {
        try {
            List<WebElement> listOfElements = driver.findElements(element);
            return listOfElements;
        }catch (Exception e){
            throw new Exception("No se pudo entrar al link");
        }
    }

    public void subirArchivos(By element, String path){
        driver.findElement(element);
        driver.switchTo()
                .activeElement()
                .sendKeys(path);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clearInput(By element) throws Exception{
        try {
            driver.findElement(element).clear();
        }catch (Exception e){
            throw new Exception("No se pudo escribir en el elemento "+element);
        }
    }

    public int numListWebElement(By element) throws Exception {
        try {
            List<WebElement> listWebElement = driver.findElements(element);
            return listWebElement.size();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }

    public List<WebElement> listWebElement(By element) throws Exception {
        try {
            List<WebElement> listWebElement = driver.findElements(element);
            return listWebElement;
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }


    public  WebElement ingresarTexto(WebElement element) throws Exception {
        try {
            WebElement texto = (element);
            return texto;
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }

    public  WebElement ingresarTexto(By element) throws Exception {
        try {
            WebElement texto = driver.findElement(element);
            return texto;
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }

    public void selectOneOption(By element,String argument) throws Exception {
        try {
            Select select = new Select(driver.findElement(element));
            select.selectByValue(argument);
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }


    public boolean isDisplayed(WebElement element) throws Exception{
        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }

    public String selectTextOneOption(By element) throws Exception {
        try {
            Select select = new Select(driver.findElement(element));
            return select.getFirstSelectedOption().getAttribute("innerHTML");
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento "+element);
        }
    }
    public String getText(By element) throws Exception{
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento "+element);
        }
    }

    public void getCheckBox(WebElement element) throws Exception{
        try{
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el checkbox del elemento "+element);
        }
    }

    public String getText(WebElement element) throws Exception{
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento "+element);
        }
    }

    public String getTitle() throws Exception{
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver ");
        }
    }

    public String getAlert(By error) throws Exception{
        try {
            String status = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(error)).getText();
            return status;
        }catch (Exception e){
            throw new Exception("No se pudo obtener la alerta del driver ");
        }
    }
}
