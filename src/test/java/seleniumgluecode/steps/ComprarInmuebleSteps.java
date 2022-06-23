package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumgluecode.Test;

public class ComprarInmuebleSteps extends Test {
    @Given("El usuario se encuentra en la pagina de inicio")
    public void el_usuario_se_encuentra_en_la_pagina_de_inicio() throws Exception {
        comprarInmueble.isTitleComicsDisplayed();
    }
    @When("El usuario hace click en el detalle de catalogo")
    public void el_usuario_hace_click_en_el_detalle_de_catalogo() throws Exception {
        comprarInmueble.entrarCatalogo();
    }
    @When("El usuario registra los datos de contacto: {int}, {string},{string},{string}, {string}   en el mensaje")
    public void el_usuario_registra_los_datos_de_contacto_en_el_mensaje(Integer int1, String string, String string2, String string3, String string4) throws Exception {
        comprarInmueble.registrarDatos(int1,string,string2,string3,string4);
    }
    @Then("El usuario hace click en el boton contactar")
    public void el_usuario_hace_click_en_el_boton_contactar() throws Exception {
//        comprarInmueble.enviarDatos();
    }

}
