import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }

    public static void login() {
        System.out.println("\n[Login Screen]");
        System.out.println("Returning to menu...\n");
    }

    public static void register() {
        System.out.println("\n[Register Screen]");
        System.out.println("Returning to menu...\n");
    }
}