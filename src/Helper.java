import java.util.Scanner;

public class Helper {

    public String get_email_input(Scanner scanner) {

        while (true){
            System.out.print("Enter your email: ");
            String email = scanner.nextLine().trim();

            if (Validator.isValidEmail(email)) {
                return email;
            } else {
                System.out.print("Enter valid email address: ");
            }
        }
    }

    public String get_password_input(Scanner scanner) {

        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (Validator.isValidPassword(password)){
                return password;
            } else {
                System.out.print("Enter valid password: ");
            }
        }
    }
}
