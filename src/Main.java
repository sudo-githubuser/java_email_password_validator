public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        String email = helper.get_email_input();
        String password = helper.get_password_input();
        if (Validator.isValidEmail(email) && Validator.isValidPassword(password)) {
            System.out.println("Username and password set successfully");
        } else if (!Validator.isValidPassword(password)) {
            System.out.println("Password is not valid");
        } else if (!Validator.isValidEmail(email)) {
            System.out.println("Email is not valid");
        }
    }
}
