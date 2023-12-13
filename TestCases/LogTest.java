import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogTest {
    public static void main(String[] args) {
        // Read the log file
        try (BufferedReader br = new BufferedReader(new FileReader("path/to/logfile.log"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Check if the log message contains the expected content
                if (line.contains("Expected Log Message")) {
                    System.out.println("Log message found: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
