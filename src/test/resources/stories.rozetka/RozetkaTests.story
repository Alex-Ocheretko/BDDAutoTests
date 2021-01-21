
Scenario: Adding items to cart
Given Customer open site
When Customer hovers the mouse cursor over "smartphones, TV and electronics" in the product catalog, which is located on the left side of the page
When Customer clicks "Smartphones"
When Customer clicks the cart on the first product
When Customer clicks the cart on the header
Then Customer sees the selected product in the cart

Scenario: log in
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer klick submit
Then Customer see '<userName>' on home page

Examples:
|   mail                   |    password        |   userName       |
|   detotaj146@econeom.com |    ttIEpExqjQmi1   |   Огунт Рагнаар  |