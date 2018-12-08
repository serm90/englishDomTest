package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class KidsPage {

    public IndividualPage goToIndividualPage(){
        $(byText("Индивидуально")).click();
        return new IndividualPage();
    }

    public CorporationPage goToCorporationPage(){
        $(byText("Для компаний")).click();
        return new CorporationPage();
    }
    public KidsPage clickButtonStartFree(){
        $(byText("Начать бесплатно")).click();
        return this;
    }

}
