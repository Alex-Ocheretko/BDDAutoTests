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

    @FindBy(xpath = "//rz-grid//li[2]//div[1]//a[@class='goods-tile__heading']")
    private WebElementFacade secondProduct;

    @FindBy(xpath = "//li[1]//button[@class='buy-button goods-tile__buy-button']")
    private WebElementFacade firstProductCurtButton;

    @FindBy(xpath = "//div[@class = \"goods-tile\"]")
    private List<WebElementFacade> ordersOnPage;

    @FindBy(css = "ul li:nth-child(1) button[class='compare-button']")
    private WebElementFacade compareButtonOfFirstProdact;

    @FindBy(css = "ul li:nth-child(2) button[class='compare-button']")
    private WebElementFacade compareButtonOfSecondProdact;

    @FindBy(css = "rz-sort>select")
    private WebElementFacade dropDownOfSortButton;

    @FindBy(css = "rz-sort>select option:nth-child(3)")
    private WebElementFacade sortByPriceDescButton;

    @FindBy(css = "span[class='goods-tile__price-value']")
    private List<WebElementFacade> priceTagsOfGoods;

    public String getFirstProduct() {
        return firstProduct.getText();
    }

    public String getSecondProduct() {
        return secondProduct.getText();
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

    public void compareButtonOfFirstProdactClick() {
        compareButtonOfFirstProdact.click();
    }

    public void compareButtonOfSecondProdactClick() {
        compareButtonOfSecondProdact.click();
    }

    public void dropDownOfSortButtonClick() {
        dropDownOfSortButton.click();
    }

    public void sortByPriceDescButtonClick() {
        sortByPriceDescButton.click();
    }

    public List<WebElementFacade> getPriceTagsOfGoods() {
        return priceTagsOfGoods;
    }
}