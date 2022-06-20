package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private static int numeroCaso=0;
    private static int numeroScenarios=2;
    private DriverManager driverManager;

    @Before("@browser")
    public void setUp() throws IOException {
        numeroCaso++;
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/resources/config.properties"));
        System.out.println("Caso "+numeroCaso+" ejecutandose");
        driverManager= DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url_base"));
        driver.manage().window().maximize();
    }
    @After("@browser")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Captura de pantalla");
        }
        driverManager.quitDriver();
    if (numeroCaso==numeroScenarios){
        driverManager= DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("file:/C:/Users/franc/IdeaProjects/Cucumber/test-output/SparkReport/Spark.html");
        driver.manage().window().maximize();
    }
    }


    public static WebDriver getDriver(){
        System.out.println("El escenario número: "+numeroCaso+" se ejecutó");
        return driver;
    }




}
