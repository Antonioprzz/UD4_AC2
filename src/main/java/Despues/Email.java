package Despues;

public class Email {
    private final String value;

    public Email(String value) {
        if (value == null || value.isBlank() || !value.contains("@")) {
            throw new IllegalArgumentException("Invalid email: " + value);
        }
        this.value = value.trim();
    }
    public String value() {
        return value;
    }
    public String domain() {
        return value.split("@")[0];
    }
    public boolean isCorporate() {
        return "empresa.com".equalsIgnoreCase(domain());
    }
    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return false;
    }
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    }

