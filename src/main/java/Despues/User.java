package Despues;

public class User {
    private Email email;

    public User(Email email) {
        this.email = email;
    }

    public boolean isCorporate() {
        return email.isCorporate();
    }

    public Email getEmail() {
        return email;
    }
}
