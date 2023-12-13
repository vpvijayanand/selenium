import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseActionsExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://example.com");

        // Locate an element to perform mouse actions on
        WebElement element = driver.findElement(By.cssSelector(".example-element"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // 1. Clicking an Element
        actions.click(element).perform();

        // 2. Double-Clicking an Element
        actions.doubleClick(element).perform();

        // 3. Right-Clicking an Element (Context Click)
        actions.contextClick(element).perform();

        // 4. Moving to an Element (Hover)
        WebElement targetElement = driver.findElement(By.cssSelector(".target-element"));
        actions.moveToElement(targetElement).perform();

        // 5. Clicking and Holding
        actions.clickAndHold(element).perform();

        // 6. Releasing after Click and Hold
        actions.release().perform();

        // Close the WebDriver
        driver.quit();
    }
}
