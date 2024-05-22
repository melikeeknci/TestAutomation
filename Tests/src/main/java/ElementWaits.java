
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementWaits {

    public static void waitUntilElementFind(WebDriver driver, WebElement element) {
        (new WebDriverWait(driver, TimeOut.HIGH.value))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementToClickable(WebDriver driver, WebElement element) {

    }

    public static void waitUntilElementToClickable(By clickEditLocator) {
    }


    public enum TimeOut {
        LOW(Duration.ofSeconds(20)),
        MIDDLE(Duration.ofSeconds(30)),
        HIGH(Duration.ofSeconds(45)),
        CUSTOM_MAX(Duration.ofSeconds(60));
        private final Duration value;
        TimeOut(Duration value) {
            this.value = value;
        }
        public Duration getValue() {
            return value;
        }
    }

}
