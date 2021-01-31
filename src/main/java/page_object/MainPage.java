package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.*;


public class MainPage extends PageObject {

    private SmartphonesPage smartphonesPage;

    @FindBy(xpath = "//p/button")
    private WebElementFacade logIn;

    @FindBy(xpath = "//input[@type='email']")
    private WebElementFacade emeilInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElementFacade passwordInput;

    @FindBy(xpath = "//fieldset//button")
    private WebElementFacade submitLogInButton;

    @FindBy(xpath = "//a[@class='header-topline__user-link']")
    private WebElementFacade userNameOnHomePage;

    @FindBy(xpath = "//div[@class='menu-wrapper menu-wrapper_state_static']//a[contains(@href,'telefony-tv-i-ehlektronika')]")
    private WebElementFacade telefonyTvEhlektronikaMenuStatic;

    @FindBy(xpath = "//a[contains(@href,'preset=smartfon')]")
    private WebElementFacade smartfonInHiddenMenu;

    @FindBy(xpath = "//li[@class='header-actions__item header-actions__item_type_cart']")
    private WebElementFacade cartOnHeader;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/ua/cabinet/orders']")
    private WebElementFacade myOrdersOnDropdownList;

    @FindBy(xpath = "//input")
    private WebElementFacade searchFormOnHomePage;

    @FindBy(css = "p[class='error-message']")
    private WebElementFacade errorMessageOfWrongAmail;

    @FindBy(css = "input[id='auth_pass'][class='ng-dirty ng-touched ng-invalid']")
    private WebElementFacade errorMessageOfWrongPass;

    @FindBy(css = "button[class*='header-actions__button header-actions__button_type_compare']")
    private WebElementFacade compareButtonOnHeader;

    @FindBy(css = "li[class='comparison-modal__item']")
    private WebElementFacade comparisonModelList;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }


    public void hoversMouseOverUserNameOnHomePage() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userNameOnHomePage).perform();
    }

    public void myOrdersOnDropdownListClick() {
        myOrdersOnDropdownList.click();
    }

    public void hoversMouseOversearchForm() {
        Actions action = new Actions(getDriver());
        action.moveToElement(searchFormOnHomePage);
    }

    public void logInClikc() {
        logIn.click();
    }

    public void writeEmail(String email) {
        emeilInput.click();
        emeilInput.sendKeys(email);
    }

    public void writePassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public void pressLogInButton() {
        submitLogInButton.click();
    }

    public void chekUserName(String name) {
        assertThat(userNameOnHomePage.getText()).isEqualTo(name);
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

    public boolean errorMessageOfWrongAmailVisibility() {
        return errorMessageOfWrongAmail.isVisible();
    }

    public boolean errorMessageOfWrongPassVisibility() {
       return errorMessageOfWrongPass.isVisible();
    }

    public void compareButtonOnHeaderClick() {
        compareButtonOnHeader.click();
        comparisonModelList.click();
    }

    public String getComparisonModelListURL() {
        return comparisonModelList.getAttribute("href");
    }
}