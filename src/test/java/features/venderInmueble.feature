#language: en
@VenderInmueble
Feature: Vender Inmueble
  Como usuario quiero entra a la pagina de vender inmueble de tu casa ahora y registrar mis datos y enviarlos

  Background: Ingresar a la pagina vender inmueble desde la pantalla de inicio
    Given El usuario se encuentra en la pagina de inicio de tu casa ahora
    When El usuario hace click en el sub menu de vender inmuebles del menu de Inmuebles
    Then El usuario debe ser redirigido a la pantalla de Vender Inmuebles

  Scenario: Completar todos los datos de la pagina vender inmueble y enviarlos
    Given El usuario se encuentra en la pagina de vender inmueble
    When El usuario registra que el inmueble esta inscrito en SUNARP
    And El usuario registra la descripcion del inmueble
    And El usuario registra todas caracteristicas generales del inmueble
    And El usuario registra todos los servicios del inmueble
    And El usuario registra los comentarios acerca del inmueble
    And El usuario registra sus datos personales y de contacto
    And El usuario registra el precio del inmueble
    Then El usuario hace click en el boton enviar

  Scenario: Completar algunos de los datos de la pagina vender inmueble y enviarlos
    Given El usuario se encuentra en la pagina de vender inmueble
    When El usuario registra que el inmueble no esta inscrito en SUNARP
    And El usuario registra la descripcion del inmueble
    And El usuario registra algunas caracteristicas generales del inmueble
    And El usuario registra algunos servicios del inmueble
    And El usuario registra los comentarios acerca del inmueble
    And El usuario registra sus datos personales y de contacto
    And El usuario registra el precio del inmueble
    Then El usuario hace click en el boton enviar

  Scenario: Enviar el formulario sin haber llenado ningun dato
    Given El usuario se encuentra en la pagina de vender inmueble
    When El usuario hace click en el boton enviar
    Then El usuario recibe un mensaje de error






