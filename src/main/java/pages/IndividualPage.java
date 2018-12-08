package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class IndividualPage {

    public KidsPage goToKidsPage(){
        $(byText("Для детей")).click();
        return new KidsPage();
    }

    public CorporationPage goToCorporationPage(){
        $(byText("Для компаний")).click();
        return new CorporationPage();
    }

}
