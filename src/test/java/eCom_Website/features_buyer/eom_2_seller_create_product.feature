Feature: Seller Add Product
  @Seller
  Scenario: Seller should be able to create a product on the seller portal
    Given I logged into the seller portal
    And expand the products option from the left side bar
    And click on the Create Product option
    And input all the information in Product Information section
    And upload the image in the product price + stock section
    And input the description in the Product Description section
    And click on the Save Product button
    Then it should create a product