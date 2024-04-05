Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from a wallet
    Given I have deposited <balance> in my wallet
    When I request <withdrawalAmount>
    Then <withdrawalMoney> should be dispensed
    And the balance of my wallet should be <balanceAfterWithdrawal>

    Examples:
      | balance | withdrawalAmount | withdrawalMoney | balanceAfterWithdrawal |
      | 200     | 30               | 30              | 170                    |
      | 200     | 200              | 200             | 0                      |
      | 20      | 30               | 0               | 20                     |
      | 0       | 50               | 0               | 0                      |
