Feature:  Is it Summer? Everybody likes Summer

  Scenario Outline: Today is os isn't Summer

    Given today is <day>>
    When  I ask whether it's Summer
    Then  I should be told <answer>
    Examples:
      | day                   | answer         |
      | last day of December  | "Nope"         |
      | first day of August   | "Yes! Summer!" |
      | 10th day of June      | "Nope"         |
      | 20th day of February  | "Nope"         |
      | 5th day of May        | "Nope"         |
      | second day of January | "Nope"         |
      | 21th day of June      | "Nope"         |
      | 23th day of August    | "Yes! Summer!" |
