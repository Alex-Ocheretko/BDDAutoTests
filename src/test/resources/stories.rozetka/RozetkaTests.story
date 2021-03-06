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
And Customer click cabinet button on header
Then Customer see '<userName>' on user cabinet page

Examples:
|   mail                     |    password        |   userName         |
|   oleksandr.o.ya@gmail.com |    ttIEpExqjQmi1   |  Никола Питерский  |

Scenario: incorrect credentialіs to login
Meta: @logInCheck
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
Then Customer see error message

Examples:
|   mail                   |    password        |
|   detotaj146econeom.com  |    ttIEpExqjQmi1   |
|   detotaj146             |    ttIEpExqjQmi1   |
|   @econeom.com           |    ttIEpExqjQmi1   |
|   detotaj146@econeom.com |    ttIEpExq        |


Scenario: adding items to cart
Given Customer open site
When Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page
And Customer clicks 'Smartphones'
And Customer clicks the cart on the first product
And Customer clicks the cart on the header
Then Customer sees the selected product in the cart


Scenario: checking the possibility of placing an order
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
And Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page
And Customer clicks 'Smartphones'
And Customer clicks the cart on the first product
And Customer clicks the cart on the header
And Customer presses the 'place an order' button
And Customer selects the delivery point
And Customer presses the order confirmation button
Then Customer sees the order number

Examples:
|   mail                     |    password        |
|   oleksandr.o.ya@gmail.com |    ttIEpExqjQmi1   |


Scenario: checking the possibility of order cancellation
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
And Customer click cabinet button on header
And clicks 'cancel order'
And click 'yes' in the order cancellation window to confirm
Then Customer sees a cancellation message in front of your order

Examples:
|   mail                     |    password        |
|   oleksandr.o.ya@gmail.com |    ttIEpExqjQmi1   |



Scenario: checking that the page has 60 products
Given Customer open site
When Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page
And Customer clicks 'Smartphones'
Then Customer sees 60 orders on page

Scenario: checking the possibility of sorting by price desc
Meta: @test run
Given Customer open site
When Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page
And Customer clicks 'Smartphones'
And Customer sort by price in descending order
Then goods are sorted by price desc

Scenario: checking the work of comparing goods
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
And Customer hovers the mouse cursor over 'smartphones, TV and electronics' in the product catalog, which is located on the left side of the page
And Customer clicks 'Smartphones'
And Customer clicks the compare buttons on two firsts products
And Customer clicks the compare button on header
Then Customer sees the two selected orders and can comparing them

Examples:
|   mail                     |    password        |
|   oleksandr.o.ya@gmail.com |    ttIEpExqjQmi1   |




