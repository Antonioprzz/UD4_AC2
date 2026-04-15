package Antes;

public class UsernameRules {

    public boolean isAllowed(String username) {
        return check(username);
    }

    private boolean check(String username) {
        return basic(username);
    }

    private boolean basic(String username) {
        return username != null && username.length() >= 3 && username.length() <= 15 && noSpaces(username);
    }

    private boolean noSpaces(String username) {
        return !username.contains(" ");
    }
}
