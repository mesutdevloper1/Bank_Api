Feature: Bank API Tests
  Scenario: Verify user authentication
    Given a valid user requests authentication
    When the API processes the request
    Then the response code should be 200
    And the token should be secure

  Scenario: Check transaction history
    Given a valid token
    When a request for transaction history is made
    Then the response code should be 200
    And the history should match the user account
