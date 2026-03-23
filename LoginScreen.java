import java.util.Scanner;

public class LoginScreen {

    // Sample user data (you can change later)
    static String savedUsername = "admin";
    static String savedPassword = "1234";

    public static void login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Login ===========");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login
        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("✅ Login successful! Welcome " + username);
        } else {
            System.out.println("❌ Invalid username or password!");
        }

        System.out.println("=============================");
    }
}