package ar.org.icaro.automatizacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // ============================================================
    // LOCALIZADORES
    // Privados - Si cambia un ID, solo se modifica AQUÍ
    // ============================================================

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-contianer");

    private static final String URL = "https://www.saucedemo.com";

    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ============================================================
    // MÉTODOS DE NAVEGACIÓN
    // ============================================================

    public LoginPage goTo() {
        driver.get(URL);
        return this;
    }

    // ============================================================
    // MÉTODOS DE INTERACCIÓN
    // ============================================================

    public LoginPage enterUsername(String username) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
        element.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        element.sendKeys(password);
        return this;
    }

    public InventoryPage clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new InventoryPage(driver);
    }

    // ============================================================
    // MÉTODOS DE ALTO NIVEL
    // ============================================================

    public InventoryPage LoginAs(String username, String password) {
        return this.enterUsername(username).enterPassword(password).clickLogin();
    }

    public LoginPage loginExpectingError(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return this;
    }

    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================

    public boolean isErrorDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(errorMessage)
            ).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isUsernameFieldDisplayed() {
        try {
            return driver.findElement(userNameField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordFieldDisplayed() {
        try {
            return driver.findElement(passwordField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginButtonDisplayed() {
        try {
            return driver.findElement(loginButton).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
