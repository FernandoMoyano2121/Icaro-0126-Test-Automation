package ar.org.icaro.automatizacion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLoginTest {

    // La variable driver debe ser miembro de la clase
    // para que todos los métodos @Test puedan acceder a ella
    private WebDriver driver;


    @BeforeClass
    public void setup() {
        // WebDriverManager descarga automáticamente el driver del navegador
        WebDriverManager.chromedriver().setup();

        // Creamos una instancia de ChromeDriver
        // Esto abre una ventana del navegador Chrome
        driver = new ChromeDriver();

        // Maximizamos la ventana para mejor visibilidad
        driver.manage().window().maximize();
    }

    @Test
    public void navigateSauceDemo() {
        //Navego a la URL
        driver.get("https://www.saucedemo.com/");

        // Obtenemos el título de la página
        String titulo = driver.getTitle();

        Assert.assertEquals(titulo, "Swag Labs", "El titulo de la pagina no es el esperado");
        System.out.println("✓ Navegamos exitosamente a SauceDemo");
        System.out.println("  Título de la página: " + titulo);
    }

    /**
     * Se ejecuta UNA vez después de todos los tests de esta clase.
     * Aquí cerramos el navegador de forma limpia.
     * @throws InterruptedException
     */
    @AfterClass
    public void tearDown() throws InterruptedException{
        if(driver != null){
            driver.quit();
            System.out.println("Navegador cerrado correctamente!");
        }
    }
}
