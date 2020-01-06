import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseUI {


    @Test
    public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(Locators.DAY_OF_BIRTH).click();
        driver.findElement(Locators.DAY5).click();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.MONTH_OF_BIRTH)));
//        wait.until(ExpectedConditions.elementToBeClickable(Locators.MONTH_OF_BIRTH));
        driver.findElement(Locators.MONTH_OF_BIRTH).click();
        driver.findElement(Locators.MONTH).click();
        driver.findElement(Locators.YEAR_OF_BIRTH).click();
        driver.findElement(Locators.YEAR).click();



    }
}


