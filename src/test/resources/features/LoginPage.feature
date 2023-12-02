@InitiateBrowser @ClearAfter
Feature: Login to HRM Application
@smoke
  Scenario: Login with valid credentials
  Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
  When User enters username as "Admin" and password as "admin123"
  And User clicks submit button
  Then User should be able to login successfully and new page open
#
#@runThis
#  Scenario Outline: Login with invalid credentials
#    When User enters username as "<username>" and password as "<password>"
#    Then User should be able to see error message "<errorMessage>"
#    Examples:
#      | username   | password    | errorMessage                       |
#      | Admin        | admin12$$  | Invalid credentials               |
#      | admin$$     | admin123   | Invalid credentials               |
#      | abc123       | xyz$$          | Invalid credentials               |