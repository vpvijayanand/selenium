import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with frames
        driver.get("https://example.com");

        // Switch to a frame by index (0-based)
        driver.switchTo().frame(0);

        // Now, interact with elements inside the frame
        WebElement frameElement = driver.findElement(By.id("elementInsideFrame"));
        frameElement.click();

        // Switch back to the default content (outside the frame)
        driver.switchTo().defaultContent();

        // Switch to a frame by name or ID
        driver.switchTo().frame("frameNameOrId");

        // Interact with elements inside the named or ID'd frame
        WebElement frameElement2 = driver.findElement(By.id("elementInsideFrame2"));
        frameElement2.click();

        // Switch back to the default content again
        driver.switchTo().defaultContent();

        // Close the WebDriver
        driver.quit();
    }
}
