Feature: Categoria Comics
  Como usuario  quiero leer comics para reirme un rato

  Scenario: Ingresar a la categoria  Comics desde la pantalla home
    Given El usuario se encuentra en la pantalla homen de ilittletester
    When Hace Click en el boton The little tester comics
    Then Se debe redirigir a la pantalla comics

  Scenario: Ingresar a la categoria  tutoriales desde la pantalla homec
    Given El usuario se encuentra en la pantalla homen de ilittletester
    When Hace Click en el boton My Tutorials and Talks
    Then Se debe redirigir a la pantalla de tutoriales