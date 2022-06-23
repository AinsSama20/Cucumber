@Google
Feature: ingresar a google
  Scenario: Buscar youtube en google
    Given El usuario inicia el navegador
    When El usuario localiza la caja de texto
    And El usuario escribe youtube
    Then El usuario busca la palabra youtube
    And El usuario obtiene las busquedas de youtube