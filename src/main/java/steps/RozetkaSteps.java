package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import page_object.*;
import static org.assertj.core.api.Assertions.*;


import java.util.List;

public class RozetkaSteps extends ScenarioSteps {

    private MainPage mainPage;
    private SmartphonesPage smartphonesPage;
    private CartWindow cartWindow;
    private MakingAnOrderPage makingAnOrderPage;
    private UserCabinetPage userCabinetPage;

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
    public void clickSubmitButton() {
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
        cartWindow.selectedProductAvailable();
    }

    @Step
    public void pressOrderConfirmationBatton() {
        makingAnOrderPage.orderConfirmationBattonClick();
    }

    @Step
    public void selectFirstDeliveryPoint() {
        makingAnOrderPage.selectFirstDeliveryPoint();
    }

    @Step
    public void pressOrderConfirmationButton() {
        makingAnOrderPage.orderConfirmationButtonClick();
        makingAnOrderPage.reOrderButton();
    }

    @Step
    public void OrderNumberAveilable(){
        makingAnOrderPage.OrderNumberAveilable();
    }

    @Step
    public void hoversMouseOveruserNameOnHomePage() {
        mainPage.hoversMouseOverUserNameOnHomePage();
    }

    @Step
    public void pressMyOrdersOnDropdownList() {
        mainPage.myOrdersOnDropdownListClick();

        mainPage.hoversMouseOversearchForm();

    }

    @Step
    public void pressCancelOrderButtonOfFirstProduct() {
        userCabinetPage.chevronDownButtonOfFirstProductClick();

//        if (userCabinetPage.chevronDownButtonOfFirstProductVisibility()) {
//            userCabinetPage.chevronDownButtonOfFirstProductClick();
//        }
        userCabinetPage.cancelOrderButtonOfFirstProductClick();
    }

    @Step
    public void pressYesReorderConfirmWindow() {
        userCabinetPage.yesReorderConfirmWindow();
    }

    @Step
    public void firstOrderStatusCheсkVisibility() {
        getDriver().navigate().refresh();
        userCabinetPage.firstOrderStatusVisibility();
        userCabinetPage.reorderButtonOfFirstProductVisibility();
    }

    @Step
    public boolean errorMessageOfWrongAmailVisibility() {
        return mainPage.errorMessageOfWrongAmailVisibility();
    }

    @Step
    public boolean errorMessageOfWrongPassVisibility() {
        return mainPage.errorMessageOfWrongPassVisibility();
    }

    @Step
    public void checkQuantityOfGoodsOnSmartphonesPage() {
        smartphonesPage.checkQuantityOfGoodsOnSmartphonesPage();
    }
}
