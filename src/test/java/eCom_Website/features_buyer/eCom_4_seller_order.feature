Feature: Seller Confirm the order
  @Seller
  Scenario: Seller should able to confirm the order
    Given I logged into the seller portal
    And click on the Order from the menuBar
    And click on the order Action icon
    And change the Order status and click on the save button
    Then verify the order Confirmation
