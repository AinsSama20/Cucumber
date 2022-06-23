package pom.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

import java.util.Arrays;
import java.util.List;
public class VenderInmueble extends BasePage {
    public VenderInmueble(WebDriver driver){super(driver);}
    private String tituloVenderInmuebla = "Tu Casa Ahora";
    private String tituloInicio = "Tu Casa Ahora";
    private String msgErrorTipo = "Seleccione tipo de inmueble";
    private String msgErrorSunarp = "Seleccione inscripción en SUNARP";
//    private String msgErrorSunarp = "";
    private By path_vender_inmueble = By.xpath("/html/body/app-root/app-home/app-header-app/header/div/div/div[2]/nav/ul/li[3]/ul/li[2]/a");
    private By buttonEnviar = By.xpath("/html/body/app-root/app-home/app-vender-inmueble/div[1]/div/div[6]/div/button");
    private By listCheckBox = By.id("flexCheckDefault");
    private By tipoInmueble = By.id("tipo_inmueble");
    private By departamento = By.id("departamento");
    private By provincia = By.id("provincia");
    private By distrito = By.id("distrito");
    private By estacionamiento = By.id("checkCaracteristica35");
    private By almacen = By.id("checkCaracteristica36");
    private By patio = By.id("checkCaracteristica37");
    private By piscina = By.id("checkCaracteristica38");
    private By lavanderia = By.id("checkCaracteristica39");
    private By terraza = By.id("checkCaracteristica40");
    private By luz = By.id("checkServicio42");
    private By agua = By.id("checkServicio43");
    private By gasNatural = By.id("checkServicio44");
    private By calefaccion = By.id("checkServicio45");
    private By aireAcondicionado = By.id("checkServicio46");
    private By ascensor = By.id("checkServicio47");
    private By tipoDocumento = By.id("tipo_documento");
    private By tipoMoneda = By.id("moneda");
    private By containerError = By.xpath("//div[@aria-label='Completar datos']");
    private By error =By.id("toast-container");
//    private By alertdialog =By.id("toast-container");
    private By botonInmueble =By.id("navbarDropdownMenuLink");
    private By numeroTitulo =By.id("numero");
    private By tamanioInmueble =By.id("tamanio_inmueble");
    private By antiguedad =By.id("antiguedad");
    private By numHabitaciones =By.id("n_habitaciones");
    private By numBanios =By.id("n_banio");
    private By direccion =By.id("direccion");
    private By comentarioInmueble =By.id("comentario_inmueble");
    private By numDocumento =By.id("n_documento");
    private By razonSocial =By.id("nombres");
    private By email =By.id("email");
    private By telefonoUno =By.id("telefono_uno");
    private By telefonoDos =By.id("telefono_dos");
    private By precio =By.id("precio");
    private By archivo =By.id("archivo");
    private String pathArchivo ="C:/Users/fsosa/Documents/Cucumber/src/test/resources/documents/Automatizacion.pdf";

    public boolean homePageIsDisplayed()throws Exception{
        return this.getTitle().equals(tituloInicio);
    }

    public  void cargarArchivos(){
        subirArchivos(archivo,pathArchivo);
    }
    public void clickOnSubMenuBtnVenderInmueble() throws  Exception{
        this.clickOnMenu(botonInmueble,path_vender_inmueble);
    }
    public boolean isTitleComicsDisplayed()  throws Exception{
        return this.getTitle().equals(tituloVenderInmuebla);
    }
    public void clickSIRegistroInmueble() throws Exception {
        for (int i = 0; i < this.listWebElement(listCheckBox).size(); i++) {
            if (i == 0) {
                this.listWebElement(listCheckBox).get(i).click();
                sendKeys(numeroTitulo,"12345678");
            }
        }
    }
    public void clickNoRegistroInmueble() throws Exception {
        for (int i = 0; i < this.listWebElement(listCheckBox).size(); i++) {
            if (i == this.listWebElement(listCheckBox).size()-1) {
                this.listWebElement(listCheckBox).get(i).click();
                sendKeys(numeroTitulo,"12345678");
            }
        }
    }
    public void selectOneOptionTipoInmuebleDepartamento() throws Exception {
        this.selectOneOption(tipoInmueble,"1");
    }
    public void insertTamanio() throws Exception {
        this.sendKeys(tamanioInmueble,"10");
    }
    public void insertAntiguedad() throws Exception {
        this.sendKeys(antiguedad,"10");
    }
    public void insertHabitaciones() throws Exception {
        this.sendKeys(numHabitaciones,"10");
    }
    public void insertBanios() throws Exception {
        this.sendKeys(numBanios,"10");
    }
    public void selectOneOptionDepartamento() throws Exception {
        this.selectOneOption(departamento,"14");
    }
    public void selectOneOptionProvincia() throws Exception {
        this.selectOneOption(provincia,"126");
    }
    public void selectOneOptionDistrito() throws Exception {
        this.selectOneOption(distrito,"140206");
    }
    public void ingresarDireccion()throws Exception{
        this.sendKeys(direccion,"Britaldo Gonzales 505");
    }
    public void checkBoxSomeCaracteristicasGenerales() throws Exception {
        List<By> listString = Arrays.asList(estacionamiento,almacen,patio,piscina,lavanderia,terraza);
        for (int i = 0; i < listString.size(); i++) {
            double randomDbl = Math.random();
            if (randomDbl > 0.5) {
                this.listWebElement((listString.get(i))).get(0).click();
            }
        }
    }
    public void checkBoxCaracteristicasGenerales() throws Exception {
        List<By> listString = Arrays.asList(estacionamiento,almacen,patio,piscina,lavanderia,terraza);
        for (int i = 0; i < listString.size(); i++) {
            this.listWebElement((listString.get(i))).get(0).click();
        }
    }
    public void checkBoxServicios() throws Exception {
        List<By> listString = Arrays.asList(luz,agua,gasNatural,calefaccion,aireAcondicionado,ascensor);
        for (int i = 0; i < listString.size(); i++) {
            this.listWebElement((listString.get(i))).get(0).click();
        }
    }
    public void checkBoxSomeServicios() throws Exception {
        List<By> listString = Arrays.asList(luz,agua,gasNatural,calefaccion,aireAcondicionado,ascensor);
        for (int i = 0; i < listString.size(); i++) {
            double randomDbl = Math.random();
            if (randomDbl > 0.5) {
                this.listWebElement((listString.get(i))).get(0).click();
            }
        }
    }
    public void insertComentario() throws Exception {
        this.sendKeys(comentarioInmueble,"Deseo vender esta casa a buen precio");
    }
    public void selectOneOptionTipoDocumento() throws Exception {
        this.selectOneOption(tipoDocumento,"1");
    }
    public void insertDocumento()throws Exception{
        this.sendKeys(numDocumento,"12345678");
    }
    public void insertRazonSocial()throws Exception{
        this.sendKeys(razonSocial,"Alexander Sosa Ruiz");
    }
    public void insertEmail()throws Exception{
        this.sendKeys(email,"fsosa@ide-solution.com");
    }
    public void insertNumTelefonoUno()throws Exception{
        this.sendKeys(telefonoUno,"987654321");
    }
    public void insertNumTelefonoDos()throws Exception{
        this.sendKeys(telefonoDos,"987654321");
    }
    public void selectOneOptionTipoMoneda() throws Exception {
        this.selectOneOption(tipoMoneda,"1");
    }
    public void insertPrecio()throws Exception{
        this.sendKeys(precio,"10000");
    }
    public void enviarDatos() throws Exception {
        click(buttonEnviar);
    }
    public void messageError() throws Exception{
        click(buttonEnviar);
        Thread.sleep(2000);
        By alertdialog =By.className("toast-message");
        String msg = getAlert(alertdialog);
        Assert.assertEquals(msgErrorSunarp,msg);
        System.out.println(msg);
        System.out.println(msgErrorSunarp);
    }
}
