package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.Assertions.assertThat;

public class SmartphonesPage extends PageObject {

    @FindBy(xpath = "//rz-grid//li[1]//div[1]//a[@class='goods-tile__heading']")
    private WebElementFacade firstProduct;

    @FindBy(xpath = "//li[1]//button[@class='buy-button goods-tile__buy-button']")
    private WebElementFacade firstProductCurtButton;

    @FindBy(xpath = "//a[@class='cart-product__title']")
    private WebElementFacade selectedProduct;

    @FindBy(xpath = "//button[@class=\'modal__close\']")
    private WebElementFacade closeCartButton;

    public void firstProductCurtButtonClick() {
        firstProductCurtButton.click();
    }

    public void selectedProductAvailable() {
        String selectedProductName = selectedProduct.getText();
        closeCartButton.click();
        String firstProductName = firstProduct.getText();
        assertThat(firstProductName).startsWith(selectedProductName);
    }
}