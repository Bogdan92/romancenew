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


    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    //How we work
    public static final By HOW_WE_WROK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Pretty Women
    public static final By PRETTY_WOMEN = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

    //Photo
    public static final By PHOTO = By.xpath("//a[@href='https://romanceabroad.com/media/index']");

    //Gift
    public static final By GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    //Tour to Ukraine
    public static final By TOUR_TO_UKRAINE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Blog
    public static final By BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //SignIn
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");

}
