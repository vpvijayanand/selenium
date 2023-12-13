import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ColorTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://example.com");

        // Locate the element whose color you want to test
        WebElement element = driver.findElement(By.cssSelector(".some-element"));

        // Use JavaScript to get the computed style of the element
        String backgroundColor = (String) ((JavascriptExecutor) driver).executeScript(
            "return window.getComputedStyle(arguments[0]).getPropertyValue('background-color');", element);

        // Verify the color meets your expectations
        if (backgroundColor.equals("rgba(0, 0, 255, 1)")) {
            System.out.println("Element color is as expected (blue).");
        } else {
            System.out.println("Element color is not as expected.");
        }

        // Close the WebDriver
        driver.quit();
    }
}
