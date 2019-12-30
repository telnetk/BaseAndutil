package cl.falabella.omniChanel.util;

import cl.falabella.omniChanel.po.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OmniChanelUtils {



    public static void scroll(WebDriver driver) throws IOException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public static void scrollUp(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,250)");
    }

}
