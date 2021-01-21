package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.*;


public class MainPage extends PageObject {

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

    @FindBy(xpath = "//rz-grid//li[1]//div[1]//a[@class='goods-tile__heading']")
    private WebElementFacade firstProduct;

    @FindBy(xpath = "//li[1]//button[@class='buy-button goods-tile__buy-button']")
    private WebElementFacade firstProductCurtButton;


    @FindBy(xpath = "//li[@class='header-actions__item header-actions__item_type_cart']")
    private WebElementFacade cartOnHeader;

    @FindBy(xpath = "//a[@class='cart-product__title']")
    private WebElementFacade selectedProduct;

    @FindBy(xpath = "//button[@class=\'modal__close\']")
    private WebElementFacade closeCartButton;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
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

    public void firstProductCurtButtonClick() {
        firstProductCurtButton.click();
    }

    public void cartOnHeaderClick() {
        cartOnHeader.click();
    }

    public void selectedProductAvailable() {
        String selectedProductName = selectedProduct.getText();
        closeCartButton.click();
        String firstProductName = firstProduct.getText();
//        Assert.assertEquals(selectedProductName,firstProductName);
        assertThat(firstProductName).startsWith(selectedProductName);
    }
}