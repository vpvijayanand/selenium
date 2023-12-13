import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://example.com");

        // Add a new cookie
        Cookie cookie = new Cookie("myCookie", "cookieValue");
        driver.manage().addCookie(cookie);

        // Get all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();

        // Print all cookies
        for (Cookie c : allCookies) {
            System.out.println("Name: " + c.getName());
            System.out.println("Value: " + c.getValue());
            System.out.println("Domain: " + c.getDomain());
            System.out.println("Path: " + c.getPath());
            System.out.println("Expiry: " + c.getExpiry());
            System.out.println("Secure: " + c.isSecure());
            System.out.println("HttpOnly: " + c.isHttpOnly());
            System.out.println("------------------------------------------------");
        }

        // Delete a specific cookie by name
        driver.manage().deleteCookieNamed("myCookie");

        // Delete all cookies
        driver.manage().deleteAllCookies();

        // Close the WebDriver
        driver.quit();
    }
}
