import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignInTest extends BaseUI {

    int indexLinkSignIn = 0;

    @Test
    public void testSignIn() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();


    }

    @Test
    public void testSignIn2() {
        WebElement linkSignIn = driver.findElement(Locators.LINK_SIGN_IN);
        linkSignIn.click();


    }
}
