import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyActionsExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://example.com");

        // Locate an input field
        WebElement inputField = driver.findElement(By.name("q"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // 1. Sending Keys to an Input Field
        inputField.sendKeys("Selenium automation");

        // 2. Performing Key Press
        actions.keyDown(inputField, Keys.SHIFT).sendKeys("selenium").keyUp(inputField, Keys.SHIFT).perform();

        // 3. Sending ENTER Key
        actions.sendKeys(Keys.ENTER).perform();

        // 4. Sending Arrow Keys
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_RIGHT).perform();

        // 5. Sending Special Keys (e.g., TAB)
        actions.sendKeys(Keys.TAB).perform();

        // 6. Combining Multiple Keys
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // Ctrl + A

        // Close the WebDriver
        driver.quit();
    }
}
