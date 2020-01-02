import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraine extends BaseUI {

    String currentUrl_Tour_to_ukraine;

    @Test
    public void testTourToUkraine() {
        driver.findElement(Locators.TOUR_TO_UKRAINE).click();
        currentUrl_Tour_to_ukraine = driver.getCurrentUrl();
        System.out.println(currentUrl_Tour_to_ukraine);
        Assert.assertEquals(currentUrl_Tour_to_ukraine, Data.expectedtUrl_Tour_to_ukraine);

    }

}
