Feature: Login to OrangeHRM

  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on Home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully

  @InvalidCredentialsError
    Scenario Outline: Login With Invalid Credentials
      Given User will be on Homepage
      When User enters Username as "<username_incorrect>"
      And User enters Password as "<password_incorrect>"
      Then User will get an error message from this "<username_incorrect>" and "<password_incorrect>"
      Examples:
      | username_incorrect | password_incorrect |
      | adm                | admin123           |
      | Admin              | ADMIN              |
      | admin              | ADMINS             |

  @RequiredError
    Scenario Outline: Login with Blank Credentials
      Given User will get on this Homepage
      When User will enters name as "<username_blank>"
      And User will enters Pass as "<password_blank>"
      Then User will get errors "<username_blank>" and "<password_blank>"
      Examples:
      | username_blank | password_blank |
      |              |              |
      |              | admin123     |
      | Admin        |              |


