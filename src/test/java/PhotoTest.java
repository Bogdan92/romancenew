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
    }
}
