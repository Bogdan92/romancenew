import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.soap.Text;

public class SearchTest extends BaseUI {

    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch,Data.expectedtUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY));
        select.selectByVisibleText("Views");
        Select select1 = new Select(driver.findElement(Locators.AGE_MIN));
        select1.selectByValue("22");
        Select select2 = new Select(driver.findElement(Locators.AGE_MAX));
        select2.selectByValue("33");
        driver.findElement(Locators.SEARCH_BUTTON).click();
    }
}
