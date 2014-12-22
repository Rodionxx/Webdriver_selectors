import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Rodion Banar
 * on 22.12.14.
 */
public class SmokeTest {
    WebDriver driver = new FirefoxDriver();
    HomePage page = PageFactory.initElements(driver, HomePage.class);
    String url = "http://stackoverflow.com/";

    @Before
    public void setUp() {
        driver.get(url);
    }

 /*   @Test
    public void questionsButtonLink() {
        page.goNav(page.questionsButton);
        Assert.assertEquals(url + "questions", driver.getCurrentUrl());
    }

    @Test
    public void tagsButtonLink() {
        page.goNav(page.tagsButton);
        Assert.assertEquals(url + "tags", driver.getCurrentUrl());
    }

    @Test
    public void usersButtonLink() {
        page.goNav(page.usersButton);
        Assert.assertEquals(url + "users", driver.getCurrentUrl());
    }

    @Test
    public void searchAbility() {
        String find = "rfrfrfrf";
        page.searchField(find);
        Assert.assertTrue(find, driver.getTitle().contains(find));
    }

    @Test
    public void moreButtonText() {
        Assert.assertEquals("Take the 2-minute tour", page.moreButton.getText());
    }*/

    @Test
    public void blurbText() {
        Assert.assertEquals("FAIL", page.blurb.getText()); //Just to simulate fail test-case.
    }

    @After
    public void finish() {
        driver.close();
        driver.quit();
    }
}