import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.IndividualPage;
import pages.KidsPage;


@Report
@Listeners(TextReport.class)

public class RegistrationKids extends SettingsTest {
    @Test

    public void registrationKidsFormTest(){
        KidsPage kidsPage = new IndividualPage().goToKidsPage();
        KidsPage kidsPage1 = kidsPage.clickButtonStartFree();

    }

}
