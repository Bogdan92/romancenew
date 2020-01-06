import org.openqa.selenium.By;

public class Locators {

    //Meadia page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By DAY_OF_BIRTH = By.cssSelector("div#daySelect");
    public static final By DAY5 = By.xpath("//div[@id='daySelect']//li[6]");
    public static final By MONTH_OF_BIRTH = By.cssSelector("div#monthSelect");
    public static final By MONTH = By.xpath("//a[contains(text(),'Jun')]");
    public static final By YEAR_OF_BIRTH = By.cssSelector("div#yearSelect");
    public static final By YEAR = By.xpath("//a[contains(text(),'1999')]");

    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By AGE_MIN = By.xpath("//select[@class='form-control'][@name='age_min']");
    public static final By AGE_MAX = By.xpath("//select[@class='form-control'][@name='age_max']");
    public static final By SEARCH_BUTTON = By.xpath("//input[@name='main_search_button']");


    //How we work
    public static final By HOW_WE_WROK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By KIEV_DATING_SITE = By.xpath("//a[@href=/content/view/kiev-dating-site']");

    //Pretty Women
    public static final By PRETTY_WOMEN = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

    //Photo
    public static final By PHOTO = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By DROP_DOWN_LIST_SORT_BY1 = By.xpath("//span[@id='gallery_media_sorter']//select");
    public static final By PHOTO1 = By.xpath("//span[contains(text(),'Photo')]");
    public static final By PICTURE = By.xpath("//img[@src=https://romanceabroad.com/uploads/gallery_image/0/0/1/119/big-36a502ceae.jpg]");
    public static final By EXIT = By.xpath("//div[@id='user_load_content_close868']//i[@class='fa fa-times']");

    //Gift
    public static final By GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    //Tour to Ukraine
    public static final By TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Blog
    public static final By BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //SignIn
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");

}
