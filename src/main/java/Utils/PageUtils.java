package Utils;
import enums.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageUtils {

    public static WebElement waitForVisibility(WebDriver driver, By locator, Timeout seconds){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(seconds.getSeconds()));
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(WebDriver driver,By locator, Timeout seconds){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds.getSeconds()));
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
