package page_object;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ComparisonPage extends PageObject {

    @FindBy(css = "ul[class='products-grid'] li[class='products-grid__cell']:nth-child(2) a")
    public WebElementFacade firstComparisonProduct;

    @FindBy(css = "ul[class='products-grid'] li[class='products-grid__cell']:nth-child(1) a")
    public WebElementFacade secondComparisonProduct;

    public String getFirstComparisonProductName() {
        return firstComparisonProduct.getText();
    }

    public String getSecondComparisonProductName() {
        return secondComparisonProduct.getText();
    }
}
