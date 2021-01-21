package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page_object.MainPage;

public class RozetkaSteps extends ScenarioSteps {


    private MainPage mainPage;

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

    public void firstProductCurtButtonClick() {
        mainPage.firstProductCurtButtonClick();
    }

    public void cartOnHeaderClick() {
        mainPage.cartOnHeaderClick();
    }

    public void selectedProductAvailable() {
        mainPage.selectedProductAvailable();
    }
}
