package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumgluecode.Test;

public class SharedSteps extends Test {
    @Given("El usuario se encuentra en la pagina de inicio de tu casa ahora")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicioDeTuCasaAhora() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        venderInmueble.homePageIsDisplayed();
    }
    @When("El usuario hace click en el sub menu de vender inmuebles del menu de Inmuebles")
    public void elUsuarioHaceClickEnElSubMenuDeVenderInmueblesDelMenuDeInmuebles() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        venderInmueble.clickOnSubMenuBtnVenderInmueble();
    }
    @Then("El usuario debe ser redirigido a la pantalla de Vender Inmuebles")
    public void elUsuarioDebeSerRedirigidoALaPantallaDeVenderInmuebles() throws Exception{
        venderInmueble.isTitleComicsDisplayed();
    }
    @When("El usuario hace click en el sub menu de construir inmuebles del menu de Inmuebles")
    public void el_usuario_hace_click_en_el_sub_menu_de_construir_inmuebles_del_menu_de_inmuebles() throws Exception{
        construirInmueble.clickOnSubMenuBtnConstruirInmueble();
    }
    @Then("El usuario debe ser redirigido a la pantalla de Construir Inmuebles")
    public void el_usuario_debe_ser_redirigido_a_la_pantalla_de_construir_inmuebles() throws Exception{
        construirInmueble.isTitleComicsDisplayed();
    }
    @When("El usuario hace click en asesoria legal del menu superior")
    public void el_usuario_hace_click_en_asesoria_legal_del_menu_superior() throws Exception {
        asesoriaLegal.clickAsesoriaLegal();
    }
    @Then("El usuario debe ser redirigido a la pantalla de Asesoria Legal")
    public void el_usuario_debe_ser_redirigido_a_la_pantalla_de_asesoria_legal() throws Exception {
        asesoriaLegal.isTitleComicsDisplayed();
    }

}
