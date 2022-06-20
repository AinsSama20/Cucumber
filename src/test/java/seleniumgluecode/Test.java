package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test extends TestBase{

    private int start;
    private int left;

    @Given("El usuario se encuentra en la pagina de inicio")
    public void el_usuario_se_encuentra_en_la_pagina_de_inicio() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }
    @When("El usuario hace click en el link de THE LITTLE TESTER COMICS")
    public void el_usuario_hace_click_en_el_link_de_the_little_tester_comics() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnTitleComics();
    }
    @Then("El usuario debe ser redirigido a la pantalla de comics")
    public void el_usuario_debe_ser_redirigido_a_la_pantalla_de_comics() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(comicPage.isTitleComicsDisplayed());
    }

    @Given("Hay {int} cervezas")
    public void hayCervezas(int int1) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        this.start=int1;
    }
    @When("Tomo {int} cervezas")
    public void tomoCervezas(int int1) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        this.left=this.start-int1;
    }
    @Then("Deberian quedar {int} cervezas")
    public void deberianQuedarCervezas(int int1) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(int1,this.left);
    }

    }
