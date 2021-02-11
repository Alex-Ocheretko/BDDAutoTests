package pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends PageObject {

    private SmartphonesPage smartphonesPage;

    @FindBy(xpath = "//rz-user/button")
    private WebElementFacade logIn;

    @FindBy(xpath = "//input[@type='email']")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElementFacade passwordInput;

    @FindBy(xpath = "//fieldset//button")
    private WebElementFacade submitLogInButton;

    @FindBy(xpath = "//div[@class='menu-wrapper menu-wrapper_state_static']//a[contains(@href,'telefony-tv-i-ehlektronika')]")
    private WebElementFacade telefonyTvEhlektronikaMenuStatic;

    @FindBy(xpath = "//a[contains(@href,'preset=smartfon')]")
    private WebElementFacade smartfonInHiddenMenu;

    @FindBy(css = "button[class='header__button header__button--active']")
    private WebElementFacade cartOnHeader;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/ua/cabinet/orders']")
    private WebElementFacade myOrdersOnDropdownList;

    @FindBy(xpath = "//input")
    private WebElementFacade searchFormOnHomePage;

    @FindBy(css = "p[class='error-message']")
    private WebElementFacade errorMessageOfWrongEmail;

    @FindBy(css = "input[id='auth_pass'][class='ng-dirty ng-touched ng-invalid']")
    private WebElementFacade errorMessageOfWrongPass;

    @FindBy(css = "li[class='header-actions__item header-actions__item--comparison'] button")
    private WebElementFacade compareButtonOnHeader;

    @FindBy(css = "li[class='comparison-modal__item']")
    private WebElementFacade comparisonModelList;

    @FindBy(css = "[class='header-actions__component']>[href$= '/cabinet/orders/']")
    private WebElementFacade userCabinetButtonOnHeader;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }

    public void logInClick() {
        logIn.click();
    }

    public void writeEmail(String email) {
        emailInput.click();
        emailInput.sendKeys(email);
    }

    public void writePassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public void pressLogInButton() {
        submitLogInButton.click();
    }

    public void hoversMouseOverSmartphonesTvElectronics() {
        Actions action = new Actions(getDriver());
        action.moveToElement(telefonyTvEhlektronikaMenuStatic).perform();
    }

    public void smartfonInHiddenMenuClick() {
        smartfonInHiddenMenu.click();
    }

    public void cartOnHeaderClick() {
        cartOnHeader.click();
    }

    public boolean errorMessageOfWrongEmailVisibility() {
        return errorMessageOfWrongEmail.isVisible();
    }

    public boolean errorMessageOfWrongPassVisibility() {
        return errorMessageOfWrongPass.isVisible();
    }

    public void compareButtonOnHeaderClick() {
        compareButtonOnHeader.click();
        comparisonModelList.click();
    }

    public void userCabinetButtonOnHeaderClick() {
        userCabinetButtonOnHeader.click();
    }
}