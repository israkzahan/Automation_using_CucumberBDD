Feature: Seller Login
  @Seller
  Scenario: Seller should be able to login the seller portal
    Given Seller on the login panel
    When input the email and password of seller account
    And click on the seller login button
    Then it should navigate to the dashboard page