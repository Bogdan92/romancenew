import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWork extends BaseUI {

    String currentUrl_How_We_Work;

    @Test
    public void testHowWeWork() {
        driver.findElement(Locators.HOW_WE_WROK).click();
        currentUrl_How_We_Work = driver.getCurrentUrl();
        System.out.println(currentUrl_How_We_Work);
        Assert.assertEquals(currentUrl_How_We_Work, Data.expectedtUrl_How_We_work);
    }
}
