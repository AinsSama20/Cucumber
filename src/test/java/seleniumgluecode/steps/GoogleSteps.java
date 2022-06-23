package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pom.Google;
import seleniumgluecode.Test;

public class GoogleSteps extends Test {
    @Given("El usuario inicia el navegador")
    public void el_usuario_inicia_el_navegador() {
    }
    @When("El usuario localiza la caja de texto")
    public void el_usuario_localiza_la_caja_de_texto() {
    }
    @When("El usuario escribe youtube")
    public void el_usuario_escribe_youtube() throws Exception {
        google.searchYoutube();
    }
    @Then("El usuario busca la palabra youtube")
    public void el_usuario_busca_la_palabra_youtube() throws Exception {
        google.clickSearchYoutube();
    }
    @Then("El usuario obtiene las busquedas de youtube")
    public void el_usuario_obtiene_las_busquedas_de_youtube() {
    }

}
