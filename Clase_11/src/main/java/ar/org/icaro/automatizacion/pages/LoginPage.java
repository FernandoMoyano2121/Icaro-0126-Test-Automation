package ar.org.icaro.automatizacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    // ============================================================
    // LOCALIZADORES
    // Privados - Si cambia un ID, solo se modifica AQUÍ
    // ============================================================

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    // ERROR: private By errorMessage = By.className("error-message-contianer");
    private By errorMessage = By.className("error-message-container");

    private static final String URL = "https://www.saucedemo.com";

    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public LoginPage(WebDriver driver) {
        super(driver);
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
        type(userNameField,username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(userNameField,password);
        return this;
    }

    public InventoryPage clickLogin() {
        click(loginButton);
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
        click(loginButton);
        return this;
    }

    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================

    public boolean isErrorDisplayed() {
       return isElementVisible(errorMessage);
    }

    public boolean isUsernameFieldDisplayed() {
       return isElementVisible(userNameField);
    }

    public boolean isPasswordFieldDisplayed() {
      return isElementVisible(passwordField);
    }

    public boolean isLoginButtonDisplayed() {
      return isElementVisible(loginButton);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
