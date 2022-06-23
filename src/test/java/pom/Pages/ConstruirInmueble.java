package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pom.BasePage;

import java.util.List;
import java.util.Map;

public class ConstruirInmueble extends BasePage {
    public ConstruirInmueble(WebDriver driver){super(driver);}
    private String tituloVenderInmueble = "Tu Casa Ahora";
    private By path_construir_inmueble = By.xpath("/html/body/app-root/app-home/app-header-app/header/div/div/div[2]/nav/ul/li[3]/ul/li[3]/a");
    private By botonInmueble= By.id("navbarDropdownMenuLink");
    private By tipoDocumento = By.id("documentoConstruccion");
    private By numDocumento = By.id("n_documento");
    private By razonSocial = By.id("nombres");
    private By email = By.id("email");
    private By telefono = By.id("telefono");
    private By checkSi = By.id("opcion_si");
    private By CheckNo = By.id("opcion_no");
    private By tipoConstruccion = By.id("tipo_construccion");
    private By departamentento = By.id("departamento");
    private By provincia = By.id("provincia");
    private By distrito = By.id("distrito");
    private By areaPropiedad = By.id("area_propiedad");
    private By direccion = By.id("direccion_cons");

    public void clickOnSubMenuBtnConstruirInmueble() throws  Exception{
        clickOnMenu(botonInmueble,path_construir_inmueble);
    }

    public boolean isTitleComicsDisplayed()  throws Exception{
        return getTitle().equals(tituloVenderInmueble);
    }


    public void datosContacto(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String tipoDocumentoString = form.get("TipoDocumento");
            selectOneOption(tipoDocumento,tipoDocumentoString);
            Thread.sleep(1000);

            String nombreDocumentoString = form.get("NombreDocumento");
            Assert.assertEquals(nombreDocumentoString,selectTextOneOption(tipoDocumento));

            String numDocumentoString = form.get("NumeroDocumento");
            clearInput(numDocumento);
            sendKeys(numDocumento,numDocumentoString);
            Thread.sleep(1000);

            String razonSocialString = form.get("RazonSocial");
            clearInput(razonSocial);
            sendKeys(razonSocial,razonSocialString);
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

    public void inscritoSunarp(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String condicionSunarpString = form.get("Registrado");
            if (condicionSunarpString.equals("SI")) {
                click(checkSi);
                Thread.sleep(1000);
            } else if (condicionSunarpString.equals("NO")) {
                click(CheckNo);
                Thread.sleep(1000);
            }
        }
    }

    public void tipoConstruccion(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String valueConstruccionString = form.get("Value");
            String nombreConstruccionString = form.get("TipoConstruccion");
            selectOneOption(tipoConstruccion,valueConstruccionString);
            Assert.assertEquals(nombreConstruccionString,selectTextOneOption(tipoConstruccion));
            Thread.sleep(1000);
        }
    }

    public void ubicacionInmueble(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {

            String numDepartamentoString = form.get("Departamento");
            String numProvinciaString = form.get("Provincia");
            String numDistritoString = form.get("Distrito");
            String direccionString = form.get("Direccion");
            String areaTotalString = form.get("AreaTotal");
            this.selectOneOption(departamentento,numDepartamentoString);
            Thread.sleep(1000);
            this.selectOneOption(provincia,numProvinciaString);
            Thread.sleep(1000);
            this.selectOneOption(distrito,numDistritoString);
            Thread.sleep(1000);
            sendKeys(direccion,direccionString);
            Thread.sleep(1000);
            sendKeys(areaPropiedad,areaTotalString);
            Thread.sleep(1000);
        }
    }


}
