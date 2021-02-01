package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page_object.*;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;

public class RozetkaSteps extends ScenarioSteps {

    private MainPage mainPage;
    private SmartphonesPage smartphonesPage;
    private CartWindow cartWindow;
    private MakingAnOrderPage makingAnOrderPage;
    private UserCabinetPage userCabinetPage;
    private ComparisonPage comparisonPage;

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
    public void orderNumberAvailable(){
        makingAnOrderPage.orderNumberAvailable();
    }

    @Step
    public void getOrderNumber() {
        String orderNumber = makingAnOrderPage.getOrderNumber();
        System.out.println(orderNumber);
        Pattern pattern = Pattern.compile("[а-яА-Я]+\\s[0-9]{9}");
        Matcher matcher = pattern.matcher(orderNumber);
        boolean actual = matcher.matches();
        assertThat(actual).isEqualTo(true);
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
        if (userCabinetPage.chevronDownButtonOfFirstProductVisibility()) {
            userCabinetPage.chevronDownButtonOfFirstProductClick();
        }
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

    @Step
    public void pressCompareButtonOfFirstProdact() {
        smartphonesPage.compareButtonOfFirstProdactClick();
    }

    @Step
    public void pressCompareButtonOfSecondProdact() {
        smartphonesPage.compareButtonOfSecondProdactClick();
    }

    @Step
    public void pressCompareButtonOnHeader() {
        mainPage.compareButtonOnHeaderClick();
    }

    @Step
    public void checkingTheAvailabilityOfSelectedProducts() {
        String firstComparisonProductName = comparisonPage.getFirstComparisonProductName();
        String secondComparisonProductName = comparisonPage.getSecondComparisonProductName();

        getDriver().navigate().back();

        String firstProductName = smartphonesPage.getFirstProduct();
        String secondProductName = smartphonesPage.getSecondProduct();

        assertThat(firstProductName).startsWith(firstComparisonProductName);
        assertThat(secondProductName).startsWith(secondComparisonProductName);
    }

    @Step
    public void sortByPriceDesc(){
        smartphonesPage.dropDownOfSortButtonClick();
        smartphonesPage.sortByPriceDescButtonClick();
    }

    @Step
    public void checkSortingByPrice() {
        boolean expected = true;
        boolean actual = false;

        for (int i = 0; i < smartphonesPage.getPriceTagsOfGoods().size()-1; i++) {
            int first = Integer.parseInt(smartphonesPage.getPriceTagsOfGoods().get(i).getText().replaceAll("\\s+",""));
            int second = Integer.parseInt(smartphonesPage.getPriceTagsOfGoods().get(i+1).getText().replaceAll("\\s+",""));
            if (first >= second) {
                if (smartphonesPage.getPriceTagsOfGoods().size()-2 == i) {
                    actual = true;
                }
            } else {
                actual = false;
            }
        }
        assertThat(actual).isEqualTo(expected);

    }
}
