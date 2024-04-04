Feature: FizzBuzz Game

  Scenario Outline:  FizzBuzz result for a given number
    Given a <number>
    When I play the Game
    Then Game should get "<expected_result>"
    Examples:
    |number |expected_result|
    |   3   |    "Fizz"     |
    |   5   |    "Buzz"     |
    |3 && 5 |   "FizzBuzz"  |
    |  7    |    "None"     |