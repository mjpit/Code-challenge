Feature: As an aspiring trader i would like to see the price data of some assets

  # Scenario is somewhat forced to find some 'table' like data
  # Also,  comparing to set min and max price might not be very smart for a volatile asset
  Scenario Outline: retrieve pricing data for assets
    Given John is visiting the trade page
    When he looks up <asset>
    Then he can see the current '<fiat>' price is between <min_price> and <max_price>
    Examples:
      | asset    | fiat | min_price | max_price |
      | Ethereum | USD  | 100.0     | 200.0     |
      | Bitcoin  | EUR  | 3000.0    | 4000.0    |
      | Ripple   | CAD  | 0.40      | 0.49      |
