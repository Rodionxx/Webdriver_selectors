import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rodion Banar
 * on 22.12.14.
 */
public class HomePage {

    // nav mainnavs
    @FindBy(xpath = "//a[@id = 'nav-questions']") //xpath selector
    public WebElement questionsButton;

    @FindBy(id = "nav-tags") //id
    public WebElement tagsButton;

    @FindBy(css = "#nav-users") //css selector
    public WebElement usersButton;

    @FindBy(id = "nav-badges")
    public WebElement badgesButton;

    @FindBy(id = "nav-unanswered")
    public WebElement unansweredButton;

    @FindBy(id = "nav-askquestion")
    public WebElement askquestionButton;

    @FindBy(xpath = "//input[@name = 'q']")
    public WebElement search;

    @FindBy(xpath = "//a[contains(@id,'tell-me-more')]")
    public WebElement moreButton;

    @FindBy(xpath = "//div[@id='blurb']")
    public WebElement blurb;

    @FindBy(xpath = "//a[contains(.,'sign up')]")
    public WebElement sign;

    public void goNav(WebElement button) {
        button.click();
    }

    public void searchField(String text) {
        search.sendKeys(text);
        search.submit();
    }

}