package logic.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static logic.utilities.ConfigurarWebDriver.useChromeDriver;

public class TestCode {

    protected WebDriver driver;

    @Given("El usuario se encuentra en la pantalla homen de ilittletester")
    public void usuarioEnHomePage() {
        useChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://imalittletester.com/");


    }
    //Scenario 01
    @When("Hace Click en el boton The little tester comics")
    public void clickEnPaginaComics() {
        driver.findElement(By.id("menu-item-2008")).click();
    }


    @Then("Se debe redirigir a la pantalla comics")
    public void validarPaginaDeComicss() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://imalittletester.com/category/comics/");
        driver.quit();
    }

    //Scenario 02

    @When("Hace Click en el boton My Tutorials and Talks")
    public void clickEnPaginaTutoriales() {
        driver.findElement(By.id("menu-item-2007")).click();
    }


    @Then("Se debe redirigir a la pantalla de tutoriales")
    public void validarPaginaDeTutoriales() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://imalittletester.com/my-conference-talks/");
        driver.quit();

        // Añadiendo comentario
    }
}
