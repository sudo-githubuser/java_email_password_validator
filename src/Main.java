import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();

        System.out.println("--- Account Creation ---");

        String email = helper.get_email_input(scanner);
        String password = helper.get_password_input(scanner);

        System.out.println("\n--- Success! ---");
        System.out.println("The valid email you entered is: " + email);
        System.out.println("The password you entered is valid");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timeStamp = now.format(formatter);

//        try(
//                BufferedWriter writer = new BufferedWriter(new FileWriter("loginDetails.txt", true))
//        ){
//
//            writer.write("Email: " + email + " created at: " + "["+timeStamp+"]");
//            writer.newLine();
//
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//        }

        try{
            Files.writeString(
                    Path.of("loginDetails.txt"),
                    "Email: " + email + " created at: " + timeStamp + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        scanner.close();

    }
}
