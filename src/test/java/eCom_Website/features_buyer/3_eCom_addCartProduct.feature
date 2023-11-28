Feature: Add product on the cart
  @Buyer
  Scenario: Buyer should be able to add a product in the cart list
    Given Buyer navigates to the baseUrl
    When the buyer is logged in to the website
    And search for a product
    And click on the Add to cart button
    Then verify the product is added to cart list
