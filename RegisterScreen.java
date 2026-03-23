import java.util.Scanner;

public class RegisterScreen {
    public static String username = "";
    public static String password = "";

    public static void register(Scanner sc) {
        System.out.println("=========== Register ===========");

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        System.out.print("Confirm Password: ");
        String confirmPassword = sc.nextLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("❌ Password does not match!");
        } else if (!username.isEmpty() && !password.isEmpty()) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Username or Password cannot be empty!");
        }

        System.out.println("================================");
    }
}