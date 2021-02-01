package pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class MakingAnOrderPage extends PageObject {

    @FindBy(xpath = "//a[@class='button button_size_large button_color_green cart-receipt__submit']")
    private WebElementFacade makingAnOrderBatton;

    @FindBy(xpath = "//button[@class='button dropdown-button']")
    private WebElementFacade dropdownBottonOfDeliveryPoints;

    @FindBy(xpath = "//ul[@class='autocomplete__list-inner']/li[1]")
    private WebElementFacade firstDeliveryPoint;

    @FindBy(xpath = "//button[@class='button button--green button--large checkout-total__submit']")
    private WebElementFacade orderConfirmationButton;

    @FindBy(css = "section>div>h2[class*='checkout-order']")
    private WebElementFacade orderNumber;

    @FindBy(xpath = "//button[@class='button button--medium button--navy']")
    private WebElementFacade reOrderButton;

    public void reOrderButtonClick(){
        reOrderButton.click();
    }

    public void orderConfirmationBattonClick() {
        makingAnOrderBatton.click();
    }

    public void selectFirstDeliveryPoint() {
        dropdownBottonOfDeliveryPoints.click();
        firstDeliveryPoint.click();
    }

    public void orderConfirmationButtonClick() {
        orderConfirmationButton.click();
    }

    public void orderNumberAvailable() {
        orderNumber.isVisible();
    }

    public String getOrderNumber(){
       return orderNumber.getText();
    }

    public void reOrderButton() {
        if (reOrderButton.isVisible()) {
            reOrderButton.click();
        }
    }

}
