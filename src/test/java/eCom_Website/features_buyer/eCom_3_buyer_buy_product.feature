Feature:  Buyer Buy Products
  @Buyer
  Scenario: Buyer should be able to buy a product after searching that product
    Given Buyer navigates to the baseUrl
    When the buyer is logged in to the website
    And search for a product
    And click on the Buy Now button
    And click on the Continue to Shipping button
    And click on the Add New Address plus icon
    And input all the information
    And click on the Create Button
    And select the address
    And click on the Continue to Payment button
    And click on the Cash On Delivery
    And click on the Confirm Order button



