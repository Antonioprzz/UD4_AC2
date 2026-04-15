package Despues;

public class OnboardingService {
    public String register(String name, String email, String password) {
        String nombre = metodos(name, email, password);
        if (nombre != null) return nombre;

        String normalizedName = normalizarNombre(name);
        String userCode = codigoUsuario(email, normalizedName);

        return salida(email, normalizedName, userCode);
    }

    private static String metodos(String name, String email, String password) {
        String nombre = faltaNombre(name);
        if (nombre != null) return nombre;
        String maloEmail = invalidoEmail(email);
        if (maloEmail != null) return maloEmail;
        String contra = contraseñaCorta(password);
        if (contra != null) return contra;
        return null;
    }

    private static String salida(String email, String normalizedName, String userCode) {
        StringBuilder sb = new StringBuilder();
        sb.append("WELCOME ").append(normalizedName).append("\n");
        sb.append("EMAIL ").append(email.trim().toLowerCase()).append("\n");
        sb.append("USERCODE ").append(userCode).append("\n");
        sb.append("TIPS ").append("Remember to enable 2FA").append("\n");

        return sb.toString();
    }

    private static String codigoUsuario(String email, String normalizedName) {
        String userCode = normalizedName.substring(0, 1).toUpperCase() + "-" + Math.abs(email.hashCode());
        return userCode;
    }

    private static String normalizarNombre(String name) {
        String normalizedName = name.trim();
        return normalizedName;
    }

    private static String contraseñaCorta(String password) {
        if (password == null || password.length() < 8) {
            return "ERROR: weak password";
        }
        return null;
    }

    private static String invalidoEmail(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) {
            return "ERROR: invalid email";
        }
        return null;
    }

    private static String faltaNombre(String name) {
        if (name == null || name.isBlank()) {
            return "ERROR: name required";
        }
        return null;
    }

}
