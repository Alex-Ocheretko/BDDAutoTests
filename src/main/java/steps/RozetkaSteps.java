package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObject.*;

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
    public void openSite() {
        mainPage.open();
    }

    @Step
    public void clickLogIn() {
        mainPage.logInClick();
    }

    @Step
    public void emailWrite(String email) {
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
        assertThat(userCabinetPage.userNameOnUserCabinetPage()).isEqualTo(name);
    }

    @Step
    public void hoversMouseOverSmartphonesTvElectronics() {
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
    public void pressMakingAnOrderButton() {
        makingAnOrderPage.makingAnOrderButtonClick();
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
    public void getOrderNumber() {
        String orderNumber = makingAnOrderPage.getOrderNumber();
        Pattern pattern = Pattern.compile("[а-яА-Я]+\\s[0-9]{9}");
        Matcher matcher = pattern.matcher(orderNumber);
        boolean actual = matcher.matches();
        assertThat(actual).isTrue();
    }

    @Step
    public void pressCancelOrderButtonOfFirstProduct() {
        if (userCabinetPage.chevronDownButtonOfFirstProductVisibility() == false) {
            userCabinetPage.chevronDownButtonOfFirstProductClick();
        }
        userCabinetPage.cancelOrderButtonOfFirstProductClick();
    }

    @Step
    public void pressYesReorderConfirmWindow() {
        userCabinetPage.yesReorderConfirmWindow();
    }

    @Step
    public void firstOrderStatusCheckVisibility() {
        getDriver().navigate().refresh();
        userCabinetPage.firstOrderStatusVisibility();
        userCabinetPage.reorderButtonOfFirstProductVisibility();
    }

    @Step
    public boolean errorMessageOfWrongEmailVisibility() {
        return mainPage.errorMessageOfWrongEmailVisibility();
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
    public void pressCompareButtonOfFirstProduct() {
        smartphonesPage.compareButtonOfFirstProductClick();
    }

    @Step
    public void pressCompareButtonOfSecondProduct() {
        smartphonesPage.compareButtonOfSecondProductClick();
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
    public void sortByPriceDesc() {
        smartphonesPage.dropDownOfSortButtonClick();
        smartphonesPage.sortByPriceDescButtonClick();
    }

    @Step
    public void checkSortingByPrice() {
        boolean actual = true;

        for (int i = 0; i < smartphonesPage.getPriceTagsOfGoods().size() - 2; i++) {
            int priceOfFirstOrder = getPriceOfOrder(i);
            int priceOfSecondOrder = getPriceOfOrder(i + 1);
            if (priceOfFirstOrder < priceOfSecondOrder) {
                actual = false;

            }
        }
        assertThat(actual).isTrue();

    }

    @Step
    public void userCabinetButtonOnHeaderClick() {
        mainPage.userCabinetButtonOnHeaderClick();
    }

    private int getPriceOfOrder(int i) {
        return Integer.parseInt(smartphonesPage.getPriceTagsOfGoods().get(i).getText().replaceAll("\\s+", ""));
    }
}
