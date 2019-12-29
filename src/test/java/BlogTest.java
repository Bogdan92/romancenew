import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI {

    String currentUrl_Blog;

    @Test
    public void testBlog() {
        driver.findElement(Locators.BLOG).click();
        currentUrl_Blog = driver.getCurrentUrl();
        System.out.println(currentUrl_Blog);
        Assert.assertEquals(currentUrl_Blog, Data.expectedtUrl_Blog);

    }

}
