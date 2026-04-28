package ar.org.icaro.automatizacion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSauceDemoTest {

    private WebDriver driver;

    private static final String BASE_URL = "https://www.saucedemo.com/";

    private static final String USUARIO_STANDAR = "standard_user";
    private static final String USUARIO_BLOQUEADO = "locked_out_user";
    private static final String PASSWWORD_CORRECTA = "secret_sauce";
    private static final String PASSWORD_INCORRECTO = "password_malo";


    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void irALogin() {
        driver.get(BASE_URL);
    }

    @Test
    public void loginExitoso() {
        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys(USUARIO_STANDAR);

        WebElement campoPassword = driver.findElement(By.id("password"));
        campoPassword.sendKeys(PASSWWORD_CORRECTA);

        WebElement botonLogin = driver.findElement(By.id("login-button"));
        botonLogin.click();

        String urlActual = driver.getCurrentUrl();

        Assert.assertNotNull(urlActual);
        Assert.assertTrue(urlActual.contains("inventory.html"), "Después del login deberia estar en inventory.html");

        System.out.println("Login exitoso - URL actual: " + urlActual);

    }

    @Test
    public void loginUsuarioBloqueado() {
        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys(USUARIO_BLOQUEADO);

        WebElement campoPassword = driver.findElement(By.id("password"));
        campoPassword.sendKeys(PASSWWORD_CORRECTA);

        WebElement botonLogin = driver.findElement(By.id("login-button"));
        botonLogin.click();

        WebElement contenedorError = driver.findElement(By.className("error-message-container"));
        Assert.assertTrue(contenedorError.isDisplayed(), "El mensaje deberia indicar que el usuario está bloqueado");
        String mensajeError = contenedorError.getText();

        Assert.assertTrue(mensajeError.contains("locked out"), "El mensaje deberia indicar que el usuario está bloqueado");

        System.out.println("Usuario bloqueado - Mensaje " + mensajeError);

    }

    @Test
    public void loginConCredencialesInvalidas() {
        driver.findElement(By.id("user-name")).sendKeys("usuario_falso");
        driver.findElement(By.id("password")).sendKeys(PASSWORD_INCORRECTO);
        driver.findElement(By.id("login-button")).click();

        WebElement contenedorError = driver.findElement(By.className("error-message-container"));
        Assert.assertTrue(contenedorError.isDisplayed(), "Deberia mostrarse un mensaje de error");

        String urlActual = driver.getCurrentUrl();
        Assert.assertFalse(urlActual.contains("inventory"), "No deberia haber navegado al inventario");

        System.out.println("✓ Credenciales Invalidas: Error mostrado Correctamente");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
