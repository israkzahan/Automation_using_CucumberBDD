Feature: E-commerce Search Product
  Scenario: Buyer should be able to search a product by the product name after login
    Given Buyer navigates to the baseUrl
    When click on the searchBar
    When input the product name in the searchbar
    When click the search icon
    Then it should appear the specific product

    Scenario: Buyer should be able to search a product by the product name before login
      Given Buyer navigates to the baseUrl
      When click on the user icon from the right top corner
      When input the email and password
      When click on  the login in button
      When click on the searchBar
      When input the product name in the searchbar
      When click the search icon
      Then it should appear the specific product