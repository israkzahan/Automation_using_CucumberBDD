Feature: eCommerce Buyer Login

  Scenario: Buyer should be able to sign in with valid credentials
    Given Buyer navigates to the baseUrl
    When click on the user icon from the right top corner
    When input the email and password
    When click on  the login in button
    When it should navigate to the homepage and verify the username
    Then it's login successfully