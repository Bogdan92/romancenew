import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTest extends BaseUI {

    String currentUrl_Photo;

    @Test
    public void testPhotos() {
        driver.findElement(Locators.PHOTO).click();
        currentUrl_Photo = driver.getCurrentUrl();
        System.out.println(currentUrl_Photo);
        Assert.assertEquals(currentUrl_Photo, Data.expectedtUrl_Photo);
        driver.findElement(Locators.PHOTO1).click();
        Select select = new Select(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY1));
        select.selectByVisibleText("Views count");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.findElement(Locators.PICTURE).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            driver.findElement(Locators.EXIT).click();
            }
        }
    }
}
