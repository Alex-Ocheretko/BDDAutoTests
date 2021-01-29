Meta:
@rozetka tests

Narrative:
    Test of rozetka.com feature

Scenario: log in
Meta: @logInCheck
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
Then Customer see '<userName>' on home page

Examples:
|   mail                   |    password        |   userName         |
|   detotaj146@econeom.com |    ttIEpExqjQmi1   |  Никола Питерский  |

Scenario: incorrect credentialіs to login
Meta: @logInCheck
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
Then Customer see error massege

Examples:
|   mail                   |    password        |
|   detotaj146econeom.com  |    ttIEpExqjQmi1   |
|   detotaj146             |    ttIEpExqjQmi1   |
|   @econeom.com           |    ttIEpExqjQmi1   |
|   detotaj146@econeom.com |    ttIEpExq        |


Scenario: adding items to cart
Given Customer open site
When Customer hovers the mouse cursor over "smartphones, TV and electronics" in the product catalog, which is located on the left side of the page
And Customer clicks "Smartphones"
And Customer clicks the cart on the first product
And Customer clicks the cart on the header
Then Customer sees the selected product in the cart


Scenario: checking the possibility of placing an order
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
And Customer hovers the mouse cursor over "smartphones, TV and electronics" in the product catalog, which is located on the left side of the page
And Customer clicks "Smartphones"
And Customer clicks the cart on the first product
And Customer clicks the cart on the header
And Customer presses the 'place an order' button
And Customer selects the delivery point
And Customer presses the order confirmation button
Then Customer sees the order number

Examples:
|   mail                   |    password        |   userName         |
|   detotaj146@econeom.com |    ttIEpExqjQmi1   |  Никола Питерский  |


Scenario: checking the possibility of order cancellation
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
And Customer hovers the mouse cursor over the username
And clicks 'my orders'
And clicks 'cancel order'
And click 'yes' in the order cancellation window to confirm
Then Customer sees a cancellation message in front of your order

Examples:
|   mail                   |    password        |   userName         |
|   detotaj146@econeom.com |    ttIEpExqjQmi1   |  Никола Питерский  |



Scenario: checking that the page has 60 products
Meta:  @test run
Given Customer open site
When Customer hovers the mouse cursor over "smartphones, TV and electronics" in the product catalog, which is located on the left side of the page
And Customer clicks "Smartphones"
Then Castomer sees 60 orders on page







