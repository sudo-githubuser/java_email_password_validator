public class Validator {
    public static boolean isValidEmail(String email) {
        return email.contains("@") && (email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".org"));
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*].*");
    }

}
