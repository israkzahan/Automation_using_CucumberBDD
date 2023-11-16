Feature: eCommerce Buyer Login
Background:
  When click on the user icon from the right top corner
  @Buyer
  Scenario: Buyer should be able to sign in with valid credentials
    Given Buyer navigates to the baseUrl
    #When click on the user icon from the right top corner
    When input the email and password
    When click on the login button
    When it should navigate to the homepage and verify the username
    Then it's login successfully

  @Buyer
   # @Smoke
    Scenario: Buyer shouldn't be able to login to keep the email field empty with correct password
      Given Buyer navigates to the baseUrl
      #When click on the user icon from the right top corner
      When  buyer keep blank the email field but input the correct password
      When click on the login button
      Then it should throw an error message under the email field

#Data Driven
#      Scenario Outline: Buyer should be able to login with different credential
#        Given Buyer navigates to the baseUrl
#        When click on the user icon from the right top corner
#        When input the "<email>" and "<password>"
#        When click on  the login in button
#        When it should navigate to the homepage and verify the username
#        Then it's login successfully
#        Examples:
#        |email|password|
#        |israkzahan21@gmail.com|123456|
#        |israkzahan212@gmail.com|123456|
#        |israkzahan21@gmail.com|1234567|
#        |israkzahan212@gmail.com|1234567|

