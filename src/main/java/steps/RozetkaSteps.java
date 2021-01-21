package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page_object.MainPage;
import page_object.SmartphonesPage;

public class RozetkaSteps extends ScenarioSteps {


    private MainPage mainPage;
    private SmartphonesPage smartphonesPage;

    @Step
    public void openSite(){
        mainPage.open();
    }

    @Step
    public void klickLogIn() {
        mainPage.logInClikc();
    }

    @Step
    public void elmailWrite(String email) {
        mainPage.writeEmail(email);
    }

    @Step
    public void passwordWrite(String password) {
        mainPage.writePassword(password);
    }

    @Step
    public void klickSubmitButton() {
        mainPage.pressLogInButton();
    }

    @Step
    public void chekUserName(String name) {
        mainPage.chekUserName(name);
    }

    @Step
    public void hoversMouseOverSmartphonesTvElectronics(){
        mainPage.hoversMouseOverSmartphonesTvElectronics();
    }

    @Step
    public void smartfonInHiddenMenuClick() {
        mainPage.smartfonInHiddenMenuClick();
    }

    @Step
    public void firstProductCurtButtonClick() {
        smartphonesPage.firstProductCurtButtonClick();
    }

    @Step
    public void cartOnHeaderClick() {
        mainPage.cartOnHeaderClick();
    }

    @Step
    public void selectedProductAvailable() {
        smartphonesPage.selectedProductAvailable();
    }
}
