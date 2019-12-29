import org.testng.Assert;
import org.testng.annotations.Test;

public class PrettyWomenTest extends BaseUI {

    String currentUrl_Prety_Women;

    @Test
    public void testPrettyWomen() {
        driver.findElement(Locators.PRETTY_WOMEN).click();
        currentUrl_Prety_Women = driver.getCurrentUrl();
        System.out.println(currentUrl_Prety_Women);
        Assert.assertEquals(currentUrl_Prety_Women, Data.expectedtUrl_Prety_Wome);
    }
}
