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

    public String getFirstProduct() {
        return firstProduct.getText();
    }

    public void firstProductCurtButtonClick() {
        firstProductCurtButton.click();
    }

}