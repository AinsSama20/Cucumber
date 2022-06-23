@ComprarInmueble
Feature: Comprar un inmueble
  Scenario Outline: Completar todos los datos de la pagina comprar inmueble y enviarlos
    Given El usuario se encuentra en la pagina de inicio
    When El usuario hace click en el detalle de catalogo
    And El usuario registra los datos de contacto: <TipoDocumento>, <NumeroDocumento>,<RazonSocial>,<Email>, <Telefono>   en el mensaje
    Then El usuario hace click en el boton contactar
    Examples:
      | TipoDocumento | NumeroDocumento  | RazonSocial           | Email                   | Telefono  |
      | 1             |"12345678"          | "Alexander Sosa Ruiz"   | "fsosa@ide-solution.com"  | "987654321" |
      | 1             |"87654321"          | "Alexander Sosa Ruiz"   | "fsosa@ide-solution.com"  | "987654321" |
      | 1             |"24681357"          | "Alexander Sosa Ruiz"   | "fsosa@ide-solution.com"  | "987654321" |
      | 2             |"12345678910"       | "Alexander Sosa Ruiz"   | "fsosa@ide-solution.com"  | "912345678" |
      | 3             |"123456789101"      | "Alexander Sosa Ruiz"   | "fsosa@ide-solution.com"  | "975312468" |