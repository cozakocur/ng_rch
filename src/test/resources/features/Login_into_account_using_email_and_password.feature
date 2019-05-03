Feature: As a user I would like to log in my account with my e-mail and password.

 Scenario: Verify if a user can log in with a valid username and password.

   Given user is on login page
   When user enter properly username
     |username|tester@remoo.pl|
   And user enter properly password and click enter
     |password|Tester1234|
   Then we are checking that we have successfully logged in


  Scenario: Verify that after too many attempts of wrong credentials you will receive
  a message and you will be blocked for a certain period.

    Given user is on login page
    When user enter properly username
      |username|tester@remoo.pl|
    And user enter not valid password five times
      |password|NotProperlyPassword|
    Then we are checking that we received message about blockade
