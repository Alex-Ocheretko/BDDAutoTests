package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SmartphonesPage extends PageObject {

    @FindBy(xpath = "//rz-grid//li[1]//div[1]//a[@class='goods-tile__heading']")
    private WebElementFacade firstProduct;

    @FindBy(xpath = "//li[1]//button[@class='buy-button goods-tile__buy-button']")
    private WebElementFacade firstProductCurtButton;

    @FindBy(xpath = "//div[@class = \"goods-tile\"]")
    private List<WebElementFacade> ordersOnPage;

    public String getFirstProduct() {
        return firstProduct.getText();
    }

    public void firstProductCurtButtonClick() {
        firstProductCurtButton.click();
    }

    public List<WebElementFacade> getResults() {
        return ordersOnPage;
    }

    public void checkQuantityOfGoodsOnSmartphonesPage() {
        List<WebElementFacade> number = ordersOnPage;
        assertThat(60).isEqualTo(number.size());

    }

}