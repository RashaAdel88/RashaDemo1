package TAUDemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class SeleniumTest {
   static private final BrowserGetter browserGetter = new BrowserGetter();
    static private WebDriver driver;

    @BeforeClass
    public static void beforeClass () {
         driver = browserGetter.getChromeDriver();
    }

    @AfterClass
    public static void afterClass() {
        driver.quiteBrowser();
    }

    @Test
    public void openThePageAndCheckTheTitle() {
        String expectedTitle = "Example title";
        driver.getClass();


    }
}
