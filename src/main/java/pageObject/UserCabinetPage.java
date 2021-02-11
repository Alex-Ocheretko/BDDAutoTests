package pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserCabinetPage extends PageObject {


    @FindBy(css = "div[class='order-heading order-heading_status_new']")
    private WebElementFacade buttonOfFirstProductAtMyOrders;

    @FindBy(css = "ul[class='order-list']>li:nth-child(1) button[class='button button--medium button--gray']")
    private WebElementFacade cancelOrderButtonOfFirstProduct;

    @FindBy(css = "div[class='cancel-order__actions'] [class='button button_size_medium button_color_navy cancel-order__button']")
    private WebElementFacade yesReorderConfirmWindow;

    @FindBy(css = "ul[class='order-list']>li:nth-child(1) div[class='order-heading order-heading_status_cancel']")
    private WebElementFacade firstOrderStatus;

    @FindBy(css = "ul[class='order-list']>li:nth-child(1) button:nth-child(2)")
    private WebElementFacade reorderButtonOfFirstProduct;

    @FindBy(css = "[class='cabinet-user__name']")
    private WebElementFacade userNameOnUserCabinetPage;

    public String userNameOnUserCabinetPage() {
       return userNameOnUserCabinetPage.getText();
    }

    public boolean chevronDownButtonOfFirstProductVisibility(){
        return reorderButtonOfFirstProduct.isVisible();
    }

    public void chevronDownButtonOfFirstProductClick() {
        buttonOfFirstProductAtMyOrders.click();
    }

    public void cancelOrderButtonOfFirstProductClick() {
        cancelOrderButtonOfFirstProduct.click();
    }

    public void yesReorderConfirmWindow() {
        yesReorderConfirmWindow.click();
    }

    public void firstOrderStatusVisibility() {
        firstOrderStatus.isVisible();
    }

    public void reorderButtonOfFirstProductVisibility() {
        reorderButtonOfFirstProduct.isVisible();
    }




}
