import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage with an alert
        driver.get("https://example.com");

        // Locate the element that triggers the alert
        WebElement showAlertButton = driver.findElement(By.id("alert-button"));

        // Click the button to trigger the alert
        showAlertButton.click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept the alert (clicking OK)
        alert.accept();

        // Close the WebDriver
        driver.quit();
    }
}
