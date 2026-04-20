package ar.org.icaro.automatizacion;

public class User {
    private String username;
    private String password;
    private boolean loggedIn;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }

    public boolean login(String passwordEntered) {
        if (this.password.equals(passwordEntered)) {
            this.loggedIn = true;
            return true;
        }
        return false;

    }

    public void logout() {
        this.loggedIn = false;
    }

    public boolean isValid() {
        return !username.isEmpty() && password.length() > 4;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername(){
        return username;
    }
}
