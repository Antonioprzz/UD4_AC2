package Antes;

public class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public boolean isCorporate() {
        return email != null && email.endsWith("@empresa.com");
    }

    public String getEmail() {
        return email;
    }
}
