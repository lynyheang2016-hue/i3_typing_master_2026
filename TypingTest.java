import java.util.Scanner;

public class TypingTest {

    public static void startTest(Scanner sc) {
        String text = "The quick brown fox jumps over the lazy dog";

        System.out.println("=========== Typing Test ===========");
        System.out.println(text);

        long startTime = System.currentTimeMillis();

        System.out.print("Your input: ");
        String userInput = sc.nextLine();

        long endTime = System.currentTimeMillis();

        double timeTaken = (endTime - startTime) / 1000.0;

        // Trim and calculate accuracy
        userInput = userInput.trim();
        text = text.trim();

        int correctChars = 0;
        int len = Math.min(userInput.length(), text.length());
        for (int i = 0; i < len; i++) {
            if (userInput.charAt(i) == text.charAt(i)) {
                correctChars++;
            }
        }
        double accuracy = ((double) correctChars / text.length()) * 100;

        System.out.println("Time: " + timeTaken + " seconds");
        System.out.printf("Accuracy: %.2f%%\n", accuracy);
        System.out.println("==================================");
    }
}