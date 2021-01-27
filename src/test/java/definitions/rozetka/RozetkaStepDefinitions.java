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
}