import java.util.Scanner;

public class Helper {

    public String get_email_input() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your email: ");
        return obj.nextLine();
    }

    public String get_password_input() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your password: ");
        return obj.nextLine();
    }
}
