import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTest extends BaseUI {

    String currentUrl_GIFTS;

    @Test
    public void testGifts() {
        driver.findElement(Locators.GIFT).click();
        currentUrl_GIFTS = driver.getCurrentUrl();
        System.out.println(currentUrl_GIFTS);
        Assert.assertEquals(currentUrl_GIFTS, Data.expectedtUrl_Gifts);
    }
}
