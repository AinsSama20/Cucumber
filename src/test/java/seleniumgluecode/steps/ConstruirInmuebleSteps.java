package seleniumgluecode.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import seleniumgluecode.Test;

public class ConstruirInmuebleSteps extends Test {
//CONSTRUIR INMUEBLE


    @Given("El usuario se encuentra en la pagina de construir inmueble")
    public void el_usuario_se_encuentra_en_la_pagina_de_construir_inmueble() throws Exception{
        construirInmueble.isTitleComicsDisplayed();
    }
    @When("El usuario registra sus datos de contacto")
    public void el_usuario_registra_sus_datos_de_contacto(io.cucumber.datatable.DataTable dataTable) throws Exception{
        construirInmueble.datosContacto(dataTable);
    }
    @When("El usuario registra el estado del inmueble en SUNARP")
    public void el_usuario_registra_el_estado_del_inmueble_en_sunarp(io.cucumber.datatable.DataTable dataTable) throws Exception{
        construirInmueble.inscritoSunarp(dataTable);
    }
    @When("El usuario selecciona que tipo de construccion desea")
    public void el_usuario_selecciona_que_tipo_de_construccion_desea(io.cucumber.datatable.DataTable dataTable) throws Exception{
        construirInmueble.tipoConstruccion(dataTable);
    }
    @When("El usuario registra la ubicacion del inmueble")
    public void el_usuario_registra_la_ubicacion_del_inmueble(io.cucumber.datatable.DataTable dataTable) throws Exception{
        construirInmueble.ubicacionInmueble(dataTable);
    }
}
