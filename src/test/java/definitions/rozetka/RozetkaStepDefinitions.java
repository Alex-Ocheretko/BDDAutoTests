package definitions.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import steps.RozetkaSteps;

public class RozetkaStepDefinitions {

    @Steps
    private RozetkaSteps testSteps;


    @Given("Customer open site")
    public void openSite() {
        testSteps.openSite();
    }

    @When("Customer click log in")
    public void clickLogIn() {
        testSteps.clickLogIn();
    }

    @When("Customer write '$mail'")
    public void emailWrite(String email) {
        testSteps.emailWrite(email);
    }

    @When("Write '$password'")
    public void passwordWrite(String password) {
        testSteps.passwordWrite(password);
    }

    @When("Customer click submit")
    public void clickSubmitButton() {
        testSteps.clickSubmitButton();
    }

    @When("Customer click cabinet button on header")
    public void clickUserCabinetButtonOnHeader() {
        testSteps.userCabinetButtonOnHeaderClick();
    }


    @Then("Customer see error message")
    public void errorMessageVisibility() {
        if (testSteps.errorMessageOfWrongEmailVisibility())
            testSteps.errorMessageOfWrongEmailVisibility();
        if (testSteps.errorMessageOfWrongPassVisibility()) {
            testSteps.errorMessageOfWrongPassVisibility();
        }
    }

    @Then("Customer see '$userName' on user cabinet page")
    public void chekUserName(String name) {
        testSteps.chekUserName(name);
    }

    @When("Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page")
    public void hoversMouseOverSmartphonesTvElectronics() {
        testSteps.hoversMouseOverSmartphonesTvElectronics();
    }

    @When("Customer clicks 'Smartphones'")
    public void smartfonInHiddenMenuClick() {
        testSteps.smartfonInHiddenMenuClick();
    }

    @When("Customer clicks the cart on the first product")
    public void firstProductCurtButtonClick() {
        testSteps.firstProductCurtButtonClick();
    }

    @When("Customer clicks the cart on the header")
    public void cartOnHeaderClick() {
        testSteps.cartOnHeaderClick();
    }

    @Then("Customer sees the selected product in the cart")
    public void selectedProductAvailable() {
        testSteps.selectedProductAvailable();
    }

    @When("Customer presses the 'place an order' button")
    public void pressMakingAnOrderButton() {
        testSteps.pressMakingAnOrderButton();
    }

    @When("Customer selects the delivery point")
    public void selectFirstDeliveryPoint() {
        testSteps.selectFirstDeliveryPoint();
    }

    @When("Customer presses the order confirmation button")
    public void pressOrderConfirmationButton() {
        testSteps.pressOrderConfirmationButton();
    }

    @Then("Customer sees the order number")
    public void OrderNumberAvailable() {
        testSteps.getOrderNumber();
    }

    @When("clicks 'cancel order'")
    public void pressCancelOrderButtonOfFirstProduct() {
        testSteps.pressCancelOrderButtonOfFirstProduct();
    }

    @When("click 'yes' in the order cancellation window to confirm")
    public void pressYesReorderConfirmWindow() {
        testSteps.pressYesReorderConfirmWindow();
    }

    @Then("Customer sees a cancellation message in front of your order")
    public void firstOrderStatusCheckVisibility() {
        testSteps.firstOrderStatusCheckVisibility();
    }

    @Then("Customer sees 60 orders on page")
    public void checkQuantityOfGoodsOnSmartphonesPage() {
        testSteps.checkQuantityOfGoodsOnSmartphonesPage();
    }

    @When("Customer clicks the compare buttons on two firsts products")
    public void pressCompareButtonProducts() {
        testSteps.pressCompareButtonOfFirstProduct();
        testSteps.pressCompareButtonOfSecondProduct();
    }

    @When("Customer clicks the compare button on header")
    public void pressCompareButtonOnHeader() {
        testSteps.pressCompareButtonOnHeader();
    }

    @Then("Customer sees the two selected orders and can comparing them")
    public void checkingTheAvailabilityOfSelectedProducts() {
        testSteps.checkingTheAvailabilityOfSelectedProducts();
    }

    @When("Customer sort by price in descending order")
    public void sortByPriceDesc() {
        testSteps.sortByPriceDesc();
    }

    @Then("goods are sorted by price desc")
    public void checkSortingByPrice() {
        testSteps.checkSortingByPrice();
    }
}