import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage
        driver.get("https://example.com");

        // 1. Locate element by ID
        WebElement elementById = driver.findElement(By.id("elementId"));

        // 2. Locate element by Name
        WebElement elementByName = driver.findElement(By.name("elementName"));

        // 3. Locate element by Class Name
        WebElement elementByClassName = driver.findElement(By.className("elementClass"));

        // 4. Locate element by Tag Name
        WebElement elementByTagName = driver.findElement(By.tagName("a"));

        // 5. Locate element by Link Text
        WebElement elementByLinkText = driver.findElement(By.linkText("Link Text"));

        // 6. Locate element by Partial Link Text
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Partial Link"));

        // 7. Locate element by CSS Selector
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("input#inputId"));

        // 8. Locate element by XPath
        WebElement elementByXPath = driver.findElement(By.xpath("//input[@id='inputId']"));

        // Perform actions on the located elements
        elementById.click();
        elementByName.sendKeys("Text");
        elementByClassName.clear();
        elementByTagName.click();
        elementByLinkText.click();
        elementByPartialLinkText.click();
        elementByCssSelector.sendKeys("CSS Selector Text");
        elementByXPath.sendKeys("XPath Text");

        // Close the WebDriver
        driver.quit();
    }
}
