import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SavingTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a form or settings that can be saved
        driver.get("https://example.com/settings");

        // Locate input fields or elements where data can be entered
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement emailInput = driver.findElement(By.id("email"));

        // Enter data into the input fields
        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("johndoe@example.com");

        // Locate and click the "Save" button
        WebElement saveButton = driver.findElement(By.id("save-button"));
        saveButton.click();

        // Verify that the data has been saved successfully
        WebElement successMessage = driver.findElement(By.id("success-message"));
        String messageText = successMessage.getText();

        if (messageText.contains("Data saved successfully")) {
            System.out.println("Data saved successfully.");
        } else {
            System.out.println("Data save failed.");
        }

        // Close the WebDriver
        driver.quit();
    }
}
