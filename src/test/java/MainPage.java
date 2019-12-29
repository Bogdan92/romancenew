import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrl_How_We_Work;
    String currentUrl_Prety_Women;
    String currentUrl_GIFTS;
    String currentUrl_Photo;
    String currentUrl_Tour_to_ukraine;
    String currentUrl_Blog;

    String expectedtUrlSearch = "https://romanceabroad.com/users/search";
    String expectedtUrlMeadia = "https://romanceabroad.com/media/index";
    String expectedtUrl_How_We_work = "https://romanceabroad.com/content/view/how-it-works";
    String expectedtUrl_Prety_Wome = "https://romanceabroad.com/users/search";
    String expectedtUrl_Photo = "https://romanceabroad.com/media/index";
    String expectedtUrl_Tour_to_ukraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedtUrl_Gifts ="https://romanceabroad.com/store/category-sweets";
    String expectedtUrl_Blog = "https://romanceabroad.com/content/view/blog";

    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath ("//button[@id='show-registration-block']");
    By HOW_WE_WROK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By PRETTY_WOMEN = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By PHOTO = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By GIFT = By.cssSelector ("a[href='https://romanceabroad.com/store/category-sweets']");
    By TOUR_TO_UKRAINE = By.xpath("//a['href=https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");



    int indexLinkSignIn = 0;


    String name = "Al";
    By BUTTON_SUBMIT = By.xpath("//a");
    int number = 3;
    boolean requirement = true;
    boolean requirement2 = false;











    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage() {
       driver.findElement(LINK_SEARCH).click();
       currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch,expectedtUrlSearch);
    }

    @Test
    public void testMediaPage() {
       driver.findElement(LINK_MEDIA).click();
       currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlMedia,expectedtUrlMeadia);
    }

    @Test
    public void testSignIn() {
       driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();


    }

    @Test
    public void testSignIn2() {
        WebElement linkSignIn = driver.findElement(LINK_SIGN_IN);
       linkSignIn.click();


    }

    @Test
    public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("bob@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("bobobobob");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();



    }

    @Test
    public void testHowWeWork(){
        driver.findElement(HOW_WE_WROK).click();
        currentUrl_How_We_Work = driver.getCurrentUrl();
        System.out.println(currentUrl_How_We_Work);
        Assert.assertEquals(currentUrl_How_We_Work,expectedtUrl_How_We_work);
    }

    @Test
    public void testPrettyWomen(){
        driver.findElement(PRETTY_WOMEN).click();
        currentUrl_Prety_Women = driver.getCurrentUrl();
        System.out.println(currentUrl_Prety_Women);
        Assert.assertEquals(currentUrl_Prety_Women,expectedtUrl_Prety_Wome);
    }

    @Test
    public void testPhotos(){
        driver.findElement(PHOTO).click();
        currentUrl_Photo = driver.getCurrentUrl();
        System.out.println(currentUrl_Photo);
        Assert.assertEquals(currentUrl_Photo,expectedtUrl_Photo);
    }

    @Test
    public void testGifts(){
        driver.findElement(GIFT).click();
        currentUrl_GIFTS = driver.getCurrentUrl();
        System.out.println(expectedtUrl_Gifts);
        Assert.assertEquals(currentUrl_GIFTS, expectedtUrl_Gifts);
    }

    @Test
    public void testTourToUkraine(){
        driver.findElement(TOUR_TO_UKRAINE).click();
        currentUrl_Tour_to_ukraine = driver.getCurrentUrl();
        System.out.println(expectedtUrl_Tour_to_ukraine);
        Assert.assertEquals(currentUrl_Tour_to_ukraine, expectedtUrl_Tour_to_ukraine);

    }

    @Test
    public void testBlog(){
        driver.findElement(BLOG).click();
        currentUrl_Blog = driver.getCurrentUrl();
        System.out.println(expectedtUrl_Blog);
        Assert.assertEquals(currentUrl_Blog,expectedtUrl_Blog);

    }



    @AfterMethod
    public void afterActions(){
        driver.quit();
    }

    }


