package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CorporationPage {

    public KidsPage goToKidsPage(){
        $(byText("Для детей")).click();
        return new KidsPage();
    }

    public IndividualPage goToIndividualPage(){
        $(byText("Индивидуально")).click();
        return new IndividualPage();
    }

}
