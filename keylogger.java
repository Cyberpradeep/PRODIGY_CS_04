import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleKeyLogger {
    public static void main(String[] args) {
        try (FileWriter logFile = new FileWriter("keylogs.txt", true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Start typing (press Ctrl+C to stop):");

            while (true) {
                String input = scanner.nextLine(); // Capture input from the user
                logFile.write(input + "\n");      // Log the input to a file
                logFile.flush();                  // Ensure data is written immediately
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
