import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CorporationPage;
import pages.IndividualPage;
import pages.KidsPage;


@Report
@Listeners(TextReport.class)
public class WelcomeHomeTestEnglishDom extends SettingsTest{


    @Test
    public void englishDomWelcomeHomeTest() {

        KidsPage kidsPage = new IndividualPage().goToKidsPage();
        CorporationPage corporationPage = kidsPage.goToCorporationPage();
        IndividualPage individualPage = corporationPage.goToIndividualPage();
        CorporationPage corporationPage1 = individualPage.goToCorporationPage();
        KidsPage kidsPage1 = corporationPage1.goToKidsPage();

    }
}
