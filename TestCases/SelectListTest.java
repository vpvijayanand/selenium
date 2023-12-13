import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a select list
        driver.get("https://example.com/selectlist");

        // Locate the select element
        WebElement selectElement = driver.findElement(By.id("select-id"));

        // Create a Select object for the select element
        Select select = new Select(selectElement);

        // Example 1: Select by visible text
        select.selectByVisibleText("Option Text");

        // Example 2: Select by index (0-based)
        select.selectByIndex(1); // Selects the second option

        // Example 3: Select by value attribute
        select.selectByValue("optionValue");

        // Verify the selected option (optional)
        WebElement selectedOption = select.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        System.out.println("Selected Option: " + selectedText);

        // Close the WebDriver
        driver.quit();
    }
}
