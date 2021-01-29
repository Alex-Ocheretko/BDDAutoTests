package definitions.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import steps.RozetkaSteps;

public class RozetkaStepDefinitions {

    @Steps
    private RozetkaSteps testSteps;


    @Given("Customer open site")
    public void openSite(){
        testSteps.openSite();
    }

    @When("Customer click log in")
    public void clickLogIn() {
        testSteps.klickLogIn();
    }

    @When("Customer write '$mail'")
    public void elmailWrite(String emeil) {
        testSteps.elmailWrite(emeil);
    }

    @When("Write '$password'")
    public void passwordWrite(String password) {
        testSteps.passwordWrite(password);
    }

    @When("Customer click submit")
    public void clickSubmitButton() {
        testSteps.clickSubmitButton();
    }

    @Then("Customer see error massege")
    public void errorMassegeVisibility() {
        if (testSteps.errorMessageOfWrongAmailVisibility())
        testSteps.errorMessageOfWrongAmailVisibility();
        if (testSteps.errorMessageOfWrongPassVisibility()) {
            testSteps.errorMessageOfWrongPassVisibility();
        }
    }

    @Then("Customer see '$userName' on home page")
    public void chekUserName(String name) {
        testSteps.chekUserName(name);
    }

    @When("Customer hovers the mouse cursor over \"smartphones, TV and electronics\" in the product catalog, which is located on the left side of the page")
    public void hoversMouseOverSmartphonesTvElectronics() {
        testSteps.hoversMouseOverSmartphonesTvElectronics();
    }

    @When("Customer clicks \"Smartphones\"")
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
    public void selectedProductAvailable(){
        testSteps.selectedProductAvailable();
    }

    @When("Customer presses the 'place an order' button")
    public void pressOrderConfirmationBatton() {
        testSteps.pressOrderConfirmationBatton();
    }

    @When("Customer selects the delivery point")
    public void selectFirstDeliveryPoint() {
        testSteps.selectFirstDeliveryPoint();
    }

    @When("Customer presses the order confirmation button")
    public void pressOrderConfirmationButton(){
        testSteps.pressOrderConfirmationButton();
    }

    @Then("Customer sees the order number")
    public void OrderNumberAveilable() {
        testSteps.OrderNumberAveilable();
    }

    @When("Customer hovers the mouse cursor over the username")
    public void pressuserNameOnHomePage() {
        testSteps.hoversMouseOveruserNameOnHomePage();
    }

    @When("clicks 'my orders'")
    public void pressMyOrdersOnLeftBar() {
        testSteps.pressMyOrdersOnDropdownList();
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
    public void firstOrderStatusCheсkVisibility() {
        testSteps.firstOrderStatusCheсkVisibility();
    }

    @Then("Castomer sees 60 orders on page")
    public void checkQuantityOfGoodsOnSmartphonesPage() {
        testSteps.checkQuantityOfGoodsOnSmartphonesPage();
    }

}