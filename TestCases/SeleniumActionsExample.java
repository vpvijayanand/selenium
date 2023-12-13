import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActionsExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://example.com");

        // 1. Clicking an Element
        WebElement someElement = driver.findElement(By.linkText("Some Link"));
        someElement.click();

        // 2. Entering Text into an Input Field
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium automation");

        // 3. Submitting a Form
        searchBox.submit();

        // 4. Handling Dropdowns (Select)
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option 2");

        // 5. Mouse Hover Action
        WebElement hoverElement = driver.findElement(By.id("hoverElement"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();

        // 6. Waiting for an Element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement waitElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("waitElement")));

        // 7. Switching to Alert
        driver.switchTo().alert().accept(); // Accepts an alert

        // 8. Navigating Back and Forward
        driver.navigate().back();
        driver.navigate().forward();

        // 9. Refreshing the Page
        driver.navigate().refresh();

        // 10. Getting the Page Title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the WebDriver
        driver.quit();
    }
}
