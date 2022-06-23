@ConstruirInmueble
Feature: Construir Inmueble
  Como usuario quiero entra a la pagina de construir inmueble de tu casa ahora y registrar mis datos y enviarlos

  Background: Ingresar a la pagina construir inmueble desde la pantalla de inicio
    Given El usuario se encuentra en la pagina de inicio de tu casa ahora
    When El usuario hace click en el sub menu de construir inmuebles del menu de Inmuebles
    Then El usuario debe ser redirigido a la pantalla de Construir Inmuebles

  Scenario: Completar todos los datos de la pagina construir inmueble y enviarlos
    Given El usuario se encuentra en la pagina de construir inmueble
    When El usuario registra sus datos de contacto
      | TipoDocumento       | NombreDocumento  | NumeroDocumento  | RazonSocial           | Email                   | Telefono  |
      | 1                   |   DNI            |12345678          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
      | 2                   |   RUC            |12345678910          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
      | 3                   |   CARNET DE EXTRANJERIA|123456789101          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
    And El usuario registra el estado del inmueble en SUNARP
      | Registrado  |
      | SI          |
      | NO          |
    And El usuario selecciona que tipo de construccion desea
      | TipoConstruccion | Value |
      | Construcción de Aires | 1 |
      | Ampliación            | 2 |
      | Remodelación          | 3 |
      | Construcción de Terreno | 4 |
    And El usuario registra la ubicacion del inmueble
      | Departamento          | Provincia        | Distrito              | Direccion               | AreaTotal  |
      | 14                    | 126              | 140206                | Britaldo Gonzales 505   | 100        |
    Then El usuario hace click en el boton enviar