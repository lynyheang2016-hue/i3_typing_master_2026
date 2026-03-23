import java.util.Scanner;

public class MainTypingTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("---------- Welcome to I3 Typing Master v2026 ----------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Typing Test");
            System.out.println("4. About Us");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    LoginScreen.login(scanner);     
                    break;
                case 2:
                    RegisterScreen.register(scanner);;    
                    break;
                case 3:
                    TypingTest.startTest(scanner);;  
                    break;
                case 4:
                    AboutUs.showAboutUs();      
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}