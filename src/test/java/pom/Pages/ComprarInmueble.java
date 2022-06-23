package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class ComprarInmueble extends BasePage {
    public ComprarInmueble(WebDriver driver){super(driver);}
    private String tituloComprarInmueble = "Tu Casa Ahora";
    private By button = By.tagName("button");
    private By tipoDocumento = By.id("conc_id");
    private By numDocumento = By.id("pers_documento");
    private By persNombres = By.id("pers_nombres");
    private By persEmail = By.id("pers_email");
    private By persCelular = By.id("pers_celular");
    private By mensaje = By.id("exampleFormControlTextarea1");
    private By botonEnviar = By.cssSelector("btn btn-secondary btn-vermas color_principal_background color_principal_background_buttons");
    public boolean isTitleComicsDisplayed()  throws Exception{
        return this.getTitle().equals(tituloComprarInmueble);
    }
    public void entrarCatalogo() throws Exception {
        entrarCatalogoLink();
    }

    public void registrarDatos(int TipoDocumento,String NumeroDocumento,String RazonSocial,String Email, String Telefono) throws Exception {
        selectOneOption(tipoDocumento,String.valueOf(TipoDocumento));
        ingresarTexto(numDocumento).sendKeys(NumeroDocumento);
        ingresarTexto(persNombres).sendKeys(RazonSocial);
        ingresarTexto(persEmail).sendKeys(Email);
        ingresarTexto(persCelular).sendKeys(Telefono);
        ingresarTexto(mensaje).sendKeys("Deseo comprar esta casa");
    }

    public void enviarDatos() throws Exception {
        click(listWebElement(button).get(9));
//        System.out.println(numListWebElement(button));
        Thread.sleep(7000);
    }

}
