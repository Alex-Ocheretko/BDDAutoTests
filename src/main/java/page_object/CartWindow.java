package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.Assertions.assertThat;

public class CartWindow extends PageObject {

    private MainPage mainPage;
    private SmartphonesPage smartphonesPage;

    @FindBy(xpath = "//a[@class='cart-product__title']")
    private WebElementFacade selectedProduct;

    @FindBy(xpath = "//button[@class=\'modal__close\']")
    private WebElementFacade closeCartButton;

    public void selectedProductAvailable() {

        String selectedProductName = selectedProduct.getText();
        closeCartButton.click();
        String firstProductName = smartphonesPage.getFirstProduct();
        assertThat(firstProductName).startsWith(selectedProductName);
    }
}
