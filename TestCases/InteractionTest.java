import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage
        driver.get("https://example.com");

        // Locate elements for interaction
        WebElement elementToClick = driver.findElement(By.id("elementToClick"));
        WebElement elementToHover = driver.findElement(By.id("elementToHover"));
        WebElement elementToDrag = driver.findElement(By.id("elementToDrag"));
        WebElement targetElement = driver.findElement(By.id("targetElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // 1. Clicking an Element
        elementToClick.click();

        // 2. Hovering Over an Element
        actions.moveToElement(elementToHover).perform();

        // 3. Drag-and-Drop
        actions.dragAndDrop(elementToDrag, targetElement).perform();

        // 4. Double-Clicking an Element
        actions.doubleClick(elementToClick).perform();

        // 5. Right-Clicking an Element (Context Click)
        actions.contextClick(elementToClick).perform();

        // 6. Click and Hold
        actions.clickAndHold(elementToClick).perform();

        // 7. Releasing After Click and Hold
        actions.release().perform();

        // Close the WebDriver
        driver.quit();
    }
}
