Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from a wallet
    Given I have deposited <balance> in my wallet
    When I request <withdrawalAmount>
    Then <withdrawalMoney> should be dispensed

    Examples:
      | balance | withdrawalAmount | withdrawalMoney |
      | 200     | 30               | 30              |
      | 200     | 200              | 200             |
      | 20      | 30               | 0               |
      | 0       | 50               | 0               |
