package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumgluecode.Test;

public class VenderInmuebleSteps extends Test {
    //Scenario
    @Given("El usuario se encuentra en la pagina de vender inmueble")
    public void elUsuarioSeEncuentraEnLaPaginaDeVenderInmueble() throws Exception{
        venderInmueble.isTitleComicsDisplayed();
    }
    @When("El usuario registra que el inmueble esta inscrito en SUNARP")
    public void elUsuarioRegistraQueElInmuebleEstaInscritoEnSUNARP() throws Exception{
        venderInmueble.clickSIRegistroInmueble();
    }
    @When("El usuario registra la descripcion del inmueble")
    public void elUsuarioRegistraLaDescripcionDelInmueble() throws Exception{
        venderInmueble.selectOneOptionTipoInmuebleDepartamento();
        venderInmueble.insertTamanio();
        venderInmueble.insertAntiguedad();
        venderInmueble.insertHabitaciones();
        venderInmueble.insertBanios();
        venderInmueble.selectOneOptionDepartamento();
        venderInmueble.selectOneOptionProvincia();
        venderInmueble.selectOneOptionDistrito();
        venderInmueble.ingresarDireccion();
    }
    @When("El usuario registra todas caracteristicas generales del inmueble")
    public void elUsuarioRegistraTodasCaracteristicasGeneralesDelInmueble() throws Exception{
        venderInmueble.checkBoxCaracteristicasGenerales();
    }
    @When("El usuario registra todos los servicios del inmueble")
    public void elUsuarioRegistraTodosLosServiciosDelInmueble() throws Exception{
        venderInmueble.checkBoxServicios();
    }
    @When("El usuario registra los comentarios acerca del inmueble")
    public void elUsuarioRegistraLosComentariosAcercaDelInmueble() throws Exception{
        venderInmueble.cargarArchivos();
        Thread.sleep(1000);
        venderInmueble.insertComentario();
    }
    @When("El usuario registra sus datos personales y de contacto")
    public void elUsuarioRegistraSusDatosPersonalesYDeContacto() throws Exception{
        venderInmueble.selectOneOptionTipoDocumento();
        venderInmueble.insertDocumento();
        venderInmueble.insertRazonSocial();
        venderInmueble.insertEmail();
        venderInmueble.insertNumTelefonoUno();
        venderInmueble.insertNumTelefonoDos();
    }
    @When("El usuario registra el precio del inmueble")
    public void elUsuarioRegistraElPrecioDelInmueble() throws Exception{
        venderInmueble.selectOneOptionTipoMoneda();
        venderInmueble.insertPrecio();
    }
    @Then("El usuario hace click en el boton enviar")
    public void elUsuarioHaceClickEnElBotonEnviar() throws Exception{
//        venderInmueble.enviarDatos();
        Thread.sleep(3000);
    }
    @When("El usuario registra que el inmueble no esta inscrito en SUNARP")
    public void elUsuarioRegistraQueElInmuebleNoEstaInscritoEnSUNARP() throws Exception{
        venderInmueble.clickNoRegistroInmueble();
    }
    @When("El usuario registra algunas caracteristicas generales del inmueble")
    public void elUsuarioRegistraAlgunasCaracteristicasGeneralesDelInmueble() throws Exception{
        venderInmueble.checkBoxSomeCaracteristicasGenerales();
    }
    @When("El usuario registra algunos servicios del inmueble")
    public void elUsuarioRegistraAlgunosServiciosDelInmueble() throws Exception{
        venderInmueble.checkBoxSomeServicios();
    }
    @Then("El usuario recibe un mensaje de error")
    public void el_usuario_recibe_un_mensaje_de_error() throws Exception{
        venderInmueble.messageError();
        Thread.sleep(1000);
    }
}
