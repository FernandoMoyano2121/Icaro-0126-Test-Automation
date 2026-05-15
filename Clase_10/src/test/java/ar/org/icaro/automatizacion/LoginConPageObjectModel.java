package ar.org.icaro.automatizacion;

import ar.org.icaro.automatizacion.pages.InventoryPage;
import ar.org.icaro.automatizacion.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginConPageObjectModel {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        loginPage.goTo();
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginExitosoConPOM() {
        InventoryPage inventoryPage = loginPage.LoginAs("standard_user", "secret_sauce");
        Assert.assertTrue(inventoryPage.isOnInventoryPage(), "Deberia estár en la pagina de inventario");
        Assert.assertEquals(inventoryPage.getInventoryTitle(), "Products", "El titulo deberia ser productos");
    }

    @Test
    public void loginCredencialesInvalidasConPOM() {
        loginPage.loginExpectingError("usuario_falso", "password_malo");

        Assert.assertTrue(loginPage.isErrorDisplayed(),
                "Debería mostrarse un mensaje de error");
    }

    @Test
    public void verificarElementosLoginConPOM() {
        Assert.assertTrue(loginPage.isUsernameFieldDisplayed(),
                "Campo de usuario debería ser visible");
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed(),
                "Campo de password debería ser visible");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(),
                "Botón de login debería ser visible");
    }
}
