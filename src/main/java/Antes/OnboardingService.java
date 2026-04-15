package Antes;

public class OnboardingService {
    public String register(String name, String email, String password) {
        if (name == null || name.isBlank()) {
            return "ERROR: name required";
        }
        if (email == null || email.isBlank() || !email.contains("@")) {
            return "ERROR: invalid email";
        }
        if (password == null || password.length() < 8) {
            return "ERROR: weak password";
        }

        String normalizedName = name.trim();
        String userCode = normalizedName.substring(0, 1).toUpperCase() + "-" + Math.abs(email.hashCode());

        StringBuilder sb = new StringBuilder();
        sb.append("WELCOME ").append(normalizedName).append("\n");
        sb.append("EMAIL ").append(email.trim().toLowerCase()).append("\n");
        sb.append("USERCODE ").append(userCode).append("\n");
        sb.append("TIPS ").append("Remember to enable 2FA").append("\n");

        return sb.toString();
    }

}
