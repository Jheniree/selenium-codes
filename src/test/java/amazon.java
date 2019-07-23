import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://wikipedia.org");
        long miliSeconds = 3000;

        Thread.sleep(miliSeconds);
        WebElement element = driver.findElement(By.id("js-link-box-en"));
        element.click();


       Thread.sleep(miliSeconds);
        WebElement searchBox;
        searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Software");
        Thread.sleep(miliSeconds);
        WebElement element1 = driver.findElement(By.id("searchButton"));
        element1.click();
        Thread.sleep(miliSeconds);

        Actions action = new Actions(driver);
        WebElement perro = driver.findElement(By.linkText("History of software"));
        Thread.sleep(miliSeconds);
        action.moveToElement(perro).perform();
        Thread.sleep(miliSeconds);

        driver.quit();

    }
}
