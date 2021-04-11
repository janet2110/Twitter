package tech.codingclub.helix.entity;

public class LoginResponse {
   public  Long id;
    public String message;
    public Boolean is_login;

    public LoginResponse() {

    }
    public LoginResponse(Long id, Boolean is_login, String message) {
        this.id = id;
        this.message = message;
        this.is_login = is_login;
    }
}
