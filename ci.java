// Import necessary Selenium libraries
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize a new WebDriver instance using ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://www.example.com/login");

        // Perform login actions (e.g., entering username and password, clicking login button)
        driver.findElement(By.id("username")).sendKeys("yourUsername");
        driver.findElement(By.id("password")).sendKeys("yourPassword");
        driver.findElement(By.id("loginButton")).click();

        // Wait for some time to ensure the page has loaded (using an explicit wait is more robust)
        try {
            Thread.sleep(5000);  // This is a simple wait, not recommended for real tests
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the profile link
        driver.findElement(By.id("profileLink")).click();

        // Additional actions can be performed after this

        // Close the browser
        driver.quit();
    }
}
