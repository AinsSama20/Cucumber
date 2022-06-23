package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.Google;
import pom.Pages.AsesoriaLegal;
import pom.Pages.ComprarInmueble;
import pom.Pages.ConstruirInmueble;
import pom.Pages.VenderInmueble;

public class Test {
    protected WebDriver driver = Hooks.getDriver();
    protected Google google = new Google(driver);
    protected ConstruirInmueble construirInmueble = new ConstruirInmueble(driver);
    protected VenderInmueble venderInmueble = new VenderInmueble(driver);
    protected AsesoriaLegal asesoriaLegal = new AsesoriaLegal(driver);
    protected ComprarInmueble comprarInmueble = new ComprarInmueble(driver);

}
