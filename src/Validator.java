public class Validator {
    public static boolean isValidEmail(String email) {
        if (email == null || email.length() > 254) {
            return false;
        }

        return email.contains("@") && (email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".org"));
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 40) {
            return false;
        }

        return password.length() > 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*].*");
    }
}
