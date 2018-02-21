Feature: Login to freeCRM

  Scenario: login with valid credentials
    Given User navigated to freecrm.com
    When user enter username as "myname" and password as "test123@gmail.com"
    And user click on login button
    Then login should be successful

  Scenario: login with invalid credentials
    Given User navigated to freecrm.com
    When user enter username as "xyz" and password as "test123@gmail.com"
    And user click on login button
    Then login should not be successful
