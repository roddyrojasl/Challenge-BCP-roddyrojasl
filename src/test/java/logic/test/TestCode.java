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
    public void ingresarCategoriaComics(){
        useChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://imalittletester.com/");


    }

    @When("Hace Click en el boton The little tester comics")
    public void clickBotonLittleTester(){
        driver.findElement(By.id("menu-item-2008")).click();


    }
    @Then("Se debe redirigir a la pantalla comics")
    public void redirigirPantallaComics(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://imalittletester.com/category/comics/");

    }
}
