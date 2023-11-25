Feature: Seller Add Categories
  @Seller
  Scenario: Seller should be able to create a category
    Given Seller on the login panel
    When I logged into the seller portal
    And I click on the category option from the left sidebar
    And click on the Add category button
    And input the category name
    And upload the category image
    And click on the Add to cart button
    Then it should create a category
