package ar.org.icaro.automatizacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {

    private WebDriver driver;
    private final WebDriverWait wait;

    // ============================================================
    // LOCALIZADORES
    // ============================================================

    private final By pageTitle = By.className("title");


    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ============================================================
    // METODO DE VERIFICACIÓN
    // ============================================================

    public boolean isOnInventoryPage() {
        try {
            wait.until(ExpectedConditions.urlContains("inventory"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getInventoryTitle() {
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
        return title.getText();
    }
}
