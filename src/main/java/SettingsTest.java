import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class SettingsTest {

    @BeforeClass
        public void setup(){

        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        Configuration.startMaximized = true;
        open("https://www.englishdom.com");
    }

    @AfterClass
    public void tearDown() throws IOException {
         closeWebDriver();
        }
}
