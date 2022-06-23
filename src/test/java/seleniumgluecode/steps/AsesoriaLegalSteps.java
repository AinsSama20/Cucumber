package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import seleniumgluecode.Test;

public class AsesoriaLegalSteps extends Test {

    @Given("El usuario se encuentra en la pagina de asesoria legal")
    public void el_usuario_se_encuentra_en_la_pagina_de_asesoria_legal() throws Exception {
        asesoriaLegal.isTitleComicsDisplayed();
    }
    @When("El usuario selecciona que tipo de asesoria desea")
    public void el_usuario_selecciona_que_tipo_de_asesoria_desea(io.cucumber.datatable.DataTable dataTable) throws Exception {
        asesoriaLegal.tipoAsesoria(dataTable);
    }
    @When("El usuario registra el area del inmueble")
    public void el_usuario_registra_el_area_del_inmueble() throws Exception {
        asesoriaLegal.escribirArea();
    }
    @When("El usuario registra el tipo de inmueble")
    public void el_usuario_registra_el_tipo_de_inmueble(io.cucumber.datatable.DataTable dataTable) throws Exception {
        asesoriaLegal.tipoInmueble(dataTable);
    }
    @When("El usuario registra el estado del inmueble con relacion a SUNARP")
    public void el_usuario_registra_el_estado_del_inmueble_con_relacion_a_sunarp(io.cucumber.datatable.DataTable dataTable) throws Exception {
        asesoriaLegal.inscritoSunarp(dataTable);
    }
    @When("El usuario registra el caso acerca del inmueble")
    public void el_usuario_registra_el_caso_acerca_del_inmueble() throws Exception {
        asesoriaLegal.escribirCaso();
    }
    @When("El usuario registra los datos de contacto")
    public void el_usuario_registra_los_datos_de_contacto(io.cucumber.datatable.DataTable dataTable) throws Exception {
        asesoriaLegal.datosContacto(dataTable);
    }
}
