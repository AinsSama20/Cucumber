@functional
Feature: Categoria Comics
  Como usuario quiero leer chister de testers para reirme y pasar un buen rato.

  @browser @slow
  Scenario: Ingresar a la categoria comics desde la pantalla de inicio
    Given El usuario se encuentra en la pagina de inicio
    When El usuario hace click en el link de THE LITTLE TESTER COMICS
    Then El usuario debe ser redirigido a la pantalla de comics

  @browser @fast
  Scenario: Ingresar a la categoria comics desde la pantalla de inicio
    Given El usuario se encuentra en la pagina de inicio
    When El usuario hace click en el link de THE LITTLE TESTER COMICS
    Then El usuario debe ser redirigido a la pantalla de comics

  @outline @beber
  Scenario Outline: Bebiendo
    Given Hay <inicio> cervezas
    When Tomo <cantidad> cervezas
    Then Deberian quedar <resto> cervezas
    @test1
    Examples:
      | inicio  | cantidad  | resto |
      | 10      | 5         | 5     |
      | 10      | 10        | 0     |
