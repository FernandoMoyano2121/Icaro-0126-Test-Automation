package ar.org.icaro.automatizacion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    //Deberia loguearse exitosamente con credenciales validas
    public void shouldLoginSuccessfullyWithValidCredentials(){
        //Codigo a ejecutar
        User user=new User("Ana","1234");
        boolean result=user.login("1234");

        //Validaciones
        Assert.assertTrue(result,"El login deberia ser exitoso");
        Assert.assertTrue(user.isLoggedIn(),"El usuario DEBERIA estar logueado");
    }

    @Test
    // Debería fallar el login con contraseña inválida
    public void shouldFailLoginWithInvalidPassword(){
        //Codigo a ejecutar
        User user=new User("Ana","1234");
        boolean result=user.login("wrong_password");

        //Validaciones
        Assert.assertFalse(result, "El Login deberia fallar");
        Assert.assertFalse(user.isLoggedIn(),"El usuario NO deberia estar logueado");

    }

    @Test
    // No debería estar logueado inicialmente
    public void shouldNotBeLoggedInInitially(){

        //Codigo a ejecutar
        User user=new User("Ana","1234");

        //Validaciones
        Assert.assertFalse(user.isLoggedIn(), "El usuario NO deberia estar logueado INICIALMENTE");
    }

    @Test
    // Debería cerrar sesión correctamente después de loguearse
    public void shouldLogoutSuccessfullyAfterLogin(){
        //Codigo a ejecutar
        User user=new User("Ana","1234");
        boolean result=user.login("1234");
        user.logout();

        Assert.assertFalse(user.isLoggedIn(),"El usuario no deberia estar logueado despues de hacer LOGOUT ");

    }

    @Test
    // Debería ser inválido con username vacío o password corto
    public void shouldBeInvalidWithEmptyUsernameOrShortPassword(){
        User userWithEmptyUsername=new User("","1234");
        Assert.assertFalse(userWithEmptyUsername.isValid(), "Usuario con username vacio no deberia ser valido");

        User userWithShotPassword=new User("ana","123");
        Assert.assertFalse(userWithShotPassword.isValid(), "Usuario con password corta no deberia ser valido");

    }

    @Test
    // Debería ser inválido con username vacío
    public void shouldBeInvalidWithEmptyUsername(){}

    @Test
    // Debería ser inválido con password corto
    public void shouldBeInvalidWithShortPassword(){}

    // Debería retornar el username correcto
    @Test
    public void shouldReturnCorrectUsername(){}

}
