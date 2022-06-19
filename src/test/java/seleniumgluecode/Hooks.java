package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numeroCaso=0;
    private DriverManager driverManager;
    @Before
    public void setUp(){
        numeroCaso++;
        System.out.println("Caso "+numeroCaso+" ejecutandose");
        driverManager= DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        System.out.println("El escenario nro: "+numeroCaso+" se ejecutó");
        return driver;
    }



}
