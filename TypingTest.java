public import java.util.Scanner;

public class TypingTest {

    public static void startTest() {
        Scanner sc = new Scanner(System.in);

        String text = "The quick brown fox jumps over the lazy dog";

        System.out.println("=========== Typing Test ===========");
        System.out.println("Type the following sentence:");
        System.out.println();
        System.out.println(text);
        System.out.println();

        long startTime = System.currentTimeMillis();

        System.out.print("Your input: ");
        String userInput = sc.nextLine();

        long endTime = System.currentTimeMillis();

        // Calculate time (seconds)
        double timeTaken = (endTime - startTime) / 1000.0;

        // Check accuracy
        int correctChars = 0;
        for (int i = 0; i < Math.min(text.length(), userInput.length()); i++) {
            if (text.charAt(i) == userInput.charAt(i)) {
                correctChars++;
            }
        }

        double accuracy = ((double) correctChars / text.length()) * 100;

        // Calculate WPM (Words Per Minute)
        int wordCount = userInput.split(" ").length;
        double wpm = (wordCount / timeTaken) * 60;

        // Output result
        System.out.println("\n=========== Result ===========");
        System.out.println("Time: " + timeTaken + " seconds");
        System.out.println("Accuracy: " + accuracy + "%");
        System.out.println("Speed: " + wpm + " WPM");
        System.out.println("==============================");
    }
}
