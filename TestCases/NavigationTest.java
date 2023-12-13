import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://example.com");

        // Perform some actions on the page (e.g., clicking links, filling forms, etc.)

        // 1. Navigating Back
        driver.navigate().back();

        // 2. Navigating Forward
        driver.navigate().forward();

        // 3. Reloading the Page
        driver.navigate().refresh();

        // 4. Navigating to a Different URL
        driver.navigate().to("https://example.com/another-page");

        // Get the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Get the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the WebDriver
        driver.quit();
    }
}
