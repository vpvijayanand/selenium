import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://example.com");

        // Initialize WebDriverWait with a timeout
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Example 1: Wait for an element to be visible
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

        // Example 2: Wait for an element to be clickable and then click it
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.name("buttonName")));
        element2.click();

        // Example 3: Wait for an element's text to contain a specific string
        WebElement element3 = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("p"), "Expected Text"));

        // Example 4: Wait for an element to be present in the DOM
        WebElement element4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("elementClass")));

        // Example 5: Wait for a title to be as expected
        boolean titleIsExpected = wait.until(ExpectedConditions.titleIs("Expected Title"));

        // Example 6: Wait for a title to contain a specific string
        boolean titleContainsString = wait.until(ExpectedConditions.titleContains("Partial Title"));

        // Close the WebDriver
        driver.quit();
    }
}
