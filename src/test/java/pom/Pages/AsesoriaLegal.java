package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pom.BasePage;

import java.util.List;
import java.util.Map;

public class AsesoriaLegal extends BasePage {
    public AsesoriaLegal (WebDriver driver){super(driver);}

    private String tituloAsesoriaLegal = "Tu Casa Ahora";
    private By path_asesoria_legal= By.xpath("/html/body/app-root/app-home/app-header-app/header/div/div/div[2]/nav/ul/li[4]/a");
    private By tipoAsesoria = By.id("asesoria");
    private By areaPropiedad = By.id("area_propiedad");
    private By tipoInmueble = By.id("tipo_inmueble");
    private By si_sunarp = By.id("si_sunarp");
    private By no_sunarp = By.id("flexCheckDefault");
    private By descripcionCaso = By.id("descripcion_caso");
    private By tipoDocumentoPropietario = By.id("tipo_documento_propietario");
    private By numDocumento = By.id("n_documento");
    private By nombres = By.id("nombres");
    private By email = By.id("email");
    private By telefono = By.id("telefono");
    public void clickAsesoriaLegal() throws Exception {
        click(path_asesoria_legal);
    }
    public boolean isTitleComicsDisplayed()  throws Exception{
        return this.getTitle().equals(tituloAsesoriaLegal);
    }

    public void escribirArea() throws Exception {
        sendKeys(areaPropiedad,"100");
    }

    public void tipoAsesoria(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String valueAsesoriaString = form.get("ValorAsesoria");
            String nameAsesoriaString = form.get("TipoAsesoria");
            selectOneOption(tipoAsesoria,valueAsesoriaString);
            Assert.assertEquals(nameAsesoriaString,selectTextOneOption(tipoAsesoria));
            Thread.sleep(1000);
        }
    }

    public void tipoInmueble(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String valueInmuebleString = form.get("ValorInmueble");
            String nameInmuebleString = form.get("TipoInmueble");
            selectOneOption(tipoInmueble,valueInmuebleString);
            Assert.assertEquals(nameInmuebleString,selectTextOneOption(tipoInmueble));
            Thread.sleep(1000);
        }
    }

    public void inscritoSunarp(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String condicionSunarpString = form.get("Registrado");
            if (condicionSunarpString.equals("SI")) {
                click(si_sunarp);
                Thread.sleep(1000);
            } else if (condicionSunarpString.equals("NO")) {
                click(no_sunarp);
                Thread.sleep(1000);
            }
        }
    }
    public void escribirCaso() throws Exception {
        sendKeys(descripcionCaso,"Deseo ayuda legal");
    }
    public void datosContacto(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String tipoDocumentoString = form.get("TipoDocumento");
            selectOneOption(tipoDocumentoPropietario,tipoDocumentoString);
            Thread.sleep(1000);

            String nombreDocumentoString = form.get("NombreDocumento");
            Assert.assertEquals(nombreDocumentoString,selectTextOneOption(tipoDocumentoPropietario));

            String numDocumentoString = form.get("NumeroDocumento");
            clearInput(numDocumento);
            sendKeys(numDocumento,numDocumentoString);
            Thread.sleep(1000);

            String razonSocialString = form.get("RazonSocial");
            clearInput(nombres);
            sendKeys(nombres,razonSocialString);
            Thread.sleep(1000);

            String emailString = form.get("Email");
            clearInput(email);
            sendKeys(email,emailString);
            Thread.sleep(1000);

            String telefonoString = form.get("Telefono");
            clearInput(telefono);
            sendKeys(telefono,telefonoString);
            Thread.sleep(1000);
        }
    }
}
