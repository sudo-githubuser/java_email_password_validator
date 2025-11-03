import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();

        System.out.println("--- Account Creation ---");

        String email = helper.get_email_input(scanner);

        System.out.println("\n--- Success! ---");
        System.out.println("The valid email you entered is: " + email);

        scanner.close();

    }
}
