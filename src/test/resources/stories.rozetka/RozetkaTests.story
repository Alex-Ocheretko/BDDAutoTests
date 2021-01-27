
Scenario: adding items to cart
Given Customer open site
When Customer hovers the mouse cursor over "smartphones, TV and electronics" in the product catalog, which is located on the left side of the page
And Customer clicks "Smartphones"
And Customer clicks the cart on the first product
And Customer clicks the cart on the header
Then Customer sees the selected product in the cart

Scenario: cog in
Given Customer open site
When Customer click log in
And Customer write '<mail>'
And Write '<password>'
And Customer click submit
Then Customer see '<userName>' on home page

Examples:
|   mail                   |    password        |   userName       |
|   detotaj146@econeom.com |    ttIEpExqjQmi1   |   Огунт Рагнаар  |

Scenario: checking the possibility of placing an order

Scenario: checking that the page has 60 products

Scenario: checking the possibility of sorting by price increase

Scenario: checking the work of comparing goods

Scenario: checking the possibility of opening the necessary goods

