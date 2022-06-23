@AsesoriaLegal
Feature: Asesoria inmueble
  Background: Ingresar a la pagina asesoria legal desde la pantalla de inicio
    Given El usuario se encuentra en la pagina de inicio de tu casa ahora
    When El usuario hace click en asesoria legal del menu superior
    Then El usuario debe ser redirigido a la pantalla de Asesoria Legal

  Scenario: Completar todos los datos de la pagina asesoria legal y enviarlos
    Given El usuario se encuentra en la pagina de asesoria legal
    When El usuario selecciona que tipo de asesoria desea
      | TipoAsesoria       | ValorAsesoria |
      | Compra de Inmueble - Revision de contrato y estudio de Titulo de Propiedad | 1|
      | Venta de Inmueble - Elaboracion de contrato inmobiliario |2                   |
      | Conciliaciones entre arrendatarios (inquilinos) y propietarios |3             |
      | Formalizacion de Junta de Propietarios |4                                     |
      | Sucesion intestada o declaratoria de herederos |5                             |
      | Anticipo de herencia de inmueble |6                                           |
      | Independizacion de vivienda por  pisos y aires |7                             |
      | Declaratoria de Fabrica |8                                                    |
      | Sub division de lotes (rurales y urbanos) |9                                  |
      | Otros |10                                                                     |
    And El usuario registra el area del inmueble
    And El usuario registra el tipo de inmueble
      | TipoInmueble  | ValorInmueble |
      | Departamento  | 1             |
      | Casa          |2              |
      | Terreno       |3              |
      | Local         |4              |
    And El usuario registra el estado del inmueble con relacion a SUNARP
      | Registrado  |
      | SI          |
      | NO          |
    And El usuario registra el caso acerca del inmueble
    And El usuario registra los datos de contacto
      | TipoDocumento       | NombreDocumento  | NumeroDocumento  | RazonSocial           | Email                   | Telefono  |
      | 1                   |   DNI            |12345678          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
      | 2                   |   RUC            |12345678910          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
      | 3                   |   CARNET DE EXTRANJERIA|123456789101          | Alexander Sosa Ruiz   | fsosa@ide-solution.com  | 987654321 |
    Then El usuario hace click en el boton enviar